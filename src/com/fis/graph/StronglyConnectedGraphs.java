package com.fis.graph;

public class StronglyConnectedGraphs {

	public static void main(String[] args) {

		/// Given a directed graph, find out whether the graph is strongly
		/// connected or not.
		/// A directed graph is strongly connected if there is a path between
		/// any two pair of vertices.
		
		///Kosaraju’s DFS based simple algorithm that does two DFS traversals
		//1) Initialize all vertices as not visited.
		//2) Do a DFS traversal of graph starting from any arbitrary vertex v. If DFS traversal doesn’t visit all vertices, then return false.
		//3) Reverse all arcs (or find transpose or reverse of graph)
		//4) Mark all vertices as not-visited in reversed graph.
		//5) Do a DFS traversal of reversed graph starting from same vertex v (Same as step 2). If DFS traversal doesn’t visit all vertices, 
		//then return false. Otherwise return true.
		
		
		
		//The idea is, if every node can be reached from a vertex v, and every node can reach v, 
		//then the graph is strongly connected. In step 2, we check if all vertices are reachable 
		//from v. In step 4, we check if all vertices can reach v (In reversed graph, if all vertices are reachable from v, 
		//then all vertices can reach v in original graph).
	}

}
