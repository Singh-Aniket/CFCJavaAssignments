package com.cfcjava.assignment02;

import java.util.Scanner;

public class Q03UppercaseOrLowercase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        if (c >= 'a' && c <= 'z'){
            System.out.println("lowercase");
        } else if (c >= 'A' && c <= 'Z'){
            System.out.println("Uppercase");
        }
    }
}
