import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = input.nextInt();
        System.out.println("Czy liczba parzysta?");
        System.out.println(parzystosc(liczba));

    }

    public static boolean parzystosc(int liczba) {
        return (liczba % 2 == 0);
    }
}
