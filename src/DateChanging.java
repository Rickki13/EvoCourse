import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateChanging {
    public void getDates() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String firstDate = in.nextLine();
        Date date1 = convertDate(firstDate);

        addDate(date1, 45);
        beginYear(date1);
        workDate(date1, 10);

        System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
        String secondDate = in.nextLine();
        Date date2 = convertDate(secondDate);

        timeDiff(date1, date2);
    }

    public void addDate(Date date, int days) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        String formattedDate = sdf.format(calendar.getTime());

        System.out.println("Дата после увеличения на " + days +" дней: " + formattedDate);
    }

    public void beginYear(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        String formattedDate = sdf.format(calendar.getTime());

        System.out.println("Дата после сдвига на начало года: " + formattedDate);
    }

    public void workDate(Date date, int days) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int workDays = 0;
        while (workDays < days) {
            calendar.add(Calendar.DATE, 1);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != 6 && dayOfWeek != 7) {
                workDays++;
            }
        }
        String formattedDate = sdf.format(calendar.getTime());

        System.out.println("Дата после увеличения на " + days + " рабочих дней: " + formattedDate);
    }

    public void timeDiff(Date date1, Date date2) {
        Calendar beginCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();
        beginCalendar.setTime(date1);
        endCalendar.setTime(date2);

        if (beginCalendar.after(endCalendar)) {
            Calendar temp = beginCalendar;
            beginCalendar = endCalendar;
            endCalendar = temp;
        }

        int workDays = 0;
        while (beginCalendar.before(endCalendar)) {
            int dayOfWeek = beginCalendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != 6 && dayOfWeek != 7) {
                workDays++;
            }
            beginCalendar.add(Calendar.DATE, 1);
        }

        System.out.println("Количество рабочих дней между введенными датами: " + workDays);
    }

    private static Date convertDate(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        if (isEmpty(str)) {
            System.out.println("Ошибка: Некорректные данные!");
            return null;
        }

        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

}
