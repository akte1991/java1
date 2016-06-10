package szkolenie.podstawy;

import java.time.LocalDate;
import java.time.temporal.ChronoField;


public class Warunki {

    static void jaka(int wartosc) {
        if(wartosc > 0) {
            System.out.println("Wartoœæ dodatnia");
        } else if (wartosc == 0) {
            System.out.println("Wartoœæ równa zero");
        } else {
            System.out.println("Wartoœæ ujemna");
        }
    }
    
    public void zmienne() {
        int k = 1, m = 13, n = k+m;
    }
    
    public static void main(String[] args) {
        int dzienTygodnia = LocalDate.now().get(ChronoField.DAY_OF_WEEK);
        if(dzienTygodnia == 7) {
            System.out.println("Dzisiaj jest niedziela");
        }
        
        if(dzienTygodnia < 3) {
            System.out.println("Pocz¹tek");
        } else {
            System.out.println("Koniec");
        }

    }

}
