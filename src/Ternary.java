public class Ternary {
    public static void main(String args[]) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; //Pobierz wartosc bezwzgledna z i
        System.out.print("Wartosc bezwzgledna z ");
        System.out.println(i + " wynosi " + k);

        i = -10;
        k = i < 0 ? -i : i; //Pobierz wartosc bezwzgledna z i
        System.out.print("Wartosc bezwzgledna z ");
        System.out.println(i + " wynosi " + k);
    }
}
