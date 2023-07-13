package com.fis.graph;

public class DetectingNegativeCycleUsingFloydWarshall {
	
	public static int V = 4;

	public static void main(String args[]) {
		
		         /*10
	       (0)------->(3)
	        |                /|\
	     5 |                 |
	        |                 | 1
	       \|/               |
	       (1)------->(2)
	            3       */

		//Note that the value of graph[i][j] is 0 if i is equal to j 
	//	And graph[i][j] is INF (infinite) if there is no edge from vertex i to j.
		//Input graph
		
		int graph[][] = { 
				                  { 0, 5, 99999, 10 },
				                  { 99999, 0, 3, 99999 },
				                  { 99999, 99999, 0, 1 },
				                  { 99999, 99999, 99999, 0 }
				                                                               };
		    /*            Output:
			Shortest distance matrix
			      0        5        8       9
			    INF      0        3       4
			    INF    INF      0        1
			    INF    INF    INF      0*/

		printShortestPathFloydWarshallAlgo(graph);
			
		
	}

	private static void printShortestPathFloydWarshallAlgo(int[][] graph) {
		
		int dist[][] = new int[V][V];
		int i, j, k;
		/* Initialize the solution matrix same as input graph matrix. 
        Or we can say the initial values of shortest distances 
        are based on shortest paths considering no intermediate 
        vertex. */		
		for (i = 0; i < V; i++) 
            for (j = 0; j < V; j++) 
                dist[i][j] = graph[i][j];
		/* Add all vertices one by one to the set of intermediate 
        vertices. 
       ---> Before start of an iteration, we have shortest 
            distances between all pairs of vertices such that 
            the shortest distances consider only the vertices in 
            set {0, 1, 2, .. k-1} as intermediate vertices. 
       ----> After the end of an iteration, vertex no. k is added 
             to the set of intermediate vertices and the set 
             becomes {0, 1, 2, .. k} */
		
		for (k = 0; k < V; k++) 
        { 
            // Pick all vertices as source one by one 
            for (i = 0; i < V; i++) 
            { 
                // Pick all vertices as destination for the 
                // above picked source 
                for (j = 0; j < V; j++) 
                { 
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
                } 
            } 
        } 
		
		// Print the shortest distance matrix 
        printSolution(dist); 
		
	}

	private static void printSolution(int[][] dist) {
		for (int i=0; i<V; ++i) 
        { 
            for (int j=0; j<V; ++j) 
            { 
                if (dist[i][j]==99999) 
                    System.out.print(99999); 
                else
                    System.out.print(dist[i][j]+"   "); 
            } 
            System.out.println(); 
        } 
		
	}

}
