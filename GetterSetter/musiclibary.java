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
    void Randomsong(){
        Random song=new Random();
        for(int i=0;i<SongCollection.length;i++){
            
        }
    }
}
