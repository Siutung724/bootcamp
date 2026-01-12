import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball> { // ! A Cert (Interface) to prove the class has some methods
  private Color color;

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public static enum Color {
    RED, BLUE, YELLOW,;
  }

  // RED -> BLUE -> YELLOW
  // ! this Ball vs that Ball
  public int compareTo(Ball that) {
    // ! return this (-1)
    // ! return that (1)
    if (this.color == Color.RED)
      return -1;
    if (that.getColor() == Color.RED)
      return 1;
    if (this.color == Color.BLUE)
      return -1;
    if (that.getColor() == Color.BLUE)
      return 1;
    return 1;
  }

  @Override
  public String toString() {
    return "Ball(" //
        + "color=" + this.color //
        + ")";
  }

  public static void main(String[] args) {
    // ! Arrays.sort()
    int[] arr = new int[] {3, -9, 10, 8};
    Arrays.sort(arr); // ! pass by reference, Primitive (usually for numbers)
    System.out.println(Arrays.toString(arr)); // [-9, 3, 8, 10]

    // ! Collections.sort()
    // HashSet -> add() -> Object.equals()
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.YELLOW));
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.YELLOW));
    balls.add(new Ball(Color.RED));

    // ! Why Collections.sort() know that "ball" has compareTo() method?
    Collections.sort(balls); // ! compareTo
    System.out.println(balls);
    // [Ball(color=RED), Ball(color=RED), Ball(color=BLUE), Ball(color=BLUE), Ball(color=BLUE),
    // Ball(color=YELLOW), Ball(color=YELLOW)]

  }
}