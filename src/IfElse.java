// Przykład użycia sekwencji instrukcji if-else-if

public class IfElse {
    public static void main(String args[]) {
        int month = 4;
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "zima";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "wiosna";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "lato";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "jesien";
        } else
            season = "Bledny miesiac";

        System.out.println("Miesiac kwicien nalezy do pory roku " + season + ".");
    }
}
