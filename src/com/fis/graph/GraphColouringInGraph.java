package com.fis.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class GraphColouringInGraph {

	// Greedy Approach
	// https://www.techiedelight.com/greedy-coloring-graph/
	// Undirected Graph
	private static String[] color = { "", "BLUE", "GREEN", "RED", "YELLOW", "ORANGE", "PINK", "BLACK", "BROWN", "WHITE",
			"PURPLE", "VOILET" };

	// Greedy Approach  ///////// Alawys for undirected graph
	public static void main(String[] args) {
		GraphColouringInGraph colouringInGraph = new GraphColouringInGraph();
		Graph graph = new Graph(5);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		//graph.addEdge(graph, 1, 2);
		//graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 2, 3);
		//graph.addEdge(graph, 3, 4);
		System.out.println("Coloring of graph 1");
		colouringInGraph.greedyColoring(graph);

		System.out.println();
		Graph g2 = new Graph(5);
		g2.addEdge(g2, 0, 1);
		g2.addEdge(g2, 0, 2);
		//g2.addEdge(g2, 1, 2);
		//g2.addEdge(g2, 1, 4);
		g2.addEdge(g2, 2, 3);
		//g2.addEdge(g2, 4, 3);
		System.out.println("Coloring of graph 2 ");
		colouringInGraph.greedyColoring(g2);

	}

	void greedyColoring(Graph g) {
		Map<Integer, Integer> result = new HashMap<>();
		for (int u = 0; u < g.V; u++) {
			Set<Integer> assigned = new TreeSet<>();
			Iterator<Integer> it = g.adjListArray[u].iterator();
			while (it.hasNext()) {
				int i = it.next();
				if (result.containsKey(i)) {
					assigned.add(result.get(i));
				}
			}

			int color = 1;
			for (Integer c : assigned) {
				if (color != c) {
					break;
				}
				color++;
			}
			result.put(u, color);
		}

		for (int v = 0; v < g.V; v++) {
			System.out.println("Color assigned to vertex " + v + " is " + color[result.get(v)]);
		}

	}

}
