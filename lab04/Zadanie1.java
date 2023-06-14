import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        double tab[] = new double[10];
        int n = 10;
        for (int i = 0; i < n; i++)
            tab[i] = rand.nextDouble();

        double suma1 = 0;
        for (int i = 0; i < n; i++)
            suma1 = suma1 + tab[i];
        double sr1 = suma1 / n;

        double suma2 = 0;
        for (double i : tab)
            suma2 = suma2 + i;
        double sr2 = suma2 / n;

        System.out.println("Petla for: suma: " + suma1 + ", srednia: " + sr1);
        System.out.println("Petla foreach: suma: " + suma2 + ", srednia: " + sr2);
    }
}
