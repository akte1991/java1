package bank;

public class TestReferencji {

	public static void main(String[] args) {
		Konto a = new Konto("1111", "Ala", 1000);
		Konto b = new Konto("2222", "Ola", 2000);
		
		Konto c = a;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		a.wplata(100);
		System.out.println("\na.wplata(100);");
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		c.wplata(200);
		System.out.println("\na.wplata(200);");
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		a = b;
		System.out.println("a = b;");
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}

}
