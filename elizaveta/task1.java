class Human {
    String gender;
    String name;
    int height;
    String color_eye;
    String color_hair;

    Human(String gender, String name, int height, String color_eye, String color_hair) {
        this.gender = gender;
        this.name = name;
        this.height = height;
        this.color_eye = color_eye;
        this.color_hair = color_hair;}


    public void getInfo() {
        System.out.println("gender: " + gender);
        System.out.println("name: " + name);
        System.out.println("height: " + height);
        System.out.println("color_eye: " + color_eye);
        System.out.println("color_gair: " + color_hair);
    }
}

public class Main {

    public static void main(String[] args) {
        Human human = new Human("woman", "Tanya", 175, "green", "brown");
        human.getInfo();

    }}
