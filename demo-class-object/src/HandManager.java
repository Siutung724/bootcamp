public class HandManager {
  private Card[] cards;

  public HandManager(Card[] cards) {
    this.cards = cards;
  }

  public boolean isFlush() {
    if (this.cards.length != 5)
      return false;
    if (this.cards[0].getSuit() != this.cards[1].getSuit()
        || this.cards[1].getSuit() != this.cards[2].getSuit()
        || this.cards[2].getSuit() != this.cards[3].getSuit()
        || this.cards[3].getSuit() != this.cards[4].getSuit())
      return false;
    return true;
  }

  // Test Case Design:
  // 1. return statement
  // 2. for loop (break, continue)
  // 3. array (margin case)
  public boolean isFullHouse() {
    if (this.cards.length != 5)
      return false;
    int[] counts = new int[13];
    for (int i = 0; i < this.cards.length; i++) {
      counts[this.cards[i].getRank().ordinal()]++; // ! updated, after enum
    }
    boolean withThreeCount = false;
    boolean withTwoCount = false;
    for (int i = 0; i < counts.length; i++) { // 40 times
      if (counts[i] == 3)
        withThreeCount = true;
      if (counts[i] == 2)
        withTwoCount = true;
    }
    return withThreeCount && withTwoCount; // 4
  }

  public static void main(String[] args) {
    Card[] cards = new Card[] {new Card(Rank.TWO, 'D'), new Card(Rank.TWO, 'S'),
        new Card(Rank.ACE, 'C'), new Card(Rank.ACE, 'D'), new Card(Rank.ACE, 'S')};
    System.out.println(new HandManager(cards).isFullHouse()); // true

    Card[] cards2 = new Card[] {new Card(Rank.ACE, 'D'), new Card(Rank.ACE, 'S'),
        new Card(Rank.KING, 'C'), new Card(Rank.EIGHT, 'D'), new Card(Rank.EIGHT, 'S')};
    System.out.println(new HandManager(cards2).isFullHouse()); // false
  }
}