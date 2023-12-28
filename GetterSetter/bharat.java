package GetterSetter;

import java.util.*;

class bharat {
    String Flightname[], Hotelnamee[];

    void getFlight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert How Many Hotels You want to Insert in Your app");
        int HotelNumber = sc.nextInt();
        sc.nextLine();
        String HotelName[] = new String[HotelNumber];
        System.out.println("Insert name of the Hotel");
        for (int i = 0; i < HotelNumber; i++) {
            HotelName[i] = sc.nextLine();
        }
    }
}
