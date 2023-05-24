package useful;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDate1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, 12, 1);
        LocalDate ld2 = LocalDate.now();
        System.out.println(ld.until(ld2, ChronoUnit.DAYS));
    }
}
