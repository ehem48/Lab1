import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Podaj 10 liczb: ");
        int i=1;
        int suma1=0;
        int suma2=0;
        while(i<=10)
        {
            int liczba= input.nextInt();
            if(liczba>=0)
            {
                suma1+=liczba;
            }
            if(liczba<0)
            {
                suma2+=liczba;
            }
            i++;
        }
        System.out.println("Suma dodatnich to: "+suma1+" Suma ujemnych to: "+suma2);

    }
}