package szkolenie.liczby;

public class ZakresyLiczbowe {

    public static void main(String[] args) {
        byte a = 120;
        a += 20;
        System.out.println(a);
        
        // krok po kroku
        a = 120;
        for(int i = 1; i <= 20; i++) {
            ++a;
            System.out.println(a);
        }

        short s = -32000;
        s -= 1000;
        System.out.println(s);
        int i = 2_000_000_000;
        System.out.println(2 * i);
        
        char c = 50; // c = '2'
        System.out.println(c);
        int j = '9';
        System.out.println(j);
        
        char literka = 'A';
        literka += 3;
        System.out.println(literka);
        
    }

}

