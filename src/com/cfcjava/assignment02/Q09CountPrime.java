package com.cfcjava.assignment02;

public class Q09CountPrime {
    public static void main(String[] args) {
        int[] arr = {4,5,7,9,12,23,25,10};
        int cprime = 0;
        for (int i = 0; i < arr.length; i++) {
            if( isPrime(arr[i]) ){
                cprime++;
            }
        }
        System.out.println(cprime);
    }

    private static boolean isPrime(int n) {
        if(n<2)
            return false;
        for (int i = 2; i*i <= n ; i++) { //running i till root n i.e. '<='
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
