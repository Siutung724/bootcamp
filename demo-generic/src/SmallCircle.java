import java.util.List;

public class SmallCircle extends Circle {

  public SmallCircle(int radius) {
    super(radius);
  }

  // List<? super Circle>
  // 1. List<Shape>
  // 2. List<Circle>
  public static void add(List<? super Circle> circles) {
    circles.add(new SmallCircle(4));
    circles.add(new Circle(4));
    
    // circles.add(new Square(3)); 
    // ! because not sure the type of "circles" is shape.
  }
}