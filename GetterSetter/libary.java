package GetterSetter;

import java.util.*;

class libary {
    String arr1[], arr[];
    int Press;

    void getName(String arr1[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Books want to Insert In Libary");
        int Number = sc.nextInt();
        sc.nextLine();
        arr1 = new String[Number];
        System.out.println("Enter Books Name");
        for (int i = 0; i < Number; i++) {
            arr1[i] = sc.nextLine();
        }
        System.out.println("Books Present in Libary");
        for (int i = 0; i < Number; i++) {
            System.out.println(arr1[i]);
        }
    }

    void Lib(int Press) {
        Scanner sc = new Scanner(System.in);
        this.Press = Press;
        switch (Press) {
            case 1:
                System.out.println("How Many New Books Want to Add In Libary");
                int Number = sc.nextInt();
                sc.nextLine();
                arr = new String[Number];

                if (Number < 1) {
                    for (int i = 0; i < Number; i++) {
                        arr[i] = arr1[i];
                    }
                    System.out.println("No New Books Added");
                } else {
                    System.out.println("Enter Name of the Books wants to add in the Libary");
                    for (int i = 0; i < Number; i++) {
                        arr[i] = sc.nextLine();
                    }
                    System.out.println("Libary After Updated");
                    for (int i = 0; i < Number; i++) {
                        System.out.println(arr[i]);
                    }

                }
        }
    }
}
