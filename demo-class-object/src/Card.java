public class Card {
  private char rank; // A 2 3 4 5 6 7 8 9 T J Q K
  private char suit; // D C H S

  // constructor
  public Card(char rank, char suit){
    this.rank = rank;
    this.suit = suit;
  }
  public char getRank() {
    return this.rank;
  }
  public char getSuit() {
    return this.suit;
  }

  // ! No Setter

  public String toString() {
    return "Card(" //
      + "rank =" + this.rank //
      + ",suit =" + this.suit //
      + ")";
  }
}
