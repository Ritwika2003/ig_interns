package insight_global.day2;

//Parent class Shape
class Shape {
 int length;

 // Constructor to initialize length
 public Shape(int length) {
     this.length = length;
 }

 // Generic method to calculate area (will be overridden in subclasses)
 public double calculateArea() {
     return 0.0; // Default implementation (it will be overridden in subclasses)
 }
}

//Subclass Rectangle
class Rectangle extends Shape {
 int height;

 // Constructor to initialize length and height
 public Rectangle(int length, int height) {
     super(length); // Call parent constructor
     this.height = height;
 }

 // Override the calculateArea method
 @Override
 public double calculateArea() {
     return length * height; // Area of rectangle = length * height
 }
}

//Subclass Square
class Square extends Shape {

 // Constructor to initialize length (since length is the same for both sides)
 public Square(int length) {
     super(length); // Call parent constructor
 }

 // Override the calculateArea method
 @Override
 public double calculateArea() {
     return length * length; // Area of square = length^2
 }
}

//Subclass Triangle
class Triangle extends Shape {
 int height;

 // Constructor to initialize length and height
 public Triangle(int length, int height) {
     super(length); // Call parent constructor
     this.height = height;
 }

 // Override the calculateArea method
 @Override
 public double calculateArea() {
     return 0.5 * length * height; // Area of triangle = 0.5 * base * height
 }
}



