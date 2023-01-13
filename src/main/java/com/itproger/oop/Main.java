package com.itproger.oop;

public class Main {

    public static void main(String[] args) {

        Transport bmw = new Transport();
        bmw.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0});
        String res1 = bmw.getValues();
        System.out.println(res1);

        Transport truck = new Transport();
        truck.setValues(140.5f, 5600,"Red", new byte[] {100, 0, 100});
//        truck.speed = ;
//        truck.weight = ;
//        truck.color = ;
//        truck.coordinate = ;

        String res2 = truck.getValues();
        System.out.println(res2);
    }
}
