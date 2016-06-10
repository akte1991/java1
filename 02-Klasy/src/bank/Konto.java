package bank;

public class Konto {
    // Automatyczna inicjalizacja na 0 lub null
    private String numer;
    private String wlasciciel;
    private long saldo;
    
    // Taki konstruktor musi byc dostepny, aby klasa byla zgodne z "JavaBean"
    // Wa¿ne dla takich technologii jak: JSP, JSF, JAXB (XML), JPA (Hibernate)
    public Konto() {
    }
    
    public Konto(String numer, String wlasciciel, long saldo) {
        this.numer = numer;
        this.wlasciciel = wlasciciel;
        this.saldo = saldo;
    }
    
    public String getWlasciciel() {
        return wlasciciel;
    }
    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }
    public String getNumer() {
        return numer;
    }

    public long getSaldo() {
        return saldo;
    }
    
    public void wplata(long kwota) {
        saldo += kwota;
    }

    public void wyplata(long kwota) {
        saldo -= kwota;
    }
    
    public static void przelew(Konto skad, Konto dokad, long kwota) {
        skad.saldo -= kwota;
        dokad.saldo += kwota;
    }

    public void przelew(Konto dokad, long kwota) {
        this.saldo -= kwota;
        dokad.saldo += kwota;
    }

    public String toString() {
        //return "Konto nr " + numer + ", w³: " + wlasciciel + " -- " + saldo;
        return String.format("Konto nr %s, w³. %s, saldo: %d", numer, wlasciciel, saldo);
    }
    protected void finalize() {
        System.out.println("Uuwane jest konto nr " + numer);
    }
}



