// Przykład czasu życia zmiennej

public class LifeTime {
    public static void main(String args[]) {
        int x;

        for (x = 0; x < 3; x ++) {
            int y = -1; //y jest inicjalizowane przy każdej iteracji pętli
            System.out.println("y wynosi " + y); //Zawsze zostanie wyświetlone -1
            y = 100;
            System.out.println("Teraz y wynosi " + y);
        }
    }
}
