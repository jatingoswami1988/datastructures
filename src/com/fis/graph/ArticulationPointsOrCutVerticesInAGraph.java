package com.fis.graph;

import java.util.Iterator;

public class ArticulationPointsOrCutVerticesInAGraph {
	//https://algorithms.tutorialhorizon.com/articulation-points-or-cut-vertices-in-a-graph/
	public static int time = 0;
	static final int NIL = -1;

	public static void main(String args[]) {
		Graph graph = new Graph(5);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 0);
		graph.addEdge(graph, 2, 1);
		graph.addEdge(graph, 0, 3);
		graph.addEdge(graph, 3, 4);
		articulationPoint(graph);
		System.out.println();
	}

	// A recursive function that find articulation points using DFS
	// u --> The vertex to be visited next
	// visited[] --> keeps tract of visited vertices
	// disc[] --> Stores discovery times of visited vertices
	// parent[] --> Stores parent vertices in DFS tree
	// ap[] --> Store articulation points
	public static void APUtil(Graph graph, int u, boolean visited[], int disc[], int low[], int parent[],boolean ap[]) {
		// Count of children in DFS Tree
		int children = 0;
		// Mark the current node as visited
		visited[u] = true;
		// Initialize discovery time and low value
		disc[u] = low[u] = ++time;
		// Go through all vertices adjacent to this
		Iterator<Integer> i = graph.adjListArray[u].iterator();
		while (i.hasNext()) {
			int v = i.next(); // v is current adjacent of u
			// If v is not visited yet, then make it a child of u
			// in DFS tree and recur for it
			if (!visited[v]) {
				children++;
				parent[v] = u;
				APUtil(graph, v, visited, disc, low, parent, ap);
				// Check if the subtree rooted with v has a connection to
				// one of the ancestors of u
				low[u] = Math.min(low[u], low[v]);
				// u is an articulation point in following cases
				// (1) u is root of DFS tree and has two or more children.
				if (parent[u] == NIL && children > 1) {
					ap[u] = true;
				}
				// (2) If u is not root and low value of one of its child
				// is more than discovery value of u.
				if (parent[u] != NIL && low[v] >= disc[u]) {
					ap[u] = true;
				}
			}

			// Update low value of u for parent function calls.
			else if (v != parent[u]) {
				low[u] = Math.min(low[u], disc[v]);
			}
		}
	}

	public static void articulationPoint(Graph graph) {
		boolean visited[] = new boolean[graph.V];
		int disc[] = new int[graph.V];
		int low[] = new int[graph.V];
		int parent[] = new int[graph.V];
		boolean ap[] = new boolean[graph.V];
		for (int i = 0; i < graph.V; i++) {
			parent[i] = NIL;
			visited[i] = false;
			ap[i] = false;
		}

		for (int i = 0; i < graph.V; i++)
			if (visited[i] == false) {
				APUtil(graph, i, visited, disc, low, parent, ap);
			}

		for (int i = 0; i < graph.V; i++) {
			if (ap[i] == true) {
				System.out.print(i + " ");
			}
		}
	}

}
