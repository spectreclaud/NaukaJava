// Ulepszona wersja przykładu z porami roku

public class Switch {
    public static void main(String args[]) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "zima";
                break;
            case 3:
            case 4:
            case 5:
                season = "wiosna";
                break;
            case 6:
            case 7:
            case 8:
                season = "lato";
                break;
            case 9:
            case 10:
            case 11:
                season = "jesien";
                break;
            default:
                season = "Bledny miesiac";
        }
        System.out.println("Miesiac kwiecien nalezy do pory roku " + season + ".");
    }
}
