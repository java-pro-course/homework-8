package com.company;

import java.util.Scanner;

class Computer{
    private String mark;
    private String color;
    private int diskSpace;
    private int operativeSpace;
    Scanner in = new Scanner(System.in);
    Computer(String mark, String color, int diskSpace, int operativeSpace){
        this.mark = mark;
        this.color = color;
        this.diskSpace = diskSpace;
        this.operativeSpace = operativeSpace;
    }

    public String getMark() {
        return mark;
    }
    public String getColor() {
        return color;
    }
    public int getDiskSpace() {
        return diskSpace;
    }
    public int getOperativeSpace() {
        return operativeSpace;
    }

    public void setMark(String mark) {
        this.mark = in.nextLine();
    }
    public void setColor(String color) {
        this.color = in.nextLine();
    }
    public void setDiskSpace(int diskSpace) {
        this.diskSpace = in.nextInt();
    }
    public void setOperativeSpace(int operativeSpace) {
        this.operativeSpace = in.nextInt();
    }

    public void getInfo(Computer computer){
        System.out.println("Информация: ");
        System.out.println("Марка: " + this.mark);
        System.out.println("Цвет: " + this.color);
        System.out.println("Объём жесткого диска: " + this.diskSpace);
        System.out.println("Оперативная память: " + this.operativeSpace);
    }


}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Computer computer = new Computer(in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt());
        computer.getInfo(computer);
        computer.setColor(in.nextLine());
        computer.getInfo(computer);
    }
}
