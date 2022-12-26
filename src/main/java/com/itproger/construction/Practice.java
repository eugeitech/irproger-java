package com.itproger.construction;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter role: ");
        String role = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if(role.equals("Admin") && password.equals("1234")) {
            System.out.println("All users");
        } else {
            System.out.println("Hi, what's your name?");
            String name = scanner.nextLine();
        }
    }
}
