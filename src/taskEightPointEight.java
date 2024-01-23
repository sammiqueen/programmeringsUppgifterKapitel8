import java.util.Calendar;
import java.util.Locale;

public class taskEightPointEight {
    public static void main(String[] args) {
        System.out.println(datum());
    }

    public static String datum(){

        String datum = Calendar.getInstance(Locale.FRANCE).getTime().toString();

        String finalDate = finalDateAssembly(datum);

        return finalDate;

    }
    public static String finalDateAssembly(String datum){
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String finalDate = ("placeholder");
        int currentMonth = 0;


        for(int i = 0; i < 12; i++) {

            if (datum.contains(months[i])) {
                currentMonth = i + 1;

                if (currentMonth < 10) {
                    finalDate = datum.substring(24) + " 0" + currentMonth + " " + datum.substring(8, 10);
                } else {
                    finalDate = datum.substring(24) + " " + currentMonth + " " + datum.substring(8, 10);
                }
                break;
            }

        }
        return finalDate;
    }
}

//uppgift 8.8