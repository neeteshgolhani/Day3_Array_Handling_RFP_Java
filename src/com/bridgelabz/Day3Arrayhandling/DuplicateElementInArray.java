package com.bridgelabz.Day2Arrayhandling;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {12, 3434, 6, 54, 76, 12, 43, 54};
        System.out.println("Duplicate elements in given array: ");


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}