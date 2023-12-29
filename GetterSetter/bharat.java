package GetterSetter;
import java.util.Scanner;

class bharat {
    String FlightName[], HotelName[];

    void getHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert How Many Hotels You want to Insert in Your app");
        int HotelNumber = sc.nextInt();
        sc.nextLine();
        HotelName = new String[HotelNumber];
        System.out.println("Insert name of the Hotel");
        for (int i = 0; i < HotelNumber; i++) {
            HotelName[i] = sc.nextLine();
        }
    }

    void getFlight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert How Many Flight Name You want to Insert in Your app");
        int FlightNumber = sc.nextInt();
        sc.nextLine();
        FlightName = new String[FlightNumber];
        System.out.println("Insert name of the Flight");
        for (int i = 0; i < FlightNumber; i++) {
            FlightName[i] = sc.nextLine();
        }
    }

    void detailHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1. to Book Hotel\nPress 2. to Cancel Hotel");
        int press = sc.nextInt();
        sc.nextLine();
        boolean bookHotel = false;
        boolean canHotel = false;

        switch (press) {
            case 1:
                System.out.println("Insert Hotel Name Want to Book");
                String nameHotel = sc.nextLine();

                for (int i = 0; i < HotelName.length; i++) {
                    if (HotelName[i].equalsIgnoreCase(nameHotel)) {
                        System.out.println("Hotel Book");
                        bookHotel = true;
                        break;
                    }
                }

                if (!bookHotel) {
                    System.out.println("Hotel Not Available");
                }
                break;

            case 2:
                System.out.println("Insert Hotel Name Want to Cancel");
                String cancelHotel = sc.nextLine();

                for (int i = 0; i < HotelName.length; i++) {
                    if (HotelName[i].equalsIgnoreCase(cancelHotel)) {
                        System.out.println("Hotel Cancel");
                        canHotel = true;
                        break;
                    }
                }

                if (!canHotel) {
                    System.out.println("Hotel Not Booked Yet");
                }
                break;

            default:
                System.out.println("Invalid Press");
                break;
        }
    }

    void detailFlight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1. to Book Flight\nPress 2. to Cancel Flight");
        int press = sc.nextInt();
        sc.nextLine();
        boolean bookFlight = false;
        boolean flightCanceled = false;

        switch (press) {
            case 1:
                System.out.println("Insert Flight Name Want to Book");
                String nameFlight = sc.nextLine();

                for (int i = 0; i < FlightName.length; i++) {
                    if (FlightName[i].equalsIgnoreCase(nameFlight)) {
                        System.out.println("Flight Book");
                        bookFlight = true;
                        break;
                    }
                }

                if (!bookFlight) {
                    System.out.println("Flight Not Available");
                }
                break;

            case 2:
                System.out.println("Insert Flight Name Want to Cancel");
                String cancelFlight = sc.nextLine();

                for (int i = 0; i < FlightName.length; i++) {
                    if (FlightName[i].equalsIgnoreCase(cancelFlight)) {
                        System.out.println("Flight Cancel");
                        flightCanceled = true;
                        break;
                    }
                }

                if (!flightCanceled) {
                    System.out.println("Flight Not Booked Yet");
                }
                break;

            default:
                System.out.println("Invalid Press");
                break;
        }
    }
}
