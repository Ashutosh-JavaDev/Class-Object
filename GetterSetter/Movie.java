package GetterSetter;
import java.util.*;
public class Movie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        movie ob=new movie();
        System.out.println("Enter the title  of Movie");
        ob.getdata(sc.nextLine(), null, null, 0);
        System.out.println("Enter movie's Actor Name");
        ob.getdata(null, sc.nextLine(), null, 0);
        System.out.println("Enter Movie Director Name");
        ob.getdata(null, null, sc.nextLine(), 0);
        System.out.println("Enter Current Movie  Review");
        ob.getdata(null, null, null, sc.nextInt());
        ob.disp();
    }
}
