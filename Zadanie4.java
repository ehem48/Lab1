import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a=input.nextInt();
        System.out.println("Czy liczba podzielna?");
        System.out.println(podzielnosc(a));
    }

    public static boolean podzielnosc(int a){
        return(a%3==0 && a%5==0);
    }
}
