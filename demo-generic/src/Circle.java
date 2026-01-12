public class Circle extends Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return this.radius;
  }

  // Skip BigDecimal
  @Override
  public double area() {
    return this.radius * this.radius * Math.PI;
  }
}