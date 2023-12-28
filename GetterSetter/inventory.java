package GetterSetter;
import java.util.Scanner;
class inventory {
    String HighInventory[],LowInventory[];
    int Press;
    void geyHighInventory(String HighInventory[]){
        this.HighInventory=HighInventory;
    }
    String[] setHighInventory(){
        return HighInventory;
    }
    void getLowInventory(String LowInventory[]){
        this.LowInventory=LowInventory;
    }
    String[] setLowInventory(){
        return LowInventory;
    }
    void disp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press1.to Add Product\nPress2.to Remove Product");
        int press=sc.nextInt();
        switch(press){
            case 1:
            
        }
    }
}
