package bank;

public class TestParametrow {
    
    static void metoda(int x, Konto a, Konto b, Konto c) {
        
        x += 111;
        a.wplata(111);
        b = new Konto(b.getNumer(), b.getWlasciciel(), b.getSaldo() + 111);
        c = a;
        
        System.out.println("Pod koniec metody:");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("x : " + x);
        System.out.println();        
    }
    

    public static void main(String[] args) {
        Konto aa = new Konto("1", "Ala", 1000);
        Konto bb = new Konto("2", "Ola", 2000);
        Konto cc = new Konto("3", "Ula", 3000);
        int xx = 5000;
        
        System.out.println("Przed wywo³aniem");
        System.out.println("aa: " + aa);
        System.out.println("bb: " + bb);
        System.out.println("cc: " + cc);
        System.out.println("xx: " + xx);
        System.out.println();
        
        metoda(xx, aa, bb, cc);
        
        System.out.println("Z prowrotem w main");
        System.out.println("aa: " + aa);
        System.out.println("bb: " + bb);
        System.out.println("cc: " + cc);
        System.out.println("xx: " + xx);
        System.out.println();
    }
}
