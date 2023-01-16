package com.itproger.ujsn.modifier;

import com.itproger.ujsn.modifier.db.DB;

public class Main {

    public static void main(String[] args) {

        final int count = 10;


        Person obj1 = new Person();
        Person.getCount();
        Person obj2 = new Person();
        Person.getCount();
        Person obj3 = new Person();
        Person.getCount();
        Person obj4 = new Person();
        Person.getCount();


//        Person person = new Person();
//        Person.count = 5;
//        System.out.println(Person.count);

        DB db = new DB();

//        info("Hello World");
    }

    public static final void info() {
        System.out.println("Hello");
    }

    public static void info(String word) {
        System.out.println(word + "!");
    }

    public static void info(String word, float world2) {
        System.out.println(word + "!");
    }
}
