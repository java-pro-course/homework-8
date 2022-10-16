import java.util.Scanner;

class Car {
    private String brand;
    private String color;
    private int power;
    private int price;

    Car(String brand, String color, int power, int price) {
        this.brand = brand;
        this.color = color;
        this.power = power;
        this.price = price;
    }

    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    
    Car() {}

    public void tuning(Car car, int plusPower) {
        setPower(car.power + plusPower);
    }

    public void setPower(int power) {
        if (power > 1000 || power < 0) {
            System.err.println("Error! Bad tuning.");
        } else {
            this.power = power;
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта с помощью конструктора с 4 параметрами
        Car car = new Car("BMW", "black", 100, 1000000);
        System.out.println("Brand: " + car.getBrand());

        Scanner in = new Scanner(System.in);
        int plusPower = in.nextInt();

        car.tuning(car, plusPower);
        System.out.println("Power: " + car.getPower());
        
        // Создание объекта с помощью конструктора с 2 параметрами
        Car unknownCar = new Car("BMW", "black");
        
        // Создание объекта с помощью нулевого конструктора
        Car emptyCar = new Car();
    }
}
