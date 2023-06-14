import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("-2! =" + silnia(-2));
            System.out.println("3! =" + silnia(3));
        } catch (ErrorSilnia e){
            System.out.println("Error!!!! " + e.getMessage());
        }
    }


    public static int silnia(int n) throws ErrorSilnia {
        if (n < 0)
            throw new ErrorSilnia("Silnia nie moze byc liczona z liczby ujemnej");
        int wynik = 1;
        for (int i = 2; i <= n; i++)
            wynik *= i;
        return wynik;
    }
}
