package com.itproger.ujsn.scanner;

import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hi, " + userName);

        int num1 = scanner.nextInt();
        byte num2 = scanner.nextByte();
        boolean b = scanner.nextBoolean();
        float num3 = scanner.nextFloat();
    }
}
