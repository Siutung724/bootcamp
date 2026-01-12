import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {
  private double radius;

  // color + radius
  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  // area()
  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  @Override
  public String toString() {
    return "Circle(" //
        + "radius=" + this.radius //
        + "," + super.toString() //
        + ")";
  }

  // this (super) vs o (circle)
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Circle))
      return false;
    Circle circle = (Circle) o;
    return circle.getRadius() == this.radius //
        // && circle.getColor() == super.getColor();
        && super.equals(circle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius, super.getColor());
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    System.out.println(c1.area()); // ~38.48

    Circle c2 = new Circle(3.5, "RED");
    System.out.println(c1.equals(c2)); // true
    System.out.println(c1.hashCode() == c2.hashCode()); // true
    System.out.println(c1); // Circle(radius=3.5,Shape(color=RED))
    System.out.println(c2); // Circle(radius=3.5,Shape(color=RED))

    Circle c3 = new Circle(3.5, "BLUE");
    System.out.println(c1.equals(c3)); // false
  }
}