import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  // ! Shape is the parent Square/ Circle
  // ! But, List<Shape> is NOT the parent of List<Square>/ List<Circle>
  public static double totalArea(List<Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      // ! shape.area() -> Polymorphism
      // The Type of shape is Shape, Shape.class has area()
      // Runtime decides which area method is executed.
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  // ! Runtime decides the type of T
  // <T extends Shape> -> The range of T
  public static <T extends Shape> double totalArea2(List<T> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    // ! We confirmed the type of T is <T extends Shape>
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  public static double totalArea3(List<? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(3));
    
    List<Square> squares = new ArrayList<>();
    squares.add(new Square(10));

    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(4));
    shapes.add(new Square(8));

    // totalArea(circles);
    // totalArea(squares);
    totalArea(shapes);

    totalArea2(circles);
    totalArea2(squares);
    totalArea2(shapes);

    totalArea3(circles);
    totalArea3(squares);
    totalArea3(shapes);
  }
}