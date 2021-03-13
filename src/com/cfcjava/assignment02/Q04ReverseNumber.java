package com.cfcjava.assignment02;
// same as Q06 in Assignment 01
public class Q04ReverseNumber {
    public static void main(String[] args) {
        int num = 38105;
        System.out.println(reverseNum(num));
    }

    private static int reverseNum(int num) {
        int rem, rev=0;
        while (num!=0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
