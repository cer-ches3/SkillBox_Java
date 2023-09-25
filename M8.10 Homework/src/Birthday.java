import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthday {
    public static void main(String[] args) {
        int day = 3;
        int month = 8;
        int year = 1996;

        System.out.println(collectBirthday(year, month, day));
    }

    public static String collectBirthday(int year, int month, int day){
        LocalDate birthday  = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
        int num = 0;
        String list = "";

        while (birthday.isBefore(now) || birthday.isEqual(now)) {
            list += num + " - " + birthday.format(formatter) + System.lineSeparator();
            num++;
            birthday = birthday.plusYears(1);
        }
        return list;
    }
}
