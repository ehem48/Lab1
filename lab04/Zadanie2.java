public class Main {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        int[] tab2 = new int[9];
        int n = 10;
        int m = 9;

        for (int i = 0; i < n; i++)
            tab1[i] = i + 1;

        for (int i = 0; i < m; i++)
            tab2[i] = i + 1;

        System.out.println("Tablica " + n + "-elementowa");
        int i = 0;
        while (i < n) {
            System.out.print(tab1[i] + ", ");
            i += 2;
        }
        System.out.println();
        System.out.println("Tablica " + m + "-elementowa");
        i = 0;
        while (i < m) {
            System.out.print(tab2[i] + ", ");
            i += 2;
        }
    }
}
