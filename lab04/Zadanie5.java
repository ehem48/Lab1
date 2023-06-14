import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = 8;
        int j, v;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj " + (i+1) + " liczbe: ");
            tab[i] = read.nextInt();
        }
        for (int i = 1; i < n; i++) {
            j = i;
            v = tab[i];
            while ((j > 0) && (tab[j - 1] > v)) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = v;
        }
        System.out.println("Po sortowaniu:");
        for (int i = 0; i < n; i++)
            System.out.println("tab[" + i + "] = " + tab[i]);

    }
}
