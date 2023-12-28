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
}
