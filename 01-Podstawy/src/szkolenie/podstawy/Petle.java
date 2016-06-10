package szkolenie.podstawy;

public class Petle {
    
    public static void losowanie() {
        for(;;) {
            double x = Math.random();
            System.out.println("Wylosowałem " + x);
            if(x > 0.8) break;
        }
        System.out.println("za pętlą");        
    }
    
    public static void przerwanie() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            if(i % 2 == 1) {
                System.out.println("  nieparzysta, continue");
                continue;
            }
            System.out.println("  nie było continue");
            if(i % 3 == 0) {
                System.out.println("  podzielna przed 3, break");
                break;
            }
            System.out.println("  nie było break");
        }
        System.out.println("za pętlą");
    }
    
    public static int etykiety() {
        int suma = 0;
        duza: while(true) {
            for(int i=1; i <10; i++) {
                suma += i;
                if(suma > 100)
                    break duza;
            }
        }
        return suma;
    }

    public static void doWhile() {
        int i = 1;
        do {
            System.out.println("w pętli: " + i);
            i++;
        } while (i <= 5);
        System.out.println("za pętlą: " + i);
    }

    public static void petlaWhile() {
        int i = 1;
        while (i <= 5) {
            System.out.println("w pętli: " + i);
            i++;
        }
        System.out.println("za pętlą: " + i);
    }
    
    public static void main(String[] args) {
        
        System.out.println("while");
        petlaWhile();
        
        System.out.println("do-while");
        doWhile();
        
        losowanie();
        przerwanie();
        int x= etykiety();
        System.out.println(x);
    }

}

