package calendar.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getTodayDate() {
        Date today = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        return date.format(today);
    }
}
