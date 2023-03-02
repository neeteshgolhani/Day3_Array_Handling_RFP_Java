package com.bridgelabz.arrayhandling;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] ={2344,44,445,666,876,8775};
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];

        }
        System.out.println(max);
    }

}
