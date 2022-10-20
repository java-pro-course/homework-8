import java.util.Scanner;

class Computer {
    private String model;
    private String color;
    private int disk;
    private int RAM;

    public Computer(String model, String color, int disk, int RAM) {
        this.model = model;
        this.color = color;
        this.disk = disk;
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
        this.color = color;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void getInfo() {
        System.out.println("Computer-->-->-->");
        System.out.println("Model: " + getModel() + "\n" + "Color: " + getColor() + "\n" + "Internal storage: " + getDisk() + "Gb" + "\n" + "RAM: " + getRAM() + "Gb");
        System.out.println("________________________");
    }

    public void changeColor(String color, Computer computer){
        if(color.equals(getColor())){
            System.out.println("You already have this color!");

        }else{
            setColor(color);
            getInfo();
        }

    }
}


public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Computer computer = new Computer(in.next(), in.next(), in.nextInt(), in.nextInt());
        computer.getInfo();
        System.out.print("Enter your new color: ");
        computer.changeColor(in.next(), computer);
    }
}
