package ClassWork.Lessons_20_per_29.L29_DateTime.P6_DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EXMPL18_2 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(15, 32);
        LocalDate ld = LocalDate.of(2020, Month.SEPTEMBER, 29);
        LocalDateTime ldt = LocalDateTime.of(2021, Month.AUGUST, 31, 14, 45);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(formatter));
    }
}
