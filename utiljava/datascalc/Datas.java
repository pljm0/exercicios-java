import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Datas {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2024-05-07");
        LocalDateTime d2 = LocalDateTime.parse("2024-05-07T01:30");
        Instant d3 = Instant.parse("2024-05-07T01:30:26Z");

        LocalDate pastWeekLocalDate = d1.minusDays(7);
        LocalDate nextWeekLocalDate = d1.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d2.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d2.plusDays(7);

        Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d1.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d2);
        Duration t3 = Duration.between(pastWeekInstant, d3);
        Duration t4 = Duration.between(d3, pastWeekInstant);


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());

    }

}
