package com.cfcjava.assignment01;

public class Q06Reverse {
    public static void main(String[] args) {
        int num = 47589;
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
