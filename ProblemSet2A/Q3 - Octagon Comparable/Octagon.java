// Complete this class according to the requirements of the question
public class Octagon implements Comparable<Octagon>{
    private double side;

    //////////////////
    // Constructors //
    //////////////////
    // The 1-arg Constructor
    public Octagon(double side){
        // System.out.println("Octagon 1-Arg Constructor");
        this.side = side;
    }

    //////////////////////
    // Instance Methods //
    //////////////////////
    public double getSide() {
        return side;
    }

    @Override
    public int compareTo(Octagon other){
        if (this.side > other.side){
            return 1;
        } else if (this.side < other.side){
            return -1;
        } else{
            return 0;
        }
    }
}