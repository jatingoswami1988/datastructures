package com.fis.graph;

import java.util.Iterator;
import java.util.Stack;

public class DetectCycleInAGraph {

	public static void main(String[] args) {
		Graph graph = new Graph(4);
		/*
		 * graph.addEdge(graph, 0, 1); graph.addEdge(graph, 0, 2); graph.addEdge(graph,
		 * 1, 2); graph.addEdge(graph, 2, 0); graph.addEdge(graph, 2, 3);
		 * graph.addEdge(graph, 3, 3);
		 */

		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 2);
		//graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 2, 0);
		graph.addEdge(graph, 2, 3);
		//graph.addEdge(graph, 3, 3);

		DetectCycleInAGraph aGraph = new DetectCycleInAGraph();

		///if (aGraph.isCyclicUsingDFS(graph)) {
		//	System.out.println("Graph contains cycle");
		//} else {
		//	System.out.println("Graph doesn't " + "contain cycle");
	   //}

		if (aGraph.isCyclic(graph)) {
			System.out.println("Graph contains cycle");
		} else {
			System.out.println("Graph doesn't " + "contain cycle");
		}
	}

	/*private boolean isCyclicUsingDFS(Graph graph) {
		boolean visited[] = new boolean[graph.V];
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		while (!stack.isEmpty()) {
			int start = stack.pop();
			if (!visited[start]) {
				System.out.print(start+" ");
				visited[start] = true;
			}
			Iterator<Integer> itr = graph.adjListArray[start].iterator();
			while (itr.hasNext()) {
				int temp = itr.next();
				if (!visited[temp]) {
					stack.push(temp);
				}
			}
		}
		return false;
	}*/

	private boolean isCyclicUtil(int vertex, boolean[] visited, boolean[] recStack, Graph graph) {
		if (recStack[vertex]) {
			return true;
		}
		if (visited[vertex]) {
			return false;
		}
		visited[vertex] = true;
		recStack[vertex] = true;
		Iterator<Integer> itr = graph.adjListArray[vertex].iterator();
		while (itr.hasNext()) {
			if (isCyclicUtil(itr.next().intValue(), visited, recStack, graph)) {
				return true;
			}
		}
		recStack[vertex] = false;
		return false;
	}

	private boolean isCyclic(Graph graph) {

		boolean[] visited = new boolean[graph.V];
		boolean[] recStack = new boolean[graph.V];

		for (int i = 0; i < graph.V; i++)
			if (isCyclicUtil(i, visited, recStack, graph))
				return true;

		return false;
	}

}
