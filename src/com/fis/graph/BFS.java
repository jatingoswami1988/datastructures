package com.fis.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {

	public static void main(String[] args) {
		int V = 5;
		Graph g = new Graph(V);
		g.addEdge(g, 0, 1);
		g.addEdge(g, 0, 2);
		g.addEdge(g, 1, 2);
		//g.addEdge(g, 3, 2);
		g.addEdge(g, 2, 3);
		g.addEdge(g, 2, 0);
		g.addEdge(g, 3, 3);
		BFS bfs = new BFS();
		System.out.print("BFS > ");
		bfs.BFSOfGraph(2, g);
		System.out.println(" ");
		System.out.print("DFS > ");
		bfs.dfsOfGraph(2, g);
		System.out.println(" ");
		//System.out.print("DFS Recusrive > ");
		//bfs.DFSoFGraphRecursive(2, g);
	}

	private void BFSOfGraph(int start, Graph g) {

		boolean visited[] = new boolean[g.V];
		Queue<Integer> queue = new LinkedList<>(); // Queue in BFS
		queue.add(start);
		while (!queue.isEmpty()) {
			start = queue.poll(); //Retrieves and removes the head (first element) of this list.
			System.out.print(start + " ");
			visited[start] = Boolean.TRUE;
			Iterator<Integer> itr = g.adjListArray[start].iterator();
			while (itr.hasNext()) {

				int i = itr.next();
				if (!visited[i]) {
					queue.add(i);
					visited[i] = Boolean.TRUE;
				}
			}
		}
	}

	private void DFSoFGraphRecursive(int start, Graph g) {
		boolean visited[] = new boolean[g.V];
		DFSUtility(g, start, visited);

	}

	private void DFSUtility(Graph g, int start, boolean[] visited) {

		visited[start] = true;
		System.out.print(start + " ");
		Iterator<Integer> itr = g.adjListArray[start].iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (!visited[i]) {
				DFSUtility(g, i, visited);
			}
		}

	}

	public  void dfsOfGraph(int start, Graph g) {
		boolean visited[] = new boolean[g.V];
		Stack<Integer> stack = new Stack<>();
		stack.add(start);
		while (!stack.isEmpty()) {
			start = stack.pop();
			if (!visited[start]) {
				visited[start] = Boolean.TRUE;
				System.out.print(start + " ");
			}
			Iterator<Integer> itr = g.adjListArray[start].iterator();
			while (itr.hasNext()) {
				Integer i = itr.next();
				if (!visited[i]) {
					stack.add(i);
					//visited[i] = true;
				}
			}
		}

	}

	/*public void BFSOfGraph(int start, Graph g) {
		boolean visited[] = new boolean[g.V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[start] = Boolean.TRUE;
		queue.add(start);
		while (queue.size() != 0) {
			start = queue.poll();
			System.out.print(start + " ");
			Iterator<Integer> itr = g.adjListArray[start].iterator();
			while (itr.hasNext()) {
				Integer i = itr.next();
				if (!visited[i]) {
					visited[i] = Boolean.TRUE;
					queue.add(i);
				}
			}
		}

	}*/

}
