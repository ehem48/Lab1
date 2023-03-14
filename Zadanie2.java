import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int a=InputInt();
        int b=InputInt();

        Dzialania(a, b);
    }

    public static int InputInt() {
        Scanner input= new Scanner(System.in);
        System.out.println("Podaj liczbe");

        int liczba= input.nextInt();
        return liczba;
    }
    public static void Dzialania(int a, int b){
        System.out.format("Dodawanie: %d+%d=%d\n", a, b, (a+b));
        System.out.format("Odejmowanie: %d-%d=%d\n", a, b, (a-b));
    }
}
