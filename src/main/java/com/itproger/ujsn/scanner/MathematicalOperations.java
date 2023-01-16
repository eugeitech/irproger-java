package com.itproger.ujsn.scanner;

import java.util.Scanner;

public class MathematicalOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = 50, num2 = 33;
        float res = num1 % num2;

        res = res + 10;
        //or
        res += 10;

        res = res + 1;
        //or
        res += 1;
        //or
        res ++;
        //or
        res --; //minus 1
        System.out.println("Result: " + res);
    }
}
