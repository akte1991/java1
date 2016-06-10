package widocznosc;

public class InnaKlasa {
    
    public void metoda2(Klasa obiekt) {
        //NK System.out.println(obiekt.prywatna);
        System.out.println(obiekt.domyslna);
        System.out.println(obiekt.chroniona);
        System.out.println(obiekt.publiczna);
    }
    
    public static void main(String[] args) {
        Klasa obiekt = new Klasa();        
        //NK System.out.println(obiekt.prywatna);
        System.out.println(obiekt.domyslna);
        System.out.println(obiekt.chroniona);
        System.out.println(obiekt.publiczna);
    }

}
