package szkolenie.liczby;

public class PlusPlus {

    public static void main(String[] args) {
        int a, x, y, z;
        a = 1; a = a++ + ++a;
        x = 1; x += x;
        y = 1; y += 1 + y++;
        z = 1; z += 1 + z ++ + ++z;
        
        System.out.println("a = " + a);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }

}

