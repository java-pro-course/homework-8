
public class Main {

    public static void main(String[] args) {

        Plane plane = new Plane("SS40", 10000,500, 300,200);
        plane.getInfo();
        plane.improvePlane(plane);
        plane.getInfo();
    }
}
class Plane {
    private String model;
    private int maxHeight;
    private int maxSpeed;
    private int maxPassengers;
    private int maxLoad;

    Plane(String model, int maxHeight, int maxSpeed, int maxPassengers, int maxLoad) {
        this.model = model;
        this.maxHeight = maxHeight;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
        this.maxLoad = maxLoad;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public void getInfo() {
        System.out.println(model + "; " + maxHeight + "; " + maxSpeed + "; " + maxPassengers + "; " + maxLoad);
    }

    public Plane improvePlane(Plane plane){
        plane.maxHeight = plane.maxHeight + 10;
        plane.maxSpeed = plane.maxSpeed + 10;
        return plane;
    }
}
