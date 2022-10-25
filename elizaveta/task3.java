import java.util.Scanner;

class Computer {
    private String brand;
    private String color;
    private int volume;
    private int RAM;

    Computer(String brand, String color, int volume, int RAM) {
        this.brand = brand;
        this.color = color;
        this.volume = volume;
        this.RAM = RAM;
    }
       public void getInfo() {
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("volume: " + volume);
        System.out.println("RAM: " + RAM);
        System.out.println("------------------------");
    }

    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public int getVolume(){
        return volume;
    }
    public int getRAM(){
        return RAM;
    }
    public void setBrand(String p){
        brand = p;
    }
    public void setColor(String p){
        if(!p.equals(color)){
            color = p;}
        else{
            System.err.println("Цвет уже: " + color);}
        }

    public void setVolume(int p){
        volume = p;
    }
    public void setRAM(int p){
        RAM = p;
    }}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Computer comp = new Computer(in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt());
        comp.getInfo();
        System.out.println("Change the color?");
        Scanner ans = new Scanner(System.in);
        String answer = ans.nextLine();
        if (answer.equals("yes")){
            Scanner col = new Scanner(System.in);
            String color = col.nextLine();
            comp.setColor(color);
            comp.getInfo();
        }
    }
}
