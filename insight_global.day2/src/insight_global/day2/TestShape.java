package insight_global.day2;

//Main class to test the behavior
public class TestShape {
public static void main(String[] args) {
   // Create an array of Shape references
   Shape[] shapes = new Shape[5];

   // Populate the array with Rectangle, Square, and Triangle objects
   shapes[0] = new Rectangle(10, 5);
   shapes[1] = new Square(4);
   shapes[2] = new Triangle(6, 8);
   shapes[3] = new Rectangle(12, 7);
   shapes[4] = new Triangle(10, 3);

   // Demonstrate polymorphism by calling calculateArea() on each element of the array
   for (Shape shape : shapes) {
       System.out.println("Area: " + shape.calculateArea());
   }
}
}
