package com.fis.graph;

public class BiconnectedGraph {

	public static void main(String[] args) {
		
		//https://www.tutorialspoint.com/graph_theory/graph_theory_connectivity.htm
		
		//A graph is said to be connected if there is a path between every pair of vertex. 
		//From every vertex to any other vertex, 
		//there should be some path to traverse. That is called the connectivity of a graph.
		// A connected graph is Biconnected if it is connected and doesn’t have
		// any Articulation Point.
		// We mainly need to check two things in a graph.
		// 1) The graph is connected.
		// 2) There is not articulation point in graph.
		
		/*We start from any vertex and do DFS traversal. In DFS traversal, 
		we check if there is any articulation point. If we don’t find any articulation point,
		then the graph is Biconnected. Finally, we need to check whether 
		all vertices were reachable in DFS or not. 
		If all vertices were not reachable, then the graph is not even connected.*/

	}

}
