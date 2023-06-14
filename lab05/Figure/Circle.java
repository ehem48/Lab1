package Figure;

public class Circle {
    String name;
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void wypisz() {
        System.out.format("Figura o nazwie: %s, promien: %.2f, pole: %.2f," + "obwod: %.2f", name, r, pole(r), obwod(r));
    }

    public double pole(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double obwod(double r) {
        return 2 * Math.PI * r;

    }
}
