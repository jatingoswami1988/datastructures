package com.fis.graph;

public class DetectCycleDirectGraphUsingColors {

	static int WHITE = 0, // Vertex not processed
			       GRAY = 1, // Vertex is processed but all its Desc not processed
			       BLACK = 2;// Vertex and all its descendants are processed

	public static void main(String[] args) {

		Graph graph = new Graph(4);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 2, 0);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 3);
		if (isCyclic(graph))
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");

	}

	private static boolean isCyclic(Graph g) {
		int[] color = new int[g.V];
		for (int i = 0; i < g.V; i++) {
			color[i] = WHITE;
		}

		for (int i = 0; i < g.V; i++) {
			if (color[i] == WHITE) { // Not Visited
				if (DFSUtil(g, i, color) == true)
					return true;
			}
		}
		return false;
	}

	static boolean DFSUtil(Graph g, int u, int[] color) {
		color[u] = GRAY;
		for (Integer in : g.adjListArray[u]) {
			if (color[in] == GRAY)
				return true;
			if (color[in] == WHITE && DFSUtil(g, in, color) == true)
				return true;
		}
		color[u] = BLACK;
		return false;
	}

}
