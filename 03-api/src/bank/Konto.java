package bank;

public class Konto {
    // Automatyczna inicjalizacja na 0 lub null
    private String numer;
    private String wlasciciel;
    private long saldo;
    
    // Taki konstruktor musi byc dostepny, aby klasa byla zgodne z "JavaBean"
    // Wa�ne dla takich technologii jak: JSP, JSF, JAXB (XML), JPA (Hibernate)
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
        //return "Konto nr " + numer + ", w�: " + wlasciciel + " -- " + saldo;
        return String.format("Konto nr %s, w�. %s, saldo: %d", numer, wlasciciel, saldo);
    }
    protected void finalize() {
        System.out.println("Uuwane jest konto nr " + numer);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numer == null) ? 0 : numer.hashCode());
		result = prime * result + (int) (saldo ^ (saldo >>> 32));
		result = prime * result + ((wlasciciel == null) ? 0 : wlasciciel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konto other = (Konto) obj;
		if (numer == null) {
			if (other.numer != null)
				return false;
		} else if (!numer.equals(other.numer))
			return false;
		if (saldo != other.saldo)
			return false;
		if (wlasciciel == null) {
			if (other.wlasciciel != null)
				return false;
		} else if (!wlasciciel.equals(other.wlasciciel))
			return false;
		return true;
	}
    
}



