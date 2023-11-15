import java.util.Calendar;

public class TimeStamp {

    public static String getDate() {
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString();
        return dateTimeStr;
    }

}
