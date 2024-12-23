//Define the Shape Class and its Derived Classes 
class Shape { 
    public double calculateArea() { 
        // Default implementation for base class 
        return 0.0; 
    } 
} 
class Circle extends Shape { 
    double radius; 
    Circle(double radius) { 
        this.radius = radius; 
    } 
    @Override 
    public double calculateArea() { 
        return Math.PI * radius * radius; 
    } 
} 
class Rectangle extends Shape { 
    double width; 
    double height; 
  Rectangle(double width, double height) { 
        this.width = width; 
        this.height = height; 
    } 
 @Override 
    public double calculateArea() { 
         
return width * height; 
    } 
} 
class Square extends Shape { 
    public double side; 
    Square(double side) { 
        this.side = side; 
    } 
    @Override 
    public double calculateArea() { 
        return side * side; 
    } 
} 
class Triangle extends Shape { 
    double base; 
    double height2; 
 
    Triangle(double base, double height2) { 
        this.base = base; 
        this.height2 = height2; 
    } 
 
 @Override 
    public double calculateArea() { 
        return 0.5 * base * height2; 
    } 
} 
class PolymorphismDemo { 
    public static void main(String[] args) { 
        Shape[] shapes = new Shape[4]; 
        shapes[0] = new Circle(5.0); 
        shapes[1] = new Rectangle(4.0, 6.0); 
        shapes[2] = new Square(5); 
        shapes[3] = new Triangle(6, 15); 
 
        // Calculate and display areas of all shapes 
        for (Shape shape : shapes) { 
            System.out.println("Area: " + shape.calculateArea()); 
        } 
    } 
}
