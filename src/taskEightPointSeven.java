import java.util.Calendar;
import java.util.Locale;

public class taskEightPointSeven {
    public static void main(String[] args) {
        System.out.println(klockan());
    }

    public static String klockan(){
        String datum = Calendar.getInstance(Locale.FRANCE).getTime().toString();
        return datum.substring(8, 15);
    }
}

//uppgift 8.7
