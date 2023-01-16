package com.itproger.ujsn.collections;

import java.util.LinkedList;

public class Linked {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(6);

        //remove, get, clear

        for(Integer element : numbers)
            System.out.println(element);
    }
}
