package com.itproger.abstraction;

public class Truck extends Transport {

    private boolean isLoaded;

    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);;
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Out object move with speed: " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }


    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        String info = "Oject speed: " + speed +
                "\nWeight: " + weight +
                "\nColor: " + color;
        String infoCoordinate = "\nCoordinate: ";
        for(int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + ", ";
        }
        String finalInfoCoordinate = infoCoordinate.substring(0, infoCoordinate.length()-2);
        return info + finalInfoCoordinate + "\n" + getLoaded() + "\n";
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String getLoaded() {
        if(isLoaded)
            return "The truck is loaded";
        else
            return "The truck isn't loaded";
    }
}
