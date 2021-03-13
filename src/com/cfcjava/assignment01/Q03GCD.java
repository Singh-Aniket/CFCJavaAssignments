package com.cfcjava.assignment01;

public class Q03GCD {
    public static void main(String[] args) {
        int n1=15, n2=10;
        while(n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println("GCD is : " + n1);
    }
}
