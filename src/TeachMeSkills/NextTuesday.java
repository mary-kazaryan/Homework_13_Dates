package TeachMeSkills;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// Получить дату следующего вторника

import java.util.Calendar;
import java.util.GregorianCalendar;

public class NextTuesday {

    public static void main(String[] args) {
        Calendar currentDay = new GregorianCalendar(2021, Calendar.MAY, 26);
        Calendar nextTuesday = new GregorianCalendar();

        nextTuesday.add(Calendar.DATE, 6);

        System.out.println("Here is the date of the next Tuesday: " + " Day: " + nextTuesday.get(Calendar.DAY_OF_MONTH) +
                " Month: " + nextTuesday.get(Calendar.MONTH) + " Year: " + nextTuesday.get(Calendar.YEAR));

    }

}
