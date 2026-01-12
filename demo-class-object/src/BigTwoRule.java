// Agent
public enum BigTwoRule implements GameRule {
  INSTANCE;

  private static final int[] STRENGTHS = new int[] {
    1, // THREE
    2,
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
    13
  };

  // ! Learning point
  public int getRankStrength(Rank rank) {
    return STRENGTHS[rank.ordinal()]; // natural order in Rank.java
  }

  public static void main(String[] args) {
    GameRule rule = BigTwoRule.INSTANCE;
    System.out.println(rule.getRankStrength(Rank.TWO)); // 13

    rule = PokerRule.INSTANCE;
    System.out.println(rule.getRankStrength(Rank.TWO)); // 1
  }

}