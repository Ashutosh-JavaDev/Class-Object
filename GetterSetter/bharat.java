package GetterSetter;

import java.util.*;

class bharat {
    String FlightName[], HotelName[];

    void getHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert How Many Hotels You want to Insert in Your app");
        int HotelNumber = sc.nextInt();
        sc.nextLine();
        String hotelName[] = new String[HotelNumber];
        this.HotelName = hotelName;
        System.out.println("Insert name of the Hotel");
        for (int i = 0; i < HotelNumber; i++) {
            hotelName[i] = sc.nextLine();
        }
    }

    void getFlight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert How Many Flight Name You want to Insert in Your app");
        int FlightNumber = sc.nextInt();
        sc.nextLine();
        String flightName[] = new String[FlightNumber];
        this.FlightName = flightName;

        System.out.println("Insert name of the Hotel");
        for (int i = 0; i < FlightNumber; i++) {
            flightName[i] = sc.nextLine();
        }
    }

    void Hotelbook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Hotel You Want to Book");
        String Hotname = sc.nextLine();
        for (int i = 0; i < HotelName.length; i++) {
            if (HotelName[i].equalsIgnoreCase(Hotname)) {
                System.out.println("Hotel Booked");
            } else {
                System.out.println("Hotel  Not Available");
            }
        }
    }

    void FlightBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Flight You Want to Book");
        String FliName = sc.nextLine();
        for (int i = 0; i < FlightName.length; i++) {
            if (FlightName[i].equalsIgnoreCase(FliName)) {
                System.out.println("Flight Booked");
            } else {
                System.out.println("Flight  Not Available");
            }
        }
    }

    void HotelCancel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Hotel You Want to Cancel");
        String Hotname = sc.nextLine();
        for (int i = 0; i < HotelName.length; i++) {
            if (HotelName[i].equalsIgnoreCase(Hotname)) {
                System.out.println("Hotel Cancel");
            } else {
                System.out.println("Hotel  Not Available");
            }
        }
    }

    void FlightCancel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Flight You Want to Flight");
        String FlihtName = sc.nextLine();
        for (int i = 0; i < FlightName.length; i++) {
            if (FlightName[i].equalsIgnoreCase(FlihtName)) {
                System.out.println("Flight Cancel");
            } else {
                System.out.println("Flight  Not Available");
            }
        }
    }
}
