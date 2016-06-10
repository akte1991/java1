package wyjatki;

import java.io.IOException;

public class DzialanieWyjatkow {
    
    static void metoda(String napis) throws IOException {
        try {
        
            System.out.println("Pocz¹tek metody, napis = " + napis);
            
            int dlugosc = napis.length();
            System.out.println("Napis ma d³ugoœæ " + dlugosc);
            
            int x = 10 / dlugosc;
            System.out.println("Dziwny wynik = " + x);
            
            switch(napis) {
                case "NULL" : {
                    NullPointerException wyjatek = new NullPointerException("mój wyj¹tek");
                    throw wyjatek;
                }        
    
                case "ERROR" : {
                    throw new OutOfMemoryError("na niby");
                }        
    
                case "IO" : {
                    throw new IOException("b³ad pliku");
                }
    
                case "EXIT" : {
                    System.out.println("Przerywam exit-em");
                    System.exit(0);
                }
    
                case "RETURN" : {
                    System.out.println("Przerywam return-em");
                    return;
                }
            }
            
            System.out.println("W metodzie przed finally");
        
        } finally {
            System.out.println("FINALLY w metodzie");
            
        }
        System.out.println("Koniec metody");
    }


    public static void main(String[] args) {
        System.out.println("Pocz¹tek main");
        
        try {
//            metoda("Ala");
//            metoda(null);
//            metoda("");
//            metoda("NULL");
//            metoda("ERROR");
//            metoda("EXIT");
            metoda("RETURN");
            
            System.out.println("Po wywo³aniu metody");
        } catch(NullPointerException e) {
            System.out.println("Wy³apa³em NPE " + e.getMessage());            
        } catch(Exception e) {
            System.out.println("Wy³apa³em inny wyj¹tek: " + e.getClass().getSimpleName());            
            System.out.println("Komunikat: " + e.getMessage());            
        } finally {
            System.out.println("FINALLY");
        }
        
        System.out.println("Koniec main");
    }

}

