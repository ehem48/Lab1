package Figure;

public class Rectangle {
    double a,b;
    String name;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double obwod(double a, double b){
        return 2*a + 2*b;
    }

    public double pole(double a, double b){
        return a*b;
    }

    public void wypisz() {
        System.out.format("Figura o nazwie: %s, bok a: %.2f, bok b: %.2f, pole: %.2f," + "obwod: %.2f", name, a, b,  pole(a, b), obwod(a,b));
    }
}
