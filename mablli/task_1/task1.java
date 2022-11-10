public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("male", "John", 178, "blue", "dark");
        human1.getInfo();
    }
}


class Human {
    String gender;
    String name;
    int height;
    String eyesColor;
    String hairColor;

    Human(String gender, String name, int height, String eyesColor, String hairColor){
        this.gender = gender;
        this.name = name;
        this.height = height;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
    }

    public void getInfo() {
        System.out.println(gender + "; " + name + "; " + height + "; " + eyesColor + "; " + hairColor + ".");
    }
}
