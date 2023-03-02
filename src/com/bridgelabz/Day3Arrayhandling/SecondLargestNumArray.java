package com.bridgelabz.Day2Arrayhandling;

public class SecondLargestNumArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 8, 4, 2, 7};

        // initialize largest and second largest variables
        int largest = arr[0];
        int secondLargest = arr[0];

        // loop through array to find largest and second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // print the second largest number
        System.out.println("Second largest number in the array is: " + secondLargest);
    }
    }
