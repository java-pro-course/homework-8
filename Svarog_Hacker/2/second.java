package com.company;

class Plane{
    private String model;
    private String title;
    private int maxHeight;
    private int maxSpeed;
    private int maxCapacity;
    private int maxWeight;

    public void setModel(String model) {
        this.model = model;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getModel() {
        return model;
    }

    public String getTitle() {
        return title;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public Plane(String model, String title, int maxHeight, int maxSpeed, int maxCapacity, int maxWeight) {
        this.model = model;
        this.title = title;
        this.maxHeight = maxHeight;
        this.maxSpeed = maxSpeed;
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
    }
    public void getInfo(){
        System.out.println("The model is " + getModel());
        System.out.println("The title is " + getTitle());
        System.out.println("The max. height is " + getMaxHeight() + "m.");
        System.out.println("The max. speed is " + getMaxSpeed() + "km/h.");
        System.out.println("The max capacity is "+getMaxCapacity());
        System.out.println("The max weight is "+getMaxWeight());
    }
    public void improvePlane(Plane plane){
        setMaxSpeed(maxSpeed + 9);
        setMaxHeight(maxHeight + 9);
    }

}
public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane("С-22", "Илья Муромец", 4000, 105, 1, 3100);
        plane.getInfo();
        plane.improvePlane(plane);
        plane.getInfo();
    }
}