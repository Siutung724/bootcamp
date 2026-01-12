public class Ball {
  private int num;
  private Color color;

  public Ball(int num, Color color) {
    this.color = color;
    this.num = num;
  }

  public Color getColor() {
    return this.color;
  }

  public int getNum() {
    return this.num;
  }

  // enum Color (RED, YELLOW, BLUE)
  // int num

  // toString
  @Override
  public String toString() {
    return "Ball(" //
        + "num=" + this.num //
        + ",color=" + this.color //
        + ")";
  }

  public static enum Color {
    RED, YELLOW, BLUE,;
  }

}