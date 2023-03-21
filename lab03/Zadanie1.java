import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe studentow: ");
        int a= input.nextInt();
        int suma = 0;
        int i = 1;
        while (i <= a) {
            System.out.println("Podaj liczbe punktow dla studenta "+i);
            int punkty= input.nextInt();
            suma+=punkty;
            i++;
        }
        double srednia=(double) suma/a;
        System.out.println("Srednia punktow wynosi: "+srednia);


    }
}