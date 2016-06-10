package widocznosc;

public class Klasa {
    private int prywatna = 1;
    int domyslna = 2;
    protected int chroniona = 3;
    public int publiczna = 4;
    
    
    public void metoda() {
        System.out.println(prywatna);
        System.out.println(domyslna);
        System.out.println(chroniona);
        System.out.println(publiczna);
    }
    
    public void metoda2(Klasa inny) {
        System.out.println("Pole prywatne innego obiektu: " + inny.prywatna);
        System.out.println(inny.domyslna);
        System.out.println(inny.chroniona);
        System.out.println(inny.publiczna);
    }

    public static void main(String[] args) {
        Klasa obiekt = new Klasa();
        obiekt.metoda();
        
        System.out.println(obiekt.prywatna);
        System.out.println(obiekt.domyslna);
        System.out.println(obiekt.chroniona);
        System.out.println(obiekt.publiczna);
        
        Klasa drugi = new Klasa();
        drugi.prywatna = 77;
        obiekt.metoda2(drugi);
    }
}

