import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = 5, k = 0;
        String[] txt = new String[n];
        String[] revTxt = new String[n];
        char bw;
        String rev = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Wyraz " + (i + 1) + ": ");
            txt[i] = read.nextLine();
        }

        for (int i = (n - 1); i >= 0; i--) {
            rev = "";
            for (int j = 0; j < txt[i].length(); j++) {
                bw = txt[i].charAt(j);
                rev = bw + rev;

            }
            revTxt[k] = rev;
            k++;
        }
        for (String elem : revTxt)
            System.out.print(elem + " ");
    }
}
