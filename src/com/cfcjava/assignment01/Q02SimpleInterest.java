package com.cfcjava.assignment01;

import java.util.Scanner;

public class Q02SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        double r = s.nextDouble();
        int t = s.nextInt();
        double si = p*r*t/100;
        System.out.println(si);
    }
}
