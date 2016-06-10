package szkolenie.podstawy;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Switch {
    
    public static void wypiszDzienTygodnia(int num) {
        switch(num) {
        case 1 :
            System.out.println("poniedziałek");
            break;
        case 2 :
            System.out.println("wtorek");
            break;
        case 3 :
            System.out.println("środa");
            break;
        case 4 :
            System.out.println("czwartek");
            break;
        case 5 :
            System.out.println("piątek");
            break;
        case 6 :
            System.out.println("sobota");
            break;
        case 7 :
            System.out.println("niedziela");
            break;
        default :
            System.out.println("niepoprawny numer dnia tygodnia");
        }
    }

    public static String dajDzienTygodnia(int num) {
        switch(num) {
        case 1 : return "poniedziałek";
        case 2 : return "wtorek";
        case 3 : return "środa";
        case 4 : return "czwartek";
        case 5 : return "piątek";
        case 6 : return "sobota";
        case 7 : return "niedziela";
        default : throw new IllegalArgumentException("Niepoprawny numer dnia tygodnia");
        }
    }

    
    public static void main(String[] args) {
        int dzienTygodnia = LocalDate.now().get(ChronoField.DAY_OF_WEEK);
        wypiszDzienTygodnia(dzienTygodnia);
        
        System.out.println("Druga wersja:");
        System.out.println(dajDzienTygodnia(dzienTygodnia));

    }

}