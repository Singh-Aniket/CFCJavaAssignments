package com.cfcjava.assignment01;

public class Q03GCDb {
    public static void main(String[] args) {
        int n1=10,n2=15,gcd =1;
        for (int i = 2; i<=n1 && i<=n2; i++) {
            if (n1 % i == 0 && n2 % i ==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
