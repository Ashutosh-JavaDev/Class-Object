package GetterSetter;

import java.util.Scanner;

class resturant {
    public String Menuname[];
    float Price[], resturantRating;
    int totalItem;

    void getMenu(String[] Menuname) {
        this.Menuname = Menuname;
    }

    void getPrice(float Price[]) {
        this.Price = Price;
    }
    float[]setPrice(){
        return Price;
    }

    void getresurantRating(float resturantRating) {
        this.resturantRating = resturantRating;

    }

    void gettotalItem(int totalItem) {
        this.totalItem = totalItem;

    }

    String[] setData() {
        return Menuname;
    }

    void disp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1.to add Item in the List\nPress 2. to remove item from the list");
        int Press = sc.nextInt();
        sc.nextLine();
        switch (Press) {
            case 1:
                System.out.println("How many item want to add list");
                int newItem = sc.nextInt();
                sc.nextLine();
                String newItemName[] = new String[newItem];
                Float newPrice[]=new Float[newItem];
                System.out.println("Enter Item Name");
                for (int i = 0; i < newItem; i++) {
                    System.out.println("Item Name:");
                    newItemName[i] = sc.nextLine();
                    System.out.println("Item Price:");
                    newPrice[i]=sc.nextFloat();
                    sc.nextLine();
                }
                System.out.println("List after Updated");
                for (int i = 0; i < Menuname.length; i++) {
                    System.out.println(Menuname[i]);
                }
                for (int i = 0; i < newItemName.length; i++) {
                    System.out.println(newItemName[i]);
                }
                System.out.println("Restaurant Menu:");
                for (int i = 0; i < totalItem; i++) {
                    System.out.println(newItemName[i] + " - $" + newPrice[i]);
                }
                break;
            case 2:
                System.out.println("Which Item you want to remove?");
                String removename = sc.nextLine();
                for (int i = 0; i < Menuname.length; i++) {
                    if (Menuname[i].equalsIgnoreCase(removename)) {
                        Menuname[i] = "Item Sucessfully Removed";
                    } else {
                        System.out.println("Item Not Present in Menu");
                    }
                }
                break;
            default:
                System.out.println("Invalid Press");
                break;
        }
    }

    float calAvgerage() {
        float calculate = resturantRating / totalItem;
        return calculate;
    }
}
