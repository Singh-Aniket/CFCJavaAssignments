package com.cfcjava.assignment02;

public class Q01DecimalToOctal {
    public static void main(String[] args) {
        int num = 453;
        System.out.println(decToOct(num));
    }

    private static int decToOct(int dec) {
        int oct =0, place =1;
        while (dec != 0){
            oct += dec%8 * place;// Multiplying with place for placing remainder (dec % 8) of every iteration at right position in octal
            place *= 10;
            dec /= 8;
        }
        return oct;
    }
}
