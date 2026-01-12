import java.util.Objects;

public abstract class Shape {
  private String color;

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Shape))
      return false;
    Shape shape = (Shape) o;
    // return shape.getColor().equals(this.color);
    return Objects.equals(shape.getColor(), this.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.color);
  }

  @Override
  public String toString() {
    return "Shape(" //
        + "color=" + this.color //
        + ")";
  }

  // ! abstract method (without implemention)
  // ! Child class MUST implement all abstract methods.
  abstract double area();
  // In other words, if the child is not able to implement area()
  // implies that it is not a shape.
}