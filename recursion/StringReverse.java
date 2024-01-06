package recursion;

import java.util.Scanner;
class reverse{
    void revString(String str){
        if(str.length()<2){
            return;
        }
        else{
            System.out.println(str.charAt(str.length()-1));
            revString(str);
        }
    }
}
public class StringReverse {

}
