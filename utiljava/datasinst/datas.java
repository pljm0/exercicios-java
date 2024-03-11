import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datas {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2001-05-07");
        LocalDateTime d5 = LocalDateTime.parse("2001-05-07T01:30:26");
        Instant d6 = Instant.parse("2001-05-07T01:30:26Z");
        Instant d7 = Instant.parse("2001-05-07T01:30:26-04:00");

        LocalDate d8 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d9 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2024, 5, 7);
        LocalDateTime d11 = LocalDateTime.of(2024, 5, 7, 2, 30);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println("d5 = " + d5);
        System.out.println("d6 = " + d6);
        System.out.println("d7 = " + d7);
        System.out.println("d8 = " + d8);
        System.out.println("d9 = " + d9);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }

}
