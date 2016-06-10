package osoby;

public class Osoba {
	String imie, nazwisko;
	int wiek;
	
	boolean pelnoletnia() {
		return wiek >= 18;
	}
	
	void urodziny() {
		wiek++;
	}
}


