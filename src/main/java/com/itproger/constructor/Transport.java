package com.itproger.constructor;

public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Object is created");
        setValues(speed, weight, color, coordinate);
        System.out.println(getValues());
    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());
    }

    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = "Oject speed: " + speed +
                "\nWeight: " + weight +
                "\nColor: " + color;
        String infoCoordinate = "\nCoordinate:\n";

        for(int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + ", ";
        }
        String finalInfoCoordinate = infoCoordinate.substring(0, infoCoordinate.length()-2) + "\n";

        return info + finalInfoCoordinate;
    }
}
