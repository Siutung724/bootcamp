import java.math.BigDecimal;
import java.util.Objects;

public class Rectangular extends Shape {
  private double length;
  private double width;

  public Rectangular(String color, double length, double width) {
    super(color);
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.length) //
        .multiply(BigDecimal.valueOf(this.width)) //
        .doubleValue();
  }

  public double getLength() {
    return this.length;
  }

  public double getWidth() {
    return this.width;
  }

  // toString(), equals(), hashCode()
  @Override
  public String toString() {
    return "Rectangular(" //
        + "length=" + this.length //
        + ",width=" + this.width //
        + "," + super.toString() //
        + ")";
  }

  // this vs o
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Rectangular))
      return false;
    Rectangular rectangular = (Rectangular) o;
    return Objects.equals(this.length, rectangular.getLength())
        && Objects.equals(this.width, rectangular.getWidth())
        && Objects.equals(super.getColor(), rectangular.getColor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.length, this.width, super.getColor());
  }

  public static void main(String[] args) {
    Rectangular r1 = new Rectangular("BLUE", 3.5, 2.5);
    Rectangular r2 = new Rectangular("BLUE", 3.5, 2.5);
    System.out.println(r1.equals(r1)); // true 
    System.out.println(r1.equals(r2)); // true (after override)
    System.out.println(r1.hashCode() == r2.hashCode()); // true (after override)
    System.out.println(r1); // toString()
    System.out.println(r2); // toString()
    // Rectangular(length=3.5,width=2.5,Shape(color=BLUE))

  }
}