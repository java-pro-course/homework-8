package com.company;


class Plane {
    private String model;
    private int maxHeight;
    private int maxSpeed;
    private int passengers;
    private int maxWeight;
    Plane(String model, int maxHeight ,int maxSpeed, int passengers, int maxWeight){
        this.maxHeight = maxHeight;
        this.model = model;
        this.maxWeight = maxWeight;
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;
    }
    public void getInfo(){
        System.out.println(model);
        System.out.println("Максимальная высота: " + maxHeight);
        System.out.println("Максимальная скорость: " + maxSpeed);
        System.out.println("Вместимость пассажиров: " + passengers);
        System.out.println("Грузоподъемность: " + maxWeight);
    }

    public String getModel(){
        return model;
    }
    public int getMaxHeight(){
        return maxHeight;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public int passengers(){
        return passengers;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setModel(String a){
        model = a;
    }
    public void setMaxHeight(int a){
        maxHeight = a;
    }
    public void setMaxWeight(int a){
        maxWeight = a;
    }
    public void setPassengers(int a){
        passengers = a;
    }
    public void setMaxSpeed(int a){
        maxSpeed = a;
    }


    public void improvePlane(Plane p, int speedI, int heightI) {
        setMaxHeight(p.maxHeight += speedI);
        setMaxSpeed(p.maxSpeed += heightI);

    }
}
public class Main {
    public static void main(String[] args) {
        Plane p = new com.company.Plane("boeing", 1000, 100, 100, 100);
        p.getInfo();
        p.improvePlane(p,10, 10);
        p.getInfo();
    }
}
