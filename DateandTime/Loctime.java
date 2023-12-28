package DateandTime;

import java.time.Instant;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Loctime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime:    " + currentDateTime);
        Instant instantTime = Instant.now();
        System.out.println("instantTime:    " + instantTime);
        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Duration:   " + duration);

        // Formatter
        LocalDateTime current = LocalDateTime.now();

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = current.format(formatter);

        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
