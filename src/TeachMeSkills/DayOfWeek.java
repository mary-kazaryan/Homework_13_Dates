package TeachMeSkills;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeek {

    public static void main(String[] args) {

        Calendar testDate = new GregorianCalendar(2021, Calendar.MAY, 26);
        int dateOfMonth = testDate.get(Calendar.DAY_OF_WEEK);

        if (dateOfMonth == 1) {
            System.out.println("День недели - Воскресенье");
        } else if (dateOfMonth == 2) {
            System.out.println("День недели - Понедельник");
        } else if (dateOfMonth == 3) {
            System.out.println("День недели - Вторник");
        } else if (dateOfMonth == 4) {
            System.out.println("День недели - Среда");
        } else if (dateOfMonth == 5) {
            System.out.println("День недели - Четверг");
        } else if (dateOfMonth == 6) {
            System.out.println("День недели - Пятница");
        } else if (dateOfMonth == 7) {
            System.out.println("День недели - Суббота");
        }
    }
}
