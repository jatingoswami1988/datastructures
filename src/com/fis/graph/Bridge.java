package com.fis.graph;

import java.util.Iterator;

public class Bridge {

	static private int V = 5;
	static int time = 0;
	
	public static void main(String[] args) {
		System.out.println("Bridges in first graph ");
		Graph g1 = new Graph(5);
		g1.addEdge(g1, 1, 0);
		g1.addEdge(g1, 0, 2);
		g1.addEdge(g1, 2, 1);
		//g1.addEdge(g1, 0, 3);
		//g1.addEdge(g1, 3, 4);
		bridge(g1);
		System.out.println();

	}

	public static void bridge(Graph g1) {
		boolean visited[] = new boolean[V];
		int disc[] = new int[V];
		int low[] = new int[V];
		int parent[] = new int[V];

		for (int i = 0; i < V; i++) {
			parent[i] = -1;
			visited[i] = false;
		}

		for (int i = 0; i < V; i++) {
			if (visited[i] == false) {
				bridgeUtil(i, visited, disc, low, parent, g1);
			}
		}
	}

	public static void bridgeUtil(int u, boolean visited[], int disc[], int low[], int parent[], Graph g1) {

		// Mark the current node as visited
		visited[u] = true;

		// Initialize discovery time and low value
		disc[u] = low[u] = ++time;

		// Go through all vertices adjacent to this
		Iterator<Integer> i = g1.adjListArray[u].iterator();
		while (i.hasNext()) {
			int v = i.next(); // v is current adjacent of u

			// If v is not visited yet, then make it a child
			// of u in DFS tree and recur for it.
			// If v is not visited yet, then recur for it
			if (!visited[v]) {
				parent[v] = u;
				bridgeUtil(v, visited, disc, low, parent, g1);

				// Check if the subtree rooted with v has a
				// connection to one of the ancestors of u
				low[u] = Math.min(low[u], low[v]);

				// If the lowest vertex reachable from subtree
				// under v is below u in DFS tree, then u-v is
				// a bridge
				if (low[v] > disc[u])
					System.out.println(u + " " + v);
			}

			// Update low value of u for parent function calls.
			else if (v != parent[u])
				low[u] = Math.min(low[u], disc[v]);
		}
	}

}
