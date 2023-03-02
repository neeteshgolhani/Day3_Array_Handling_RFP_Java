package com.bridgelabz.arrayhandling;

public class SmallestEmentsInArray {
    public static void main(String[] args) {
        int arr[] ={2344,44,445,666,876,8775};
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min)
                min=arr[i];

        }
        System.out.println(min);

    }
}
