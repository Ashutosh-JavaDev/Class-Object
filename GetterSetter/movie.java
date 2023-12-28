package GetterSetter;

import java.util.Scanner;

class movie {
    String Title, Actor, Director;
    int Review;

    void getdata(String Title, String Actor, String Director, int Review) {
        this.Title = Title;
        this.Actor = Actor;
        this.Director = Director;
        this.Review = Review;
    }

    void disp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Add to add review\nPress Remove to Remove review\nPress No to make review Default");
        String rev = sc.nextLine();
        switch (rev.toLowerCase()) {
            case "add":
                System.out.println("How Much Review want to add for Movie");
                int addRev = sc.nextInt();
                System.out.println("Updated review:     " + (addRev + Review));
                break;

            case "remove":
                System.out.println("How Much Review want to Remove for Movie");
                int remRev = sc.nextInt();
                System.out.println("Updated review:     " + (remRev - Review));
                break;
            default:
                System.out.println("Invalid Press");
                break;
        }

    }
}
