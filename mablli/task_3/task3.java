import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the mark");
        String mark = in.nextLine();
        System.out.println("Enter the color");
        String color = in.nextLine();
        System.out.println("Enter the ssd");
        int ssd = in.nextInt();
        System.out.println("Enter the ram");
        int ram = in.nextInt();
        Computer computer = new Computer(mark, color, ssd, ram);
        computer.getInfo();

        System.out.println("Change the color, please");
        color = in.nextLine();
        computer.setColor(color);
        computer.setColor(in.nextLine());
        computer.getInfo();
    }
    public static Scanner in =  new Scanner(System.in);
}

class Computer {
    String mark;
    String color;
    int ssd;
    int ram;

    Computer (String mark, String color, int ssd, int ram){
        this.mark = mark;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void getInfo(){
        System.out.println("Mark: " + mark + "; " + "Color: " + color + "; " + "Ssd: " + ssd + "; " + "Ram" + ram);
    }

}
