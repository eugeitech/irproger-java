package com.itproger.ujsn.modifier;

public final class Person {

    private static int count;
    public int health;

    public Person() {
        count++;
    }

    public static void getCount() {
        System.out.println("Quantity: " + count);
    }
}
