public class Ball {
  private Color color;

  // ! private Constructor
  private Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }
  // if Parameter is String, we usually use static method
  public static Ball ofRed() {
    return new Ball(Color.RED);
  }
}

