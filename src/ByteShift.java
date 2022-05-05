// Przesunięcie bajta w lewo

public class ByteShift {
    public static void main(String args[]) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Oryginalna wartosc a: " + a);
        System.out.println("i oraz b : " + i + " " + b);
    }
}
