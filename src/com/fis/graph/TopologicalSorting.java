package com.fis.graph;

import java.util.Iterator;
import java.util.Stack;

public class TopologicalSorting {

	public static void main(String[] args) {
		//https://www.interviewcake.com/concept/java/topological-sort
		Graph g = new Graph(6);
		g.addEdge(g, 5, 2);
		g.addEdge(g, 5, 0);
		g.addEdge(g, 4, 0);
		g.addEdge(g, 4, 1);
		g.addEdge(g, 2, 3);
		g.addEdge(g, 3, 1);
		System.out.println("Following is a Topological " + "sort of the given graph");
		TopologicalSorting sorting = new TopologicalSorting();
		sorting.topologicalSorting(g);
	}

	public void topologicalSorting(Graph g) {

		boolean visited[] = new boolean[g.V];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i <g.V; i++) {
			if(!visited[i]) {
			   topologicalSortingUtil(g, i, visited, s);
			}
		}
		
		while (!s.isEmpty())  {
            System.out.print(s.pop() + " ");
		}
	}

	private void topologicalSortingUtil(Graph g, int start, boolean[] visited, Stack<Integer> stack) {
		visited[start] = true;
		Iterator<Integer> itr = g.adjListArray[start].iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (!visited[i]) {
				topologicalSortingUtil(g, i, visited, stack);
			}

		}
		stack.push(start);
	}

}
