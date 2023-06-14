import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        Scanner read = new Scanner(System.in);

        double userInput = 0;
        while (true){
            try {
                userInput = read.nextDouble();
                break;
            } catch (InputMismatchException e){
                System.out.println("Podaj poprawna liczbe!");
                read.next();
            }
        }
        if (userInput<0)
            throw new IllegalArgumentException(String.format("Pierwiastek z liczby %.4f nie istnieje", userInput));
        System.out.println("Wynik: " + Math.sqrt(userInput));
    }
}
