import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Podaj 1 bok: ");
        double a= input.nextInt();
        System.out.print("Podaj 2 bok: ");
        double b= input.nextInt();
        System.out.print("Podaj 3 bok: ");
        double c= input.nextInt();
        System.out.format("Czy mozna zbudowac trojkat?\n");
        System.out.println(trojkat(a,b,c));

    }

    public static boolean trojkat(double a, double b, double c){
        double max, a1, b1;

        if (a > b) {
            if (a > c) {
                a1 = b; b1 = c; max = a;
            } else {
                a1 = a; b1 = b; max = c;
            }
        } else {
            if (b > c) {
                a1 = a; b1 = c; max = b;
            } else {
                a1 = a; b1 = b; max = c;
            }
        }

        return (Math.pow(a1,2) + Math.pow(b1,2) == Math.pow(max,2));
    }
}
