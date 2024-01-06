package recursion;

import java.util.Scanner;
class reverse{
    void revString(String str,int l){
        if(str.length()<2){
            return;
        }
        else{
            l=str.length();
            System.out.println(str.charAt(l-1));
            revString(str,l-1);
        }
    }
}
public class StringReverse {
    public static void main(String[] args) {
        reverse ob=new reverse();
        ob.revString("Ashutosh", "Ashutosh".length());
    }
}
