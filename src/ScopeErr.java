// Ten program się nie skompiluje

public class ScopeErr {
    public static void main(String args[]) {
        int bar = 1;
        { //Tworzy nowy zasięg
            int bar1 = 2; //Błąd kompilacji--zmienna bar jest już zadeklarowana
        }
    }
}
