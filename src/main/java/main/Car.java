package main;

public class Car {
    private String brand;
    private String model;
    private int speed;
    
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void status() {
        System.out.println("Auto: "+ brand + " " + model + ", Nopeus: " + speed + " km/h");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate(int value) {
        if (value < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        } else {
            speed = speed + value;
        }
    }

    public void decelerate(int value){
        if (value < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        } else {
            speed = speed - value;
            if (speed < 0) {
                speed = 0;
            }
        }
    }
}
