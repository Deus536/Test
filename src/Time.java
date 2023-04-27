import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;


public class Time {
    public static void collectBirthday(int year, int month, int day){
        LocalDate localDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(year,month,day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        int count = 0;
        while (localDate.isAfter(birthday)){
            LocalDate nextBirthday = birthday.plusYears(1);
            birthday = nextBirthday;
            count++;
           System.out.println(count + " - " + nextBirthday.format(formatter) + " - " + nextBirthday.getDayOfWeek().getDisplayName(TextStyle.SHORT,Locale.ENGLISH));
        }
    }
    public static void  getPeriodBetweenDates(LocalDate firstDate, LocalDate secondDate){

        Period p = Period.between(firstDate, secondDate);
        System.out.println("Years: " + p.getYears() + ", Months: " +  p.getMonths() + ", Days: "  + p.getDays());
    }
}
