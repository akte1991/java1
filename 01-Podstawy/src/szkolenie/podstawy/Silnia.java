package szkolenie.podstawy;

public class Silnia {
    
    static long silnia(int n) {
        long wynik = 1;
        
        for(int i=1; i<=n; i++) {
            wynik = wynik * i;
        }
        
        return wynik;
    }
    
    static long silnia2(int n) {
        long wynik = 1;
        
        for(int i=2; i<=n; i++) {
            wynik *= i;
        }
        
        return wynik;
    }
    
    static long silniaW(int n) {
        long wynik = 1;
        
        while(n>1) {
            wynik *= n;
            n--;
        }
        
        return wynik;
    }
    
    static long silniaR(int n) {
        if(n > 1)
            return n * silniaR(n-1);
        else
            return 1;
    }
    

    public static void main(String[] args) {
        int n=5;
        long wynik;
        
        wynik = silnia(n);
        System.out.println(wynik);
        wynik = silnia2(n);
        System.out.println(wynik);
        wynik = silniaW(n);
        System.out.println(wynik);
        wynik = silniaR(n);
        System.out.println(wynik);
        
    }

}
