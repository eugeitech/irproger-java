package com.itproger.ujsn.construction;

public class MainConstruction {

    public static void main(String[] args) {
        int a = 15, b = 16;
        char sym1 = 'A', sym2 = 'a';
        boolean isHasCar = false;
        if(!isHasCar && a == b || sym1 == sym2) {
            System.out.println("It is");
        }
        else if(a >= b) {
            System.out.println("Second test");
        } else {
            System.out.println("It isn't");
        }
    }
}
