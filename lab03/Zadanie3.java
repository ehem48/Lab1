import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj ilosc elementow ciagu: ");
        int n= input.nextInt();
        int suma=0;
        int i=1;
        while(i<=n)
        {
            System.out.println("Podaj "+i+" element: ");
            int l= input.nextInt();
            if(l%2==0)
            {
                suma+=l;
            }
            i++;
        }
        System.out.println("Suma liczb parzystych to: "+suma);
    }
}
