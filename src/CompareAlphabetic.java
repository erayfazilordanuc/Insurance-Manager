
import java.util.Comparator;

public class CompareAlphabetic implements Comparator<Insurance>{
    
    @Override
    public int compare(Insurance i1, Insurance i2){

    return i1.getName().compareTo(i2.getName());    

    }

}
