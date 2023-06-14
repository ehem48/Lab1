import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> pary = new HashMap<String, String>();
        Scanner read = new Scanner(System.in);
        int i = 1;
        while (true) {
            System.out.print("Para " + i + ", osoba 1: ");
            String o1 = read.nextLine();
            if (Objects.equals(o1, "-")) break;
            System.out.print("Para " + i + ", osoba 2: ");
            String o2 = read.nextLine();
            if (Objects.equals(o2, "-")) break;
            pary.put(o1, o2);
            i++;
        }

        System.out.print("Podaj imie, a wyswietle jego partnera: ");
        String os = read.nextLine();
        System.out.println(pary.get(os));
    }
}
