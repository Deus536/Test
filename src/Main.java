import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Time.collectBirthday(1989,2,1);
        Time.getPeriodBetweenDates(LocalDate.of(1922,2,3), LocalDate.of(1923,3,1));
    }
}