package com.company;
import java.util.Scanner;
class PC {
    private String company;
    private String model;
    private int frequency;
    private int power; //in Wolt
    private int SSD;
    private  int BIOS;   //How plane lifting people
    private int price;
    PC(String model, int frequency) {
        this.model = model;
        this.frequency = frequency;
    }
    PC() {}
    public PC(String company, String model, int frequency, int power, int SSD, int BIOS, int price) {
        this.company = company;
        this.model = model;
        this.frequency = frequency;
        this.power = power;
        this.SSD = SSD;
        this.BIOS = BIOS;
        this.price = price;
    }
    public void tuning(PC plane, int plusPower) {
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
    public int getFrequency() {
        return frequency;
    }
    public int getPower() {
        return power;
    }
    public int getSSD() {
        return SSD;
    }
    public int getBIOS() {
        return BIOS;
    }
    public int getPrice() {
        return price;
    }
    public void getInfo(){
        System.out.println("Company: " + getCompany());
        System.out.println("Model: " + getModel());
        System.out.println("Height: " + getFrequency());
        System.out.println("Color: " + getFrequency());
        System.out.println("Power: " + getPower());
        System.out.println("Capacity: " + getSSD());
        System.out.println("Lifting: " + getBIOS());
        System.out.println("Price: " + getPrice());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Создание объекта с помощью конструктора с 4 параметрами
        PC pc = new PC(in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        pc.getInfo();
    }
}
