package bank;

public class TestKonto {

	public static void main(String[] args) {
		Konto konto1 = new Konto();
		
		konto1.setWlasciciel("Ala");
		System.out.println(konto1.getWlasciciel());
		System.out.println(konto1.getSaldo());
		System.out.println(konto1.getNumer());
		
		Konto konto2 = new Konto("1234", "Ola", 2000);
		System.out.println(konto2.getWlasciciel());
		System.out.println(konto2.getSaldo());
		System.out.println(konto2.getNumer());
		
		System.out.println(konto1);
		System.out.println(konto2);
		
		konto2.wplata(500);
		System.out.println(konto2);
		
	}

}
