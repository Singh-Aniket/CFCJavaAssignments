package com.cfcjava.assignment02;

import java.util.Scanner;

public class Q07LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int lcm =a*b; //a*b is always the lcm of co-prime numbers
        // To check a lcm less than a*b, continue checking if a multiple of a is divisible by b or not, i.e. (a*i) % b == 0
        // If yes, it is the lowest common multiple

//        for (int i = 1; i <= a || i <= b; i++) {// Iterating till i is less than either of (a,b) i.e. max(a,b)
//            // as we don't know which one is greater in (a,b) we need to run a*i all the way till a*b [eg. (9,99) -> (9*11 % 99) == 0 -> 99 is LCM]
//            if ((a*i)%b == 0){
//                lcm = a*i;
//                break;
//            }
//        }

        //An optimised solution to run the loop till min(a,b) only
        for (int i = 1; i <= Math.min(a,b) ; i++) {
            if((Math.max(a,b) * i) % Math.min(a,b) == 0){
                lcm = Math.max(a,b) * i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
