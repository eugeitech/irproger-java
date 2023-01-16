package com.itproger.inner;

public abstract class Transport {

    protected float speed;
    protected int weight;
    protected String color;
    protected byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Object is created");
        setValues(speed, weight, color, coordinate);
    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "Oject speed: " + speed +
                "\nWeight: " + weight +
                "\nColor: " + color;
        String infoCoordinate = "\nCoordinate: ";

        for(int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + ", ";
        }
        String finalInfoCoordinate = infoCoordinate.substring(0, infoCoordinate.length()-2) + "\n";

        return info + finalInfoCoordinate;
    }

    class Engine {

        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady) {
            this.isReady = isReady;
        }

        public void info() {
            if(isReady)
                System.out.println("The engine is in perfect working order");
            else
                System.out.println("The engine isn't in perfect working order. It has " + km + " km mileage");
        }
    }
}
