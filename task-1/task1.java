package com.company;

class Animal {
    Animal(String name, String nickname, int age, int height, int weight){
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void getInfo() {
        System.out.println("Object dog. Name: " + name);
        System.out.println("Object dog. nickname: " + nickname);
        System.out.println("Object dog. Age: " + age);
        System.out.println("Object dog. Height: " + height);
        System.out.println("Object dog. Weight: " + weight);
    }
}

public class Main {
	    public static void main(String[] args) {
        Animal dog = new Animal("Собака", "Шарик", 2, 40, 12);
        dog.getInfo();
    }
}
