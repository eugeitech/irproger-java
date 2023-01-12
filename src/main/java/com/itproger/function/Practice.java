package com.itproger.function;

public class Practice {

    public static void main(String[] args) {
        byte[] nums1 = new byte[] {5, 6, 7};

        int sum1 = summaArray(nums1);
        System.out.println("Summa 1: " + sum1);
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        for(byte i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }
}
