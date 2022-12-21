package com.itproger;

public class Main {

    public static void main(String[] args) {
        // Comment
        System.out.println("Hello\\ \"\n\tWorld!");

        /*
        Comment
         */

        int age = -5;
        System.out.println("Age: " + age + ".");
        age = 5;
        System.out.println(age);

        byte ageInByte = 45;
        short num = 1280;
        int num2 = 56;
        long num3 = 4454;

        // byte = -128 to 127 (1b)
        // short = -32'768 to 21'767 (2b)
        // int = -2'147'483'648 to 2'147'483'647 (4b)
        // long = -9'223'372'036'854'775'808 to 9'223'372'036'854'775'807

        float num4 = 3.9f;
        double num5 = 4.0d;

        char ch = '5';
        String userName = "Bob";
        System.out.println(userName);

        boolean isHappy = false;
    }
}
