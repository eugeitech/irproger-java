package com.itproger.ujsn.construction;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Default");
        }
    }
}
