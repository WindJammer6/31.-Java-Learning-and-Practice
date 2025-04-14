//public class TestMyRectangle2D{
//  public static void main (String[] args) {
//    // Test Case 1: Default Constructor
//    MyRectangle2D rect1 = new MyRectangle2D();
//    System.out.println("Test Case 1: Default Constructor");
//    System.out.println("Expected: Center(0.0, 0.0), Width=1.0, Height=1.0");
//    System.out.println("Actual: Center(" + rect1.getX() + ", " + rect1.getY() + "), Width=" + rect1.getWidth() + ", Height=" + rect1.getHeight());
//    System.out.println();
//
//    // Test Case 2: Parameterized Constructor
//    MyRectangle2D rect2 = new MyRectangle2D(2, 3, 5, 4);
//    System.out.println("Test Case 2: Parameterized Constructor");
//    System.out.println("Expected: Center(2.0, 3.0), Width=5.0, Height=4.0");
//    System.out.println("Actual: Center(" + rect2.getX() + ", " + rect2.getY() + "), Width=" + rect2.getWidth() + ", Height=" + rect2.getHeight());
//    System.out.println();
//
//    // Test Case 3: Area and Perimeter
//    System.out.println("Test Case 3: Area and Perimeter");
//    System.out.println("Expected Area: 20.0, Expected Perimeter: 18.0");
//    System.out.println("Actual Area: " + rect2.getArea() + ", Actual Perimeter: " + rect2.getPerimeter());
//    System.out.println();
//
//    // Test Case 4: Contains a Point
//    System.out.println("Test Case 4: Contains Point");
//    System.out.println("Contains Point (2,3) Expected: true, Actual: " + rect2.contains(2, 3));
//    System.out.println("Contains Point (10,10) Expected: false, Actual: " + rect2.contains(10, 10));
//    System.out.println();
//
//    // Test Case 5: Contains Another Rectangle
//    MyRectangle2D rect3 = new MyRectangle2D(2, 3, 2, 2);  // Smaller rectangle inside rect2
//    System.out.println("Test Case 5: Contains Another Rectangle");
//    System.out.println("Expected: true, Actual: " + rect2.contains(rect3));
//    System.out.println();
//
//    // Test Case 6: Overlaps Another Rectangle
//    MyRectangle2D rect4 = new MyRectangle2D(4, 3, 3, 2); // Overlaps with rect2
//    System.out.println("Test Case 6: Overlaps Another Rectangle");
//    System.out.println("Expected: true, Actual: " + rect2.overlaps(rect4));
//    System.out.println();
//
//    // Test Case 7: No Overlap
//    MyRectangle2D rect5 = new MyRectangle2D(10, 10, 2, 2); // Far away
//    System.out.println("Test Case 7: No Overlap");
//    System.out.println("Expected: false, Actual: " + rect2.overlaps(rect5));
//    System.out.println();
//  }
//}
