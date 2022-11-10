class Plane {
    private String model;
    private int max_height;
    private int max_speed;
    private int passenger_tonnage;
    private int capacity;

    Plane(String model, int max_height, int max_speed, int passenger_tonnage, int capacity) {
        this.model = model;
        this.max_height = max_height;
        this.max_speed = max_speed;
        this.passenger_tonnage = passenger_tonnage;
        this.capacity = capacity;
    }
       public void getInfo() {
        System.out.println("model: " + model);
        System.out.println("max_height: " + max_height);
        System.out.println("max_speed: " + max_speed);
        System.out.println("passenger_tonnage: " + passenger_tonnage);
        System.out.println("capacity: " + capacity);
        System.out.println("------------------------");
    }

    public String getModel(){
        return model;
    }
    public int getMax_height(){
        return max_height;
    }
    public int getMax_speed(){
        return max_speed;
    }
    public int getPassenger_tonnage(){
        return passenger_tonnage;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setModel(String p){
        model = p;
    }
    public void setMax_height(int p){
        max_height = p;
    }
    public void setMax_speed(int p){
        max_speed = p;
    }
    public void setPassenger_tonnage(int p){
        passenger_tonnage = p;
    }
    public void setCapacity(int p){
        capacity = p;
    }


    public void improvePlane(Plane plane) {
        setMax_height(plane.max_height += 10);
        setMax_speed(plane.max_speed += 10);
           }}

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("boeing", 1000, 100, 100, 100);
        plane.getInfo();
        plane.improvePlane(plane);
        plane.getInfo();
    }
}
