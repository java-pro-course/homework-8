package com.company;

import java.util.Scanner;

class Car {
    private String brand;
    private String color;
    private int power;
    private int price;

    Car(String brand, String color, int power, int price) {
        this.brand = brand;
        this.color = color;
        this.power = power;
        this.price = price;
    }

    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Car() {}

    public void tuning(Car car, int plusPower) {
        setPower(car.power + plusPower);
    }

    public void setPower(int power) {
        if (power > 1000 || power < 0) {
            System.err.println("Error! Bad tuning.");
        } else {
            this.power = power;
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void getInfo(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Color: " + getColor());
        System.out.println("Power: " + getPower());
        System.out.println("Price: " + getPrice());


    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "black", 100, 1000000);

        car.getInfo();

    }
}





