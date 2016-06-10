package szkolenie.podstawy;

public class Tabliczka {

    static void tabliczka(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
    
    static void tabliczkaF(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        tabliczka(10);
        System.out.println();
        tabliczkaF(10);
    }

}
