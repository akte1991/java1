package dostep_statyczny;

public class StatyczneIInstancyjne {

    static int statyczna = 0;
    int instancyjna = 10;
    
    static void metodaStatyczna() {
        System.out.println("Z metody statycznej:");
        System.out.println("statyczna: " + statyczna);
        //NK System.out.println("instancyjna: " + instancyjna);
        //NK System.out.println("instancyjna: " + this.instancyjna);
    }
    
    static void metodaStatyczna2(StatyczneIInstancyjne arg) {
        System.out.println("instancyjna z obiektu: " + arg.instancyjna);
    }
    
    void metodaInstancyjna() {
        System.out.println("Z metody instancyjnej:");
        System.out.println("statyczna: " + statyczna);
        System.out.println("instancyjna: " + instancyjna);
        System.out.println("instancyjna: " + this.instancyjna);
        metodaInstancyjna2();
        metodaStatyczna();
    }

    void metodaInstancyjna2() {
        System.out.println("Z metody instancyjnej 2:");
        System.out.println("instancyjna: " + this.instancyjna);
    }

    public static void main(String[] args) {
        StatyczneIInstancyjne obiekt1 = new StatyczneIInstancyjne();
        StatyczneIInstancyjne obiekt2 = new StatyczneIInstancyjne();
        
        obiekt1.instancyjna = 1;
        obiekt2.instancyjna = 2;
        
        // na próbê, ale to jest w z³ym stylu i tak siê nie pisze
        obiekt1.statyczna = 11;
        obiekt2.statyczna = 12;
        
        System.out.println("1 in " + obiekt1.instancyjna);
        System.out.println("2 in " + obiekt1.statyczna);
        System.out.println("1 st " + obiekt2.instancyjna);
        System.out.println("2 st " + obiekt2.statyczna);

        // Tak mo¿emy odwo³ywaæ siê dopóki jesteœmy w tej klasie
        statyczna = 13;
        
        // Gdybyœmy byli w innej klasie, ale mieli dostep w sensie public/private
        StatyczneIInstancyjne.statyczna = 14;

        System.out.println("2 st " + obiekt2.statyczna);
        
        metodaStatyczna();
        
        //NK metodaInstancyjna();
        obiekt1.metodaInstancyjna();

    }

}
