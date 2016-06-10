package szkolenie.podstawy;

public class Zmienne {

	public static void main(String[] args) {
		int x = 7;
		String imie = "Ala";
		String nazwisko = "Kowalska"; //deklaracja z inicjalizacj¹
		System.out.println(imie + " " + nazwisko);
		
		nazwisko = "qaz"; //tylko przypisanie
		System.out.println(imie + " " + nazwisko);
		
		if(x > 5) {
			//NK String imie = "Ola";
			String a = "To jest napis";
			System.out.println(a);
		} else {
			int a = 77;
			System.out.println(2*a);
		}
		double a = 3.14;
		System.out.println(a);
	}

}
