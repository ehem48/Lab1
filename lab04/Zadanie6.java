import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = 5;
        int[] tab = new int[n];
        int[] silnie = new int[n];
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj " + (i+1) + " liczbe:");
            tab[i] = read.nextInt();
        }
        for (int i = 0; i < n; i++) {
            silnie[i] = 1;
            for (int j = 1; j <= tab[i]; j++) {
                silnie[i] = silnie[i] * j;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Silnia z liczby " + tab[i] + " wynosi: " + silnie[i]);
        }
    }
}
