package com.cfcjava.assignment02;

import java.util.Scanner;

public class Q06GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int gcd =1;
        for (int i = 1; i <= a && i <= b; i++) {// i <= min(a,b)
            if (a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
