package GetterSetter;
import java.util.*;
class musiclibary {
    String SongCollection[];
    void getSong(String SongCollection[]){
        this.SongCollection=SongCollection;
    }    
    String[] setSong(){
        return SongCollection;
    }
    void randomSong() {
        Random random = new Random();
        for (int i = 0; i < SongCollection.length; i++) {
            // Use nextInt to generate a random integer; nextString does not exist
            SongCollection[i] = String.valueOf(random.nextInt(100));
        }
        System.out.println("Played Song:");
        for (String value : SongCollection) {
            System.out.println(value);
        }
    }
    void disp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press1.to add new Song\nPress2. to remove Old Song");
        int press=sc.nextInt();
        switch(press){
            case 1:
            System.out.println("How many song you want to add in List");
            int songnum=sc.nextInt();
            String newSongList[]=new String[songnum];
            System.out.println("Enter the Song in the List");
            for(int i=0;i<songnum;i++){
                newSongList[i]=sc.nextLine();
            }
            System.out.println("Song List Updated:");
            for(int i=0;i<songnum;i++){
                System.out.println(newSongList[i]);
            }
            for(int i=0;i<SongCollection.length;i++){
                System.out.println(SongCollection[i]);
            }
            break;
        }
    }
}
