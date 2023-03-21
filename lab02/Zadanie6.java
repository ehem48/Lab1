import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner liczba=new Scanner(System.in);
        while(true)
        {
            System.out.println("Podaj liczbe całkowitą: ");
            int a=liczba.nextInt();
            if(a<0) break;
        }
    }
}