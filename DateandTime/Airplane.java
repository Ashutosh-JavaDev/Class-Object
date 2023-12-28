package DateandTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Airplane {
    int flightNumber;
    String destination, samay;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flight Number");
        flightNumber = sc.nextInt();
        
        // Consume the newline character left in the buffer
        sc.nextLine();

        System.out.println("Enter Your Destination");
        destination = sc.nextLine();
        System.out.println("Enter Your Departure Time in HH:mm format");
        samay = sc.nextLine();
    }

    void putData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime departureTime = LocalTime.parse(samay, formatter);
        LocalTime currentTime = LocalTime.now();

        if (currentTime.isBefore(departureTime)) {
            System.out.println("Status: Plane will depart in some time");
        } else if (currentTime.isAfter(departureTime)) {
            System.out.println("Status: Plane will be arriving at its destination in some time");
        } else {
            System.out.println("Status: Plane is on the way for takeoff");
        }
    }

    public static void main(String[] args) {
        Airplane flightInfo = new Airplane();
        flightInfo.getData();
        flightInfo.putData();
    }
}
