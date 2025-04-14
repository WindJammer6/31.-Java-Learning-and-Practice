// **ATTENTION**
// Edit just this file to submit your answer
// You need not edit TestTriangle.java
// 
// GeometricObject.class: 
// -- This is a Java bytecode file
// -- just leave it alone, you should not click on it and type in it 
// -- Reset the assignment (Actions --> Reset Assignment) if you encounter issues after clicking this file

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;


    //////////////////
    // Constructors //
    //////////////////
    // The no-arg Constructor
    // Extra note: There is 2 ways to define a class instance in the main code without any parameters
    // 1. Define a no-arg Constructor
    // 2. By default, if no Constructors is defined in the class, then class instances are automatically
    //    set to be defined without any parameters
    public Triangle(){
        System.out.println("Triangle No-Arg Constructor");
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // The 3-arg Constructor
    public Triangle(double side1, double side2, double side3){
        System.out.println("Triangle 3-Arg Constructor");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    /////////////////////////////
    // Accessor/getter methods //
    /////////////////////////////
    public double getSide1(){
        return side1;
    }
    public double getSide2(){

        return side2;
    }
    public double getSide3(){
        return side3;
    }


    /////////////////////////////
    // Mutuator/setter methods //
    /////////////////////////////
    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
    public double getArea(){
        double semiPerimeter = (getSide1() + getSide2() + getSide3())/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-getSide1())*(semiPerimeter-getSide2())*(semiPerimeter-getSide3()));
    }

    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String toString(){
        return "Triangle: side1 = " + getSide1() + " side2 = " + getSide2() + " side3 = " + getSide3();
    }
}
