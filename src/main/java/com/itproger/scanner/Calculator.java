package com.itproger.scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter first number: ");
        float num2 = scanner.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Result: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);
    }
}
