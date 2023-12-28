package GetterSetter;

import java.util.Scanner;

class resturant {
    public String Menuname[];
    float Price, resturantRating;
    int totalItem;

    void getData(String[] Menuname, float Price, float resturantRating, int totalItem) {
        this.Menuname = Menuname;
        this.Price = Price;
        this.resturantRating = resturantRating;
        this.totalItem = totalItem;
    }

    String[] setData() {
        return Menuname;
    }

    void disp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1.to add Item in the List\nPress 2. to remove item from the list");
        int Press = sc.nextInt();
        switch (Press) {
            case 1:
                System.out.println("How many item want to add list");
                int newItem = sc.nextInt();
                String newItemName[] = new String[newItem];
                System.out.println("Enter Item Name");
                for (int i = 0; i < newItem; i++) {
                    newItemName[i] = sc.nextLine();
                }
                System.out.println("List after Updated");
                for (int i = 0; i < Menuname.length; i++) {
                    System.out.println(Menuname[i]);
                }
                for (int i = 0; i < newItemName.length; i++) {
                    System.out.println(newItemName[i]);
                }
                break;
                case 2:
                System.out.println("Which Item you want to remove?");
                String removename=sc.nextLine();
                for(int i=0;i<Menuname.length;i++){
                    if(Menuname[i].equalsIgnoreCase(removename)){
                        Menuname[i]="Item Sucessfully Removed";
                    }
                    else{
                        System.out.println("Item Not Present in Menu");
                    }
                }
                    break;
                    default:
    }
}
