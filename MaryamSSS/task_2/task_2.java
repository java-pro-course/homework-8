package com.company;
class Plane{
    private String model;
    private int maxHigh;
    private int maxSpeed;
    private int peopleCounter;
    private int spaceCounter;

    Plane(String model, int maxHigh, int maxSpeed, int peopleCounter, int spaceCounter){
        this.model = model;
        this.maxHigh = maxHigh;
        this.maxSpeed = maxSpeed;
        this.peopleCounter = peopleCounter;
        this.spaceCounter = spaceCounter;
    }

    void getInfo(){
        System.out.println("Информация о самолёте:");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Модель: " + model);
        System.out.println("Максимальная высота: " + maxHigh);
        System.out.println("Максимальная скорость: " + maxSpeed);
        System.out.println("Вместимость пассажиров: " + peopleCounter);
        System.out.println("Грузоподъёмность: " + spaceCounter);
        System.out.println("___________________________________________");
    }
    void setModel(String model){
        this.model = model;
    }
    void setMaxHigh(int maxHigh){
        this.maxHigh = maxHigh;
    }
    void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    void setPeopleCounter(int peopleCounter){
        this.peopleCounter = peopleCounter;
    }
    void setSpaceCounter(int spaceCounter){
        this.spaceCounter = spaceCounter;
    }

    String getModel(String model){
        return this.model;
    }
    int getMaxHigh(int maxHigh){
        return this.maxHigh;
    }
    int getMaxSpeed(int maxSpeed){
        return this.maxSpeed;
    }
    int getPeopleCounter(int peopleCounter){
        return this.peopleCounter;
    }
    int getSpaceCounter(int spaceCounter){
        return this.spaceCounter;
    }

    void improvePlane(Plane plane){
        this.maxHigh += 10;
        this.maxSpeed += 10;
    }

}

public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane("AirWalker", 100, 200, 25, 300);
        plane.getInfo();
        plane.improvePlane(plane);
        plane.getInfo();
    }
}
