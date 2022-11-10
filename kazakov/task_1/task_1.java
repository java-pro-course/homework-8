class Human {
    String sex;
    String name;
    int height;
    String eyes_color;
    String hair_color;

    public Human(String sex, String name, int height, String eyes_color, String hair_color){
        this.sex = sex;
        this.name = name;
        this.height = height;
        this.eyes_color = eyes_color;
        this.hair_color = hair_color;
    }
    public void getInfo(){
        System.out.println("Gender: " + sex + "\n" + "Name: " + name);
        System.out.println("Info-----------------");
        System.out.println("Height: " + height + " cm" + "\n" + "Eyes: " + eyes_color + "\n" + "Hair: " + hair_color);
    }
}

public class Main {

    public static void main(String[] args) {
	Human Pole = new Human("M", "Pole", 180, "blue", "blonde");
    Pole.getInfo();
    }
}
