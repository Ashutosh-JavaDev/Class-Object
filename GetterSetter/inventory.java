package GetterSetter;

import java.util.Scanner;

class inventory {
    String HighInventory[], LowInventory[];
    void geyHighInventory(String HighInventory[]) {
        this.HighInventory = HighInventory;
    }

    String[] setHighInventory() {
        return HighInventory;
    }

    void getLowInventory(String LowInventory[]) {
        this.LowInventory = LowInventory;
    }

    String[] setLowInventory() {
        return LowInventory;
    }

    void dispHighInventory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press1.to Add Product\nPress2.to Remove Product");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                System.out.println("How Many Product You Want to Add in High Inventory");
                int num = sc.nextInt();
                String HighInventor[] = new String[num];
                System.out.println("Enter the Name of Product");
                for (int i = 0; i < num; i++) {
                    HighInventor[i] = sc.nextLine();
                }
                System.out.println("Updated Inventory");
                for (int i = 0; i < num; i++) {
                    System.out.println(HighInventor[i]);
                }
                for (int i = 0; i < HighInventory.length; i++) {
                    System.out.println(HighInventory[i]);
                }
                break;
            case 2:
            System.out.println("Which Product You Want to Delete");
            String Removename=sc.nextLine();
            for(int i=0;i<HighInventory.length;i++){
                if(HighInventory[i].equalsIgnoreCase(Removename)){
                    HighInventory[i]="Product Remove";
                }
                else{
                    System.out.println("Product Not Available in Inventory");
                }
            }
            break;
            default:
            System.out.println("Invalid Press");
        }
    }
    void compareInventory(){
        for(int i=0;i<HighInventory.length;i++){
            for(int j=0;j<LowInventory.length;j++){
                if(HighInventory[i].equalsIgnoreCase(LowInventory[i])){
                    System.out.println("Product in High and Low Inventory are Equal");
                }
                else{
                    System.out.println("Product Are Not Same in Both Inventory");
                }
            }
        }
    }
}
