package com.itproger.oop;

public class Examples {

    public static void main(String[] args) {

        String[] array = new String[] {"A", "B", "C"};

        String data = "";
        for(int i = 0; i < array.length; i++) {
            data += array[i] + ", ";
        }
        String result = data.substring(0, data.length()-2) + ".";

        System.out.println(result);
    }
}
