package com.cfcjava.assignment01;

public class Q04Sequence {
    public static void main(String[] args) {
        int n=10, term =2;//n denotes number of terms
        for (int i = 0; i < n; i++) {
            term += 4*i;
            System.out.print(term + " ");
        }
    }
}
