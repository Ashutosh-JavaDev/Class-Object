package GetterSetter;

import java.util.*;

public class MusicLibary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Song You want to Load in you Music Libary");
        int Number = sc.nextInt();
        String str[]=new String[Number];
        musiclibary ob = new musiclibary();
        System.out.println("Enter the Name of Songs you want to Insert in your List");
        for(int i=0;i<Number;i++){
            str[i]=sc.nextLine();   
        }
    }
}
