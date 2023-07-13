package com.fis.graph;

import java.util.Iterator;

public class CloneAnUndirectedGraph {

	public static void main(String[] args) {

		// https://www.geeksforgeeks.org/clone-an-undirected-graph/

		Graph graph = new Graph(5);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 2, 0);
		graph.addEdge(graph, 3, 4);
		System.out.print("Before Cloning DFS :-");
		 graph.dfsOfGraph(2, graph);
		Graph clonedGraph = cloneGraph(graph);
		System.out.println("");
		System.out.print("After Cloning DFS :-");
		clonedGraph.dfsOfGraph(2, clonedGraph);
	}

	private static Graph cloneGraph(Graph graph) {
		Graph cloneGraph = new Graph(graph.V);
		boolean visited[] = new boolean[graph.V];
		// for (int i = 0; i < graph.V; i++) {
		clone(graph, cloneGraph, 0, visited);
		// }
		return cloneGraph;
	}

	private static void clone(Graph graph, Graph cloneGraph, int vertex, boolean[] visited) {
		visited[vertex] = true;
		Iterator<Integer> itr = graph.adjListArray[vertex].iterator();
		while (itr.hasNext()) {
			int temp = itr.next();
			cloneGraph.addEdge(cloneGraph, vertex, temp);
			if (!visited[temp]) {
				clone(graph, cloneGraph, temp, visited);
			}
		}
	}

}
