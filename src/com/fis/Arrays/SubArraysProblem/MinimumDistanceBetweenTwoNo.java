package com.fis.Arrays.SubArraysProblem;

public class MinimumDistanceBetweenTwoNo {

    public static void main(String args[]) {
        // Repetition allowed
        int arr[] = {2, 5, 8, 5, 4, 4, 9, 3};
        int x = 3;
        int y = 2;
        int index1 = Integer.MIN_VALUE;
        int index2 = Integer.MIN_VALUE;
        int minDistance = 0;
        //int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index1 = i;
            }
            if (arr[i] == y) {
                index2 = i;
            }
            if (index1 != Integer.MIN_VALUE && index2 != Integer.MIN_VALUE) {
                if (minDistance == 0) {
                    minDistance = Math.abs(index1 - index2);
                } else if (minDistance > Math.abs(index1 - index2)) {
                    minDistance = Math.abs(index1 - index2);
                }
                index1 = Integer.MIN_VALUE;
                index2 = Integer.MIN_VALUE;
            }
        }
        System.out.println(minDistance);
    }


}