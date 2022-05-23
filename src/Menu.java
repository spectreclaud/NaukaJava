// Wykorzystanie pętli do-while do przetwarzania menu -- prosty system pomocy

import java.io.IOException;

public class Menu {
    public static void main(String args[]) throws IOException {

            char choice;

            do {
                System.out.println("Pomoc na temat: ");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. while");
                System.out.println(" 4. do-while");
                System.out.println(" 5. for\n");
                System.out.println("Wybierz jedna opcje:");
                choice = (char) System.in.read();
            } while (choice < '1' || choice > '5');

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Instrukcja if:\n");
                    System.out.println("if(warunek) instrukcja;");
                    System.out.println("else instrukcja;");
                    break;
                case '2':
                    System.out.println("Instrukcja switch:\n");
                    System.out.println("switch(wyrazenie) {");
                    System.out.println(" case stala:");
                    System.out.println("    sekwencja instrukcji");
                    System.out.println(" break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Petla while:\n");
                    System.out.println("while(warunek) instrukcja;");
                    break;
                case '4':
                    System.out.println("Petla do-while:\n");
                    System.out.println("do {");
                    System.out.println("   instrukcja;");
                    System.out.println("} while (warunek);");
                    break;
                case '5':
                    System.out.println("Petla for:\n");
                    System.out.println("for(inicjalizacja; warunek; iteracja)");
                    System.out.println("    instrukcja;");
                    break;
            }
    }
}
