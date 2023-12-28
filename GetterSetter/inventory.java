package GetterSetter;

import java.util.Scanner;

class inventory {
    String HighInventory[], LowInventory[];

    void getHighInventory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Product You want to Insert in High Inventory");
        int num = sc.nextInt();
        sc.nextLine();
        HighInventory = new String[num];
        System.out.println("Enter the Name of the Product");
        for (int i = 0; i < num; i++) {
            HighInventory[i] = sc.nextLine();
        }
    }

    void getLowInventory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Product You want to Insert in Low Inventory");
        int num = sc.nextInt();
        sc.nextLine();

        LowInventory = new String[num];
        System.out.println("Enter the Name of the Product");
        for (int i = 0; i < num; i++) {
            LowInventory[i] = sc.nextLine();
        }
    }

    void dispHighInventory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press1.to Add Product\nPress2.to Remove Product");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                System.out.println("How Many Product You Want to Add in High Inventory");
                int num = sc.nextInt();
                sc.nextLine();
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
                String Removename = sc.nextLine();
                for (int i = 0; i < HighInventory.length; i++) {
                    if (HighInventory[i].equalsIgnoreCase(Removename)) {
                        HighInventory[i] = "Product Remove";
                    } else {
                        System.out.println("Product Not Available in Inventory");
                    }
                }
                break;
            default:
                System.out.println("Invalid Press");
        }
    }

    void compareInventory() {
        int hi = 0, lo = 0;
        for (int i = 0; i < HighInventory.length; i++) {
            for (int j = i + 1; j < LowInventory.length; j++) {
                if (HighInventory[i].equalsIgnoreCase(LowInventory[i])) {
                    hi++;
                }
            }
        }
        if (hi > 0) {
            System.out.println("Product in High and Low Inventory are Equal");
        } else {
            System.out.println("Product Are Not Same in Both Inventory");
        }
    }
}
