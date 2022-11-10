package com.company;

class Human {
    String gender;
    String name;
    int age;
    int height;
    int weight;
    String skinColor;
    String eyeColor;
    String hairColor;

    Human(String gender, String name, int age, int height, int weight, String skinColor, String eyeColor, String hairColor){
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public void getInfo() {
        System.out.println("Object information: ");
        System.out.println("__________________________");
        System.out.println("Пол: " + gender);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Масса: " + weight);
        System.out.println("Цвет кожи: " + skinColor);
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Цвет волос: " + hairColor);
    }
}

public class Main {

    public static void main(String[] args) {
	Human Anton = new Human("Ламинат", "Антон", 22, 177, 58, "Белый", "Карий", "Брюнет");
	Anton.getInfo();
    }
}
