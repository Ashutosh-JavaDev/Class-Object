package GetterSetter;

import java.util.*;

class libary {
    String Books, arr[];
    int Press;

    void getName(String Books) {
        this.Books = Books;
    }

    String setName() {
        return Books;
    }

    void Lib(int Press) {
        Scanner sc = new Scanner(System.in);
        this.Press = Press;
        switch (Press) {
            case 1:
                System.out.println("How Many Books Want to Add In Libary");
                int Number = sc.nextInt();
                sc.nextLine();
                arr = new String[Number];

                if (Number < 1) {
                    System.out.println("Libary is Empty");
                } else {
                    System.out.println("Enter Name of the Books wants to add in the Libary");
                    for (int i = 0; i < Number; i++) {
                        arr[i] = sc.nextLine();
                    }

                }
        }
    }
}
