package com.itproger.inhetirance;

public class Truck extends Transport {

    private boolean isLoaded;

    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
        System.out.println(getValues());
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        System.out.println(getValues());
        this.isLoaded = isLoaded;
    }


    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public void getLoaded() {
        if(isLoaded)
            System.out.println("The truck is loaded");
        else
            System.out.println("The truck isn't loaded");
    }
}
