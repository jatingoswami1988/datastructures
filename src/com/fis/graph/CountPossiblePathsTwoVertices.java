package com.fis.graph;

import java.util.Iterator;

public class CountPossiblePathsTwoVertices {

	public static int count = 0;

	public static void main(String[] args) {

		Graph g = new Graph(4);
		g.addEdge(g, 0, 1);
		// g.addEdge(g, 0, 2);
		g.addEdge(g, 0, 3);
		g.addEdge(g, 2, 0);
		g.addEdge(g, 2, 1);
		g.addEdge(g, 1, 3);
		int start = 2;
		int dest = 3;
		CountPossiblePathsTwoVertices c = new CountPossiblePathsTwoVertices();
		int path = c.getCount(g, start, dest);
		System.out.println(path);

		//pathBetweenSourceAndDestination(g, g.V, 1, 3);
		//System.out.println(count);
	}

	private int getCount(Graph g, int start, int dest) {
		boolean visited[] = new boolean[g.V];
		int path = 0;
		path = getPossiblePath(g, start, dest, visited, path);
		return path;

	}

	private int getPossiblePath(Graph g, int start, int dest, boolean[] visited, int path) {
		visited[start] = true;
		if (start == dest) {
			path++;
		} else {
			Iterator<Integer> itr = g.adjListArray[start].iterator();
			while (itr.hasNext()) {
				int i = itr.next();
				if (!visited[i]) {
					path = getPossiblePath(g, i, dest, visited, path);
				}
			}
		}
		visited[start] = false;
		return path;
	}
	
	private static void pathBetweenSourceAndDestination(Graph g, int v, int start, int destination) {
		Iterator<Integer> itr = g.adjListArray[start].iterator();
		while (itr.hasNext()) {
			int temp = itr.next();
			if (temp == destination) {
				count++;
			} else {
				pathBetweenSourceAndDestination(g, v, temp, destination);
			}
		}
	}
}
