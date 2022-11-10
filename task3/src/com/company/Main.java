package com.company;


import java.util.Objects;
import java.util.Scanner;

class Computer {
    private String system;
    private String color;
    private int ram;
    private int hdd;
    Computer(String system, String color , int ram, int hdd){
        this.color = color;
        this.ram = ram;
        this.system = system;
        this.hdd = hdd;
    }
    public void getInfo(){
        System.out.println(system);
        System.out.println("Цвет: " + color);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Жесткий диск: " + hdd);
    }

    public String getSystem(){
        return system;
    }
    public String getColor(){
        return color;
    }
    public int getHdd(){
        return hdd;
    }
    public int ram(){
        return ram;
    }

    public void setSystem(String a){
        system = a;
    }
    
    public void setHdd(int a){
        hdd = a;
    }
    public void setRam(int a){
        ram = a;
    }
    public void setСolor(String a){
        if(!Objects.equals(a, color))
        color = a;
        else if(a.equals(color)){
            System.err.println("Цвет уже: " + color);
        }
    }

    
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Computer p = new Computer(in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt());
        p.getInfo();
        p.setСolor("black");
        p.getInfo();
    }
}
