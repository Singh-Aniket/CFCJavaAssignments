package com.cfcjava.assignment02;

import java.util.Scanner;

public class Q02SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        char ch = s.next().charAt(0);
        switch (ch){
            case '+' :
                System.out.println(n1+n2);
                break;
            case '-' :
                System.out.println(n1-n2);
                break;
            case '*' :
                System.out.println(n1*n2);
                break;
            case '/' :
                System.out.println(n1/n2);// n1/n2 for quotient | (float) n1/n2 for actual result
                break;
            case '%' :
                System.out.println(n1%n2);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
