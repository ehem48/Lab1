import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Run();
    }

    public static void Menu() {
        System.out.println("\n\t\t\t====================");
        System.out.println("\t\t\t==== Kalkulator ====");
        System.out.println("\t\t\t====================");
        System.out.printf("\t\t\t1. Suma\n\t\t\t2. Róznica\n\t\t\t3. Iloczyn" +
                "\n\t\t\t4. Iloraz\n\t\t\t5. Potęga\n\t\t\t6. Pierwiastek" +
                "\n\t\t\t7. Funkcje trygonometryczne\n\t\t\t8. Wyjście");
        System.out.println("\n\t\t\t-----------------------------------");
        System.out.printf("\t\t\t\tWybierz operacje: ");
    }

    public static void Run(){
        int wybor;
        int a;
        int b;
        while (true){
            Menu();
            wybor=InputInt();
            System.out.println("Podaj dane: ");
            switch (wybor){
                case 1-> metoda1(a=InputInt(),b=InputInt());
                case 2-> metoda2(a=InputInt(),b=InputInt());
                case 3-> metoda3(a=InputInt(),b=InputInt());
                case 4-> metoda4(a=InputInt(),b=InputInt());
                case 5-> metoda5(a=InputInt(),b=InputInt());
                case 6-> metoda6(a=InputInt(),b=InputInt());
                case 7-> metoda7(a=InputInt(),b=InputInt());
                case 8->Close();
                default -> Error();
            }
        }//koniec while

    }

    public static void metoda1(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void metoda2(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    public static void metoda3(int a, int b){
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public static void metoda4(int a, int b){
        System.out.println(a + " / " + b + " = " + (a / b));
    }
    public static void metoda5(int a, int b){
        System.out.println(a + " ^" + b + " = " + (Math.pow(a, b)));
    }
    public static void metoda6(int a, int b){
        System.out.println(a + " = " + (Math.sqrt(a)));
        System.out.println(b + " = " + (Math.sqrt(b)));
    }
    public static void metoda7(int a, int b){
        System.out.println("sin(a) = " + Math.sin(a));
        System.out.println("cos(a) = " + Math.cos(a));
        System.out.println("tg(a) = " + Math.tan(a));
        System.out.println("sin(b) = " + Math.sin(b));
        System.out.println("cos(b) = " + Math.cos(b));
        System.out.println("tg(b) = " + Math.tan(b));
    }
    public static void Error(){
        System.out.println("Bledne dane, koniec programu");
        System.exit(0);
    }

    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        int liczba= input.nextInt();
        return liczba;
    }

    public static void Close(){
        System.out.println("\n\n\nCzy na pewno chcesz wyjsc t || T");
        String znak = InputString();
        String st1="t";
        String st2="T";
        if(znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }

    public static String InputString(){
        Scanner input = new Scanner(System.in);
        String znak= input.nextLine();
        return znak;
    }
}
