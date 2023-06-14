public class Main {
    public static boolean spr(int n, String[] tab1, String[] tab2) {
        for (int i = 0; i < n; i++) {
            if (tab1[i].length() == tab2[i].length()) {
                for (int j = 0; j < tab1[i].length(); j++)
                    if (tab1[i].charAt(j) != tab2[i].charAt(j))
                        return false;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        String[] tab1 = {"Ala", "ma", "kota", "i", "psa"};
        String[] tab2 = {"Ala", "ma", "kota", "i", "psa"};
        System.out.println("Podane tablice " + (spr(n, tab1, tab2) ? "są" : "nie są") + " takie same.");

    }
}
