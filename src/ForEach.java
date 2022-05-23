// Użycie pętli typu for-each

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Użycie pętli typu for-each do wyświetlenia i zsumowania wartości
        for (int x : nums) {
            System.out.println("Wartosc - " + x);
            sum += x;
        }
        System.out.println("Suma wartosci: " + sum);
    }
}
