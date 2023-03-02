package com.bridgelabz.Day2Arrayhandling;

public class SortingArrayAssendingOrder {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 8, 4, 2, 7};

        // selection sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // print the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}