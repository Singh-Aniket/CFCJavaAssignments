package com.cfcjava.assignment02;

import java.util.Scanner;

public class Q08CountingMultiples {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count=0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}