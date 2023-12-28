package DateandTime;

import java.time.Instant;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
        System.out.println("Duration:   "+duration);
    }
}
