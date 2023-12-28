package GetterSetter;

import java.util.*;

class musiclibary {
    String SongCollection[];

    void getSong(String SongCollection[]) {
        this.SongCollection = SongCollection;
    }

    String[] setSong() {
        return SongCollection;
    }

    void randomSong() {
        Random random = new Random();
        int randomIndex = random.nextInt(SongCollection.length);

        System.out.println("Played Random Song:");
        System.out.println(SongCollection[randomIndex]);
    }

    void disp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press1.to add new Song\nPress2. to remove Old Song");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                System.out.println("How many song you want to add in List");
                int songnum = sc.nextInt();
                sc.nextLine();
                String newSongList[] = new String[songnum];
                System.out.println("Enter the Song in the List");
                for (int i = 0; i < songnum; i++) {
                    newSongList[i] = sc.nextLine();
                }
                System.out.println("Song List Updated:");
                for (int i = 0; i < songnum; i++) {
                    System.out.println(newSongList[i]);
                }
                for (int i = 0; i < SongCollection.length; i++) {
                    System.out.println(SongCollection[i]);
                }
                break;
            case 2:
                System.out.println("Enter the name of Song You Want to delete");
                String SongName = sc.nextLine();
                sc.nextLine();
                for (int i = 0; i < SongCollection.length; i++) {
                    if (SongCollection[i].equalsIgnoreCase(SongName)) {
                        SongCollection[i] = "Song Remove";
                    } else {
                        System.out.println("Song Not present in List");
                    }
                }
                break;
            default:
                System.out.println("Press Valid Key");
                break;
        }
    }
}
