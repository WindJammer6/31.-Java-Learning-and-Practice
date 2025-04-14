// Complete this class 

public class Triangle extends GeometricObjectMod {

    private double a;
    private double b;
    private double c;

    //////////////////
    // Constructors //
    //////////////////
    // The 3-arg Constructor
    Triangle( double a, double b, double c){
        // call the superclass-constructor here according to the requirements of the question
        super();

        // System.out.println("Triangle 2-Arg Constructor");
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
    public double getArea(){
        // Using Heron's formula to calculate the area of a triangle from the length of three sides
        double s = (this.a + this.b + this.c) / 2;
        double area = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
        return area;
    }

    public double getPerimeter(){
        return (this.a + this.b + this.c);
    }
}
