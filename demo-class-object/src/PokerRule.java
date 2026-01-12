public enum PokerRule implements GameRule {
  INSTANCE;
  
    private static final int[] STRENGTHS = new int[] {
    2, // THREE
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13, // ACE
    1 // TWO
  };

  // ! Learning point
  public int getRankStrength(Rank rank) {
    return STRENGTHS[rank.ordinal()]; // natural order in Rank.java
  }
}

