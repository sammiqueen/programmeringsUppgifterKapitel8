import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class taskEightPointEight {
    public static void main(String[] args) {
        System.out.println(datum());
    }

    public static String datum(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy:MM:dd");
        return LocalDate.now().toString();
    }
}
