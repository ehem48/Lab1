package Figure;

public class Cube {
    double a;
    String name;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double pole(double a){
        return 2 * (a*a);
    }

    public double objetosc(double a){
        return Math.pow(a,3);
    }

    public void wypisz() {
        System.out.format("Figura o nazwie: %s, bok: %.2f, pole: %.2f," + "objetosc: %.2f", name, a, pole(a), objetosc(a));
    }
}
