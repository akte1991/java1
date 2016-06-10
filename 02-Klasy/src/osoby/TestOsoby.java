package osoby;

public class TestOsoby {
	
	public static void main(String[] args) {
		
	Osoba tato = new Osoba();
	tato.imie = "Jan";
	tato.nazwisko = "Kowalski";
	tato.wiek = 35;

	Osoba corka = new Osoba();
	corka.imie = "Alicja";
	corka.nazwisko = "Kowalska";
	corka.wiek = 17;

	System.out.println(tato.pelnoletnia()); // true
	System.out.println(corka.pelnoletnia()); // false
	
	}
}
