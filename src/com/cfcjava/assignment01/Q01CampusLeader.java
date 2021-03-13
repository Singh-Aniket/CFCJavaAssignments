package com.cfcjava.assignment01;

import java.util.Scanner;

public class Q01CampusLeader {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int credits = s.nextInt();
        if(credits>= 7500){
            System.out.println("Tera Leader");
        } else if(credits >=6000) {
            System.out.println("Giga Leader");
        } else if(credits >= 4500) {
            System.out.println("Mega Leader");
        } else{
            System.out.println("Rising Star");
        }
    }
}
