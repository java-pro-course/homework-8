package com.company;

class Human{
    String gender;
    String name;
    String surname;
    int height;
    int age;
    String heir_color;
    String eyes_color;
    String profession;
    String pet;

    public Human(String gender, String name, String surname, int height, int age, String heir_color, String eyes_color, String profession, String pet) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.age = age;
        this.heir_color = heir_color;
        this.eyes_color = eyes_color;
        this.profession = profession;
        this.pet = pet;
    }

    public void getInfo(){
        System.out.println("The gender is " + this.gender);
        System.out.println("The name is " + this.name);
        System.out.println("The surname is " + this.surname);
        System.out.println("The height is " + this.height);
        System.out.println("The age is " + this.age);
        System.out.println("The heir color is " + this.heir_color);
        System.out.println("The eyes color is " + this.eyes_color);
        System.out.println("The profession is " + this.profession);
        System.out.println("The pet is " + this.pet);
    }
}

public class Main {

    public static void main(String[] args) {
        Human hecuba = new Human("female", "Hecuba", "Morpho", 170 , 16, "red", "green", "witch", "cat");
        hecuba.getInfo();
    }
}