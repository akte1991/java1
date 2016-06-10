package szkolenie.podstawy;

public class Invoke {
    static void pierwsza() {
        System.out.println("Metoda pierwsza");
        druga("ala", 3);
    }
    
    static void druga(String parametr1, int parametr2) {
        System.out.println("Metoda druga");
        System.out.println("Moje parametry: " + parametr1 + ", " + parametr2);
    }
    
    static int trzecia(int parametr) {
        System.out.println("Metoda trzecia");
        return 3*parametr;
    }
    
    public static void main(String[] args) {
        pierwsza();
        pierwsza();
    }

    public static void main3(String[] args) {
        int wynik = trzecia(2);
        System.out.println(wynik);
        trzecia(2); // wynik mo¿na te¿ zignorowaæ
    }
}

