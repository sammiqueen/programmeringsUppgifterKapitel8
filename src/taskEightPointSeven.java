import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class taskEightPointSeven {
    public static void main(String[] args) {
        System.out.println(klockan());
    }

    public static String klockan(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalTime.now().toString();
    }
}
