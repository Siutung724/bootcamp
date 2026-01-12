// ! JVM -> Class Loader -> create enum -> main()
public enum Direction { // class
  EAST('E', -1), SOUTH('S', -2), WEST('W', 1), NORTH('N', 2),; // calling constructor
  // static variables carry static values

  private char value; // E, S, W, N
  private int number; // ! Attribute can be used for presentation relationship

  // ! enum constructor -> private
  // ! JVM call this constructor 4 times
  private Direction(char value, int number) {
    this.value = value;
    this.number = number;
  }

  // Presentation
  // this vs direction
  public boolean isOppsite(Direction direction) {
    return this.number * -1 == direction.getNumber();
  }
  
  // this
  public Direction oppsite() {
    for (Direction d : values()) {
      if (this.number * -1 == d.getNumber())
        return d;
    }
    return null; // not found (Exception, Optional)
  }

  public int getNumber() {
    return this.number;
  }

  public char getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    System.out.println(Direction.NORTH); // "NORTH"
    System.out.println(Direction.NORTH.getValue()); // 'N'
    System.out.println(Direction.NORTH == Direction.NORTH); // true

    // this (Direction.EAST)
    System.out.println(Direction.EAST.isOppsite(Direction.WEST)); // true

    System.out.println(Direction.EAST.isOppsite(Direction.NORTH)); // false
    System.out.println(Direction.SOUTH.oppsite()); // NORTH
  }
}