package com.fis.Arrays.SubArraysProblem;

import java.util.Arrays;
import java.util.PriorityQueue;

import com.fis.Arrays.ArrangementDearrangement.DisplayArray;

public class kthLargestSumContiguousSubarray {
	
	
	public static void main(String args[]) {
		int a[] = new int[]{ 10, -10, 20, -40 };
        int n = a.length;
        int k = 6;
 
        // calls the function to find out the
        // k-th largest sum
        System.out.println(kthLargestSum(a, n, k));
	}
	
	static int kthLargestSum(int arr[], int n, int k)
    {
        // array to store predix sums
		
		//10, -10, 20, -40
        int sum[] = new int[n + 1];
        sum[0] = 0;
        sum[1] = arr[0];
        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i - 1] + arr[i - 1];
        }
         
        // priority_queue of min heap
        PriorityQueue<Integer> Q = new PriorityQueue<Integer> ();
         
        // loop to calculate the contiguous subarray
        // sum position-wise
        for (int i = 1; i <= n; i++)
        {
     
            // loop to traverse all positions that
            // form contiguous subarray
             for (int j = i; j <= n; j++)
            {
                // calculates the contiguous subarray
                // sum from j to i index
                int x = sum[j] - sum[i - 1];
     
                // if queue has less then k elements,
                // then simply push it
                if (Q.size() < k)
                    Q.add(x);
     
                else
                {
                    // it the min heap has equal to
                    // k elements then just check
                    // if the largest kth element is
                    // smaller than x then insert
                    // else its of no use
                    if (Q.peek() < x)
                    {
                        Q.poll();
                        Q.add(x);
                    }
                }
            }
        }
         
        // the top element will be then kth
        // largest element
        return Q.poll();
    }
     

	/*public static void main(String[] args) {

		// print subArrays
		// Recursion >
		// https://www.geeksforgeeks.org/generating-subarrays-using-recursion/
		//https://www.geeksforgeeks.org/k-th-largest-sum-contiguous-subarray/
		
		Input: a[] = {20, -5, -1} 
           k = 3
			Output: 14
			Explanation: All sum of contiguous 
			subarrays are (20, 15, 14, -5, -6, -1) 
			so the 3rd largest sum is 14.
			
			Input: a[] = {10, -10, 20, -40} 
			    k = 6
			Output: -10 
			Explanation: The 6th largest sum among 
			sum of all contiguous subarrays is -10.
		int arr[] = { 1, 2, 3 };

		// {1} , {2} , {3} , {4} , {1,2} , {1,2,3} , {1,2,3,4} , {2,3} , {2,3,4} , {3,4}
		// > n*(n+1)/2

		// {1,2,3} > {1} , {2} , {3} , {1,2} , {1,2,3} , {2,3} > 3 * 4/2 > 6

		int tempArr[] = new int[arr.length * (arr.length + 1) / 2];
		int sum = 0;
		int temp = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("");
			for (j = i; j < arr.length; j++) {
				System.out.println("");
				sum = 0;
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
					sum = sum + arr[k];
					tempArr[j + temp] = sum;
				}
			}
			// j = temp;
			temp = j;
		}

		// Arrays.sort(tempArr);
		// System.out.println();
		// DisplayArray.displayArray(tempArr);

	}*/

}
