class Plane {
    private String model;
    private int maxH;
    private int maxV;
    private int maxP;
    private int maxM;

    public Plane(String model, int maxH, int maxV, int maxP, int maxM){
        this.model = model;
        this.maxH = maxH;
        this.maxV = maxV ;
        this.maxP = maxP;
        this.maxM = maxM;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxH() {
        return maxH;
    }

    public void setMaxH(int maxH) {
        this.maxH = maxH;
    }

    public int getMaxV() {
        return maxV;
    }

    public void setMaxV(int maxV) {
        this.maxV = maxV;
    }

    public int getMaxP() {
        return maxP;
    }

    public void setMaxP(int maxP) {
        this.maxP = maxP;
    }

    public int getMaxM() {
        return maxM;
    }

    public void setMaxM(int maxM) {
        this.maxM = maxM;
    }

    public void getInfo(){
        System.out.println("Information>>>");
        System.out.println("Model: " + getModel() + "\n" + "Max. height: " + getMaxH() + " m" + "\n" + "Max. speed: " + getMaxV() + " m/s"+ "\n" + "Passengers: " + getMaxP() + "\n" + "Max. weight: " + getMaxM() + " kg");
        System.out.println("________________________");
    }

    public void improvePlane(Plane plane){
        if(plane.getMaxV() > 500 || plane.getMaxV() < 1 &&  plane.getMaxH() > 1000 || plane.getMaxH() < 1){
            System.err.println("!!!You can`t improve your plane!!!");
        }else{
            plane.setMaxH(plane.getMaxH() + 10);
            plane.setMaxV(plane.getMaxV() + 10);
            plane.getInfo();
        }


    }

}

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("AB-20", 500, 300, 30, 13000);
        plane.getInfo();
        plane.improvePlane(plane);
    }
}
