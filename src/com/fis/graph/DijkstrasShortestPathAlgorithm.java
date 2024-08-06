package com.fis.graph;

import java.util.ArrayList;
import java.util.List;

class IPair {

	private int first, second;

	public IPair(int v, int weight) {
		this.first = v;
		this.second = weight;
	}

}

class DGraph {

	private int V = 0;
	private List<List<IPair>> adj;

	public DGraph(int V) {
		this.V = V;
		adj = new ArrayList<>();
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
	}

	public void addEdge(int u, int v, int weight) {

		adj.get(u).add(new IPair(v, weight));

	}

	public void shortestPath(int source) {

		
		
	}

}

public class DijkstrasShortestPathAlgorithm {

	public static void main(String[] args) {

		int V = 9;

		DGraph g = new DGraph(V);

		g.addEdge(0, 1, 4);
		g.addEdge(0, 7, 8);
		g.addEdge(1, 2, 8);
		g.addEdge(1, 7, 11);
		g.addEdge(2, 3, 7);
		g.addEdge(2, 8, 2);
		g.addEdge(2, 5, 4);
		g.addEdge(3, 4, 9);
		g.addEdge(3, 5, 14);
		g.addEdge(4, 5, 10);
		g.addEdge(5, 6, 2);
		g.addEdge(6, 7, 1);
		g.addEdge(6, 8, 6);
		g.addEdge(7, 8, 7);

		g.shortestPath(0);

	}

}
