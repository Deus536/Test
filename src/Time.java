import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Time {
    public static void collectBirthday(int year, int month, int day){
        LocalDate localDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(year,month,day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        birthday.format(formatter);
        int count = 0;
        if(localDate.isAfter(birthday)){
            LocalDate nextBirthday = birthday.plusYears(1);
            count++;
           System.out.println(count + " - " + nextBirthday + " - " +nextBirthday.getDayOfMonth() );
        }
    }
}
