// Prosty przykład użycia instrukcji switch

public class SampleSwitch {
    public static void main(String args[]) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i wynosi zero.");
                    break;
                case 1:
                    System.out.println("i wymosi jeden.");
                    break;
                case 2:
                    System.out.println("i wynosi dwa.");
                    break;
                case 3:
                    System.out.println("i wynosi trzy.");
                    break;
                default:
                    System.out.println("i jest wieksze od trzech.");
            }
    }
}
