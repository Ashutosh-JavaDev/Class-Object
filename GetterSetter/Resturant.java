package GetterSetter;

import java.util.*;

public class Resturant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        resturant ob = new resturant();
        System.out.println("How many Item You want to add in your resturant at present");
        ob.gettotalItem(sc.nextInt());
        sc.nextLine();
        String Menu[] = new String[ob.totalItem];
        Float RestPrice[] = new Float[ob.totalItem];
        ob.getMenu(Menu);
        System.out.println("Enter Item Name and Price In Resturant List");
        for (int i = 0; i < ob.totalItem; i++) {
            System.out.println("Item Name:");
            Menu[i] = sc.nextLine();
            System.out.println("Item Price:");
            RestPrice[i] = sc.nextFloat();
        }
        System.out.println("What is the Rating Of your Resturant");
        ob.getresurantRating(sc.nextFloat());
        ob.disp();
        System.out.println(ob.setData() + ":   " + ob.setPrice());
        System.out.println("Average Rating of Your Resturant:       "+ob.calAvgerage());
    }
}
