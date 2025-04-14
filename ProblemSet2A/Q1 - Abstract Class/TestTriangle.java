// ATTENTION. You do not need to edit this class. 

public class TestTriangle {

    public static void main(String[] args) {

        GeometricObjectMod triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println(triangle.getArea());  // 6.0
        System.out.println(triangle.getPerimeter()); // 12.0
        System.out.println(triangle.getColour()); // white
    }
}
