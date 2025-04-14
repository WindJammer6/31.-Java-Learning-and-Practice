import java.util.*;

//YOU DO NOT NEED TO MODIFY THIS CODE 
public class Test {
    public static void main(String[] args) {
        ArrayList<Octagon> l = new ArrayList<Octagon>();
        l.add(new Octagon(2));
        l.add(new Octagon(3));
        l.add(new Octagon(1));
        Collections.sort(l);
        for (Octagon o:l)
            System.out.println(o.getSide());
    }
}

// Expected Output:
// 1.0
// 2.0
// 3.0