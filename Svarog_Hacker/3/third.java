package com.company;

import java.util.Scanner;

class Computer {
    private String model;
    private String color;
    private int volume;
    private int RAM;

    public Computer(String model, String color, int volume, int RAM) {
        this.model = model;
        this.color = color;
        this.volume = volume;
        this.RAM = RAM;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(this.color != color) this.color = color;
        else System.out.println("CHANGE!!!");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public void getInfo(){
        System.out.println("The model is "+ model);
        System.out.println("The color is "+ color);
        System.out.println("The volume is "+ volume);
        System.out.println("The RAM is "+ RAM);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the model, please");
        String model = in.nextLine();
        System.out.println("Enter the color, please");
        String color = in.nextLine();
        System.out.println("Enter the volume, please");
        int volume = in.nextInt();
        System.out.println("Enter the RAM, please");
        int RAM = in.nextInt();
        Computer computer = new Computer(model, color, volume, RAM);
        computer.getInfo();
        System.out.println("Change color, please");
        color = in.nextLine();
        color = in.nextLine();
        computer.setColor(color);
        computer.getInfo();
    }
}