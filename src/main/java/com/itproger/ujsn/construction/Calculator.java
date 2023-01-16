package com.itproger.ujsn.construction;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first num: ");
        double firstNum = scanner.nextInt();

        System.out.print("Enter second num: ");
        double secondNum = scanner.nextInt();

        System.out.print("Action: ");
        String empty = scanner.nextLine();
        String action = scanner.nextLine();

        double res;

        switch (action) {
            case "+":
                res = firstNum + secondNum;
                System.out.println(res);
                break;
            case "-":
                res = firstNum - secondNum;
                System.out.println(res);
                break;
            case "*":
                res = firstNum * secondNum;
                System.out.println(res);
                break;
            case "/":
                if(secondNum == 0){
                    System.out.println("Error");
                } else {
                    res = firstNum / secondNum;
                    System.out.println(res);
                }
                break;
            default:
                System.out.println("You enter something other than we need");

        }
    }
}
