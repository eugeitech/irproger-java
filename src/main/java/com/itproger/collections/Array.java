package com.itproger.collections;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);

        System.out.println(numbers.size());

        System.out.println(numbers.get(2));
        numbers.remove(2);
        //numbers.clear();

        for(Integer element : numbers) {
            System.out.println(element);
        }
    }
}
