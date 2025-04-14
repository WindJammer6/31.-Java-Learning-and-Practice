import java.util.*;

//Modify the class header to implement the appropriate interface
public class OctagonComparator implements Comparator<Octagon> {

    //////////////////////
    // Instance Methods //
    //////////////////////
    // With reference to: https://www.w3schools.com/java/java_advanced_sorting.asp (w3schools)

    //then implement the method(s) in the interface
    @Override
    public int compare(Octagon a, Octagon b){
        if (a.getSide() > b.getSide()){
            return 1;
        } else if (a.getSide() < b.getSide()){
            return -1;
        } else{
            return 0;
        }
    }

}


