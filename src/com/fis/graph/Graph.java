package com.fis.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	public int V;
	public LinkedList<Integer> adjListArray[];

	@SuppressWarnings("unchecked")
	public Graph(int V) {
		this.V = V;

		adjListArray = new LinkedList[V];

		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<>();
		}
	}

	public void addEdge(Graph graph, int src, int dest) {
		graph.adjListArray[src].add(dest);
		graph.adjListArray[dest].add(src); // undirectedGraph
	}

	public void printGraph(Graph graph) {
		for (int v = 0; v < graph.V; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer pCrawl : graph.adjListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}

	public Graph getTranspose() {
		Graph g = new Graph(V);
		for (int v = 0; v < V; v++) {
			Iterator<Integer> itr = adjListArray[v].listIterator();
			while (itr.hasNext()) {
				Integer i = itr.next();
				g.adjListArray[i].add(v);
			}
		}
		return g;
	}
	
	public  void dfsOfGraph(int start, Graph g) {
		boolean visited[] = new boolean[g.V];
		Stack<Integer> stack = new Stack<>();
		stack.add(start);
		while (!stack.isEmpty()) {
			start = stack.pop();
			if (!visited[start]) {
				visited[start] = Boolean.TRUE;
				System.out.print(start + " ");
			}
			Iterator<Integer> itr = g.adjListArray[start].iterator();
			while (itr.hasNext()) {
				Integer i = itr.next();
				if (!visited[i]) {
					stack.add(i);
				}
			}
		}

	}

	public static void main(String args[]) {
		int V = 5;
		Graph graph = new Graph(V);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 4);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 4);

		graph.printGraph(graph);
	}
}
