package com.fis.graph;

import java.util.Arrays;
import java.util.Iterator;

public class GraphColouringInGraph2 {
	// Greedy Approach
	//https://www.techiedelight.com/greedy-coloring-graph/
	public static void main(String[] args) {
		GraphColouringInGraph colouringInGraph = new GraphColouringInGraph();
		Graph graph = new Graph(5);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 4);
		System.out.println("Coloring of graph 1");
		colouringInGraph.greedyColoring(graph);

		System.out.println();
		Graph g2 = new Graph(5);
		g2.addEdge(g2, 0, 1);
		g2.addEdge(g2, 0, 2);
		g2.addEdge(g2, 1, 2);
		g2.addEdge(g2, 1, 4);
		g2.addEdge(g2, 2, 4);
		g2.addEdge(g2, 4, 3);
		System.out.println("Coloring of graph 2 ");
		colouringInGraph.greedyColoring(g2);

	}

	// Assigns colors (starting from 0) to all vertices and
	// prints the assignment of colors
	void greedyColoring(Graph g) {
		int result[] = new int[g.V];

		// Initialize all vertices as unassigned
		Arrays.fill(result, -1);

		// Assign the first color to first vertex
		result[0] = 0;

		// A temporary array to store the available colors. False
		// value of available[cr] would mean that the color cr is
		// assigned to one of its adjacent vertices
		boolean available[] = new boolean[g.V];
		// Initially, all colors are available
		Arrays.fill(available, true);
		//available[0] = false;
		// Assign colors to remaining V-1 vertices
		for (int u = 1; u < g.V; u++) {
			// Process all adjacent vertices and flag their colors
			// as unavailable
			Iterator<Integer> it = g.adjListArray[u].iterator();
			while (it.hasNext()) {
				int i = it.next();
				if (result[i] != -1)
					available[result[i]] = false;
			}

			// Find the first available color
			int cr;
			for (cr = 0; cr < g.V; cr++) {
				if (available[cr])
					break;
			}

			result[u] = cr; // Assign the found color

			// Reset the values back to true for the next iteration
			Arrays.fill(available, true);
		}

		// print the result
		for (int u = 0; u < g.V; u++)
			System.out.println("Vertex " + u + " --->  Color " + result[u]);
	}

}
