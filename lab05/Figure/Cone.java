package Figure;

public class Cone {
    private double r,h,l;
    String name;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double pole(double r, double h, double l){
        return (Math.PI * Math.pow(r,2)) + (Math.PI * r * l);
    }

    public double objetosc(double r, double h){
        return ((Math.PI*Math.pow(r,2))/3) * h;
    }

    public void wypisz() {
        System.out.format("Figura o nazwie: %s, promien: %.2f, wysokosc: %.2f, ramie: %.2f, pole: %.2f," + "objetosc: %.2f", name, r, h, l, pole(r, h, l), objetosc(r, h));
    }
}
