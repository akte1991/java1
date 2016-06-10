package szkolenie.podstawy;

public class Przeslanianie {
    
    static String napis = "Jestem napisem z klasy";
    

    public static void main(String[] args) {
        System.out.println("Przed deklaracja " + napis);
        
        String napis = "To jest napis z metody main";
        System.out.println("Po deklaracji: " + napis);

        System.out.println("Odwo³anie poprzez klasê " + Przeslanianie.napis);
        innaMetoda();
        System.out.println("Po powrocie do main: " + napis);
    }
    
    static void innaMetoda() {
        System.out.println("W innejMetodzie: " + napis);
    }

}
