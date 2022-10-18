package com.company;

import java.util.Scanner;

class Plane {
    private String company;
    private String model;
    private int height;  // how height plane (yschelye)
    private int power;
    private int capacity;
    private  int lifting;   //How plane lifting people
    private int price;





    Plane(String model, int height) {
        this.model = model;
        this.height = height;
    }

    Plane() {}

    public Plane(String company, String model, int height, int power, int capacity, int lifting, int price) {
        this.company = company;
        this.model = model;
        this.height = height;
        this.power = power;
        this.capacity = capacity;
        this.lifting = lifting;
        this.price = price;
    }

    public void tuning(Plane plane, int plusPower) {
        setPower(plane.power + plusPower);
    }

    public void setPower(int power) {
        if (power > 1000 || power < 0) {
            System.err.println("Error! VERY EXPENSIVE.");
        } else {
            this.power = power;

        }
    }





    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getHeight() {
        return height;
    }

    public int getPower() {
        return power;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLifting() {
        return lifting;
    }

    public int getPrice() {
        return price;
    }

    public void getInfo(){
        System.out.println("Company: " + getCompany());
        System.out.println("Model: " + getModel());
        System.out.println("Height: " + getHeight());
        System.out.println("Color: " + getHeight());
        System.out.println("Power: " + getPower());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Lifting: " + getLifting());
        System.out.println("Price: " + getPrice());


    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Создание объекта с помощью конструктора с 4 параметрами
        Plane plane = new Plane("S7", "Sy67", 10, 400, 200, 1000, 1000000);
        System.out.println("Before tuning ");
        plane.getInfo();
        System.out.println("Please, draw power for plane (0<plane<1000)");
 plane.tuning(plane, in.nextInt());
        System.out.println("After");
        plane.getInfo();

    }
}
