import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datas {

    public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2024-05-07");
        LocalDateTime d2 = LocalDateTime.parse("2024-05-07T01:30");
        Instant d3 = Instant.parse("2024-05-07T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d1 = " + d1.format(fmt1));
        System.out.println("d1 = " + fmt1.format(d1));
        System.out.println("d1 = " + d1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d2 = " + d2.format(fmt1));
        System.out.println("d2 = " + d2.format(fmt2));
        System.out.println("d3 = " + fmt3.format(d3));
        System.out.println("d3 = " + fmt4.format(d2));
        System.out.println("d3 = " + fmt5.format(d3));

    }

}
