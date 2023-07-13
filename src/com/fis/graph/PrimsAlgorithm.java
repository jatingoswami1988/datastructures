package com.fis.graph;

import java.util.LinkedList; 
import java.util.TreeSet; 
import java.util.Comparator; 

public class PrimsAlgorithm { 
	class Node1 { 

		int dest; 
		int weight; 
		Node1(int a, int b) 
		{ 
			dest = a; 
			weight = b; 
		} 
	} 
	static class Graph { 

		int V; 
		LinkedList<Node1>[] adj; 
		Graph(int e) 
		{ 
			V = e; 
			adj = new LinkedList[V]; 
			for (int o = 0; o < V; o++) 
				adj[o] = new LinkedList<>(); 
		} 
	} 

	class node { 
		int vertex; 
		int key; 
	} 

	class comparator implements Comparator<node> { 
		@Override
		public int compare(node node0, node node1) 
		{ 
			return node0.key - node1.key; 
		} 
	} 

	void addEdge(Graph graph, int src, int dest, int weight) 
	{ 

		Node1 node0 = new Node1(dest, weight); 
		Node1 node = new Node1(src, weight); 
		graph.adj[src].addLast(node0); 
		graph.adj[dest].addLast(node); 
	} 

	void prims_mst(Graph graph) 
	{ 

		// Whether a vertex is in PriorityQueue or not 
		Boolean[] mstset = new Boolean[graph.V]; 
		node[] e = new node[graph.V]; 
		// Stores the parents of a vertex 
		int[] parent = new int[graph.V]; 
		for (int o = 0; o < graph.V; o++) 
			e[o] = new node(); 
		for (int o = 0; o < graph.V; o++) { 
			// Initialize to false 
			mstset[o] = false; 
			// Initialize key values to infinity 
			e[o].key = Integer.MAX_VALUE; 
			e[o].vertex = o; 
			parent[o] = -1; 
		} 
		// Include the source vertex in mstset 
		mstset[0] = true; 
		// Set key value to 0 
		// so that it is extracted first 
		// out of PriorityQueue 
		e[0].key = 0; 
		// Use TreeSet instead of PriorityQueue as the remove function of the PQ is O(n) in java. 
		TreeSet<node> queue = new TreeSet<node>(new comparator()); 
		for (int o = 0; o < graph.V; o++) 
			queue.add(e[o]); 
		// Loops until the queue is not empty 
		while (!queue.isEmpty()) { 
			// Extracts a node with min key value 
			node node0 = queue.pollFirst(); 
			// Include that node into mstset 
			mstset[node0.vertex] = true; 
			// For all adjacent vertex of the extracted vertex V 
			for (Node1 iterator : graph.adj[node0.vertex]) { 
				// If V is in queue 
				if (mstset[iterator.dest] == false) { 
					// If the key value of the adjacent vertex is 
					// more than the extracted key 
					// update the key value of adjacent vertex 
					// to update first remove and add the updated vertex 
					if (e[iterator.dest].key > iterator.weight) { 
						queue.remove(e[iterator.dest]); 
						e[iterator.dest].key = iterator.weight; 
						queue.add(e[iterator.dest]); 
						parent[iterator.dest] = node0.vertex; 
					} 
				} 
			} 
		} 

		for (int o = 1; o < graph.V; o++) 
			System.out.println(parent[o] + " "+ "-"+ " " + o); 
	} 

	public static void main(String[] args) 
	{ 
		int V = 9; 
		Graph graph = new Graph(V); 
		PrimsAlgorithm e = new PrimsAlgorithm(); 
		e.addEdge(graph, 0, 1, 4); 
		e.addEdge(graph, 0, 7, 8); 
		e.addEdge(graph, 1, 2, 8); 
		e.addEdge(graph, 1, 7, 11); 
		e.addEdge(graph, 2, 3, 7); 
		e.addEdge(graph, 2, 8, 2); 
		e.addEdge(graph, 2, 5, 4); 
		e.addEdge(graph, 3, 4, 9); 
		e.addEdge(graph, 3, 5, 14); 
		e.addEdge(graph, 4, 5, 10); 
		e.addEdge(graph, 5, 6, 2); 
		e.addEdge(graph, 6, 7, 1); 
		e.addEdge(graph, 6, 8, 6); 
		e.addEdge(graph, 7, 8, 7); 
		e.prims_mst(graph); 
	} 
} 
 
