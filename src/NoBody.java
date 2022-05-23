// Ciało pętli może być puste

public class NoBody {
    public static void main(String args[]) {
        int i,j;

        i = 100;
        j = 200;

        //znajduje srodek miedzy i oraz j
        while (++i < --j); //brak ciala petli

        System.out.println("Srodek to wartosc " + i);
    }
}
