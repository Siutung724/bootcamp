import java.math.BigDecimal;
import java.math.RoundingMode;

public record AccountEntry(Action action, Currency currency, double amount) {
  // private Action action;
  // private Currency currency;
  // private double amount;

  // public AccountEntry(Action action, Currency currency, double amount) {
  // this.action = action;
  // this.currency = currency;
  // this.amount = amount;
  // }

  // public Action getAction() {
  // return this.action;
  // }

  // public Currency getCurrency() {
  // return this.currency;
  // }

  // public double getAmount() {
  // return this.amount;
  // }

  public double amount(Currency currency) {
    if (currency == this.currency)
      return amount;
    if (currency == Currency.USD && this.currency == Currency.HKD) {
      return BigDecimal.valueOf(this.amount) //
          .divide(BigDecimal.valueOf(7.85), 2, RoundingMode.HALF_UP) //
          .doubleValue();
    }
    return amount; // TBC.
  }

  // public void setAmount(double amount) {
  //   this.amount = amount;
  // }

  // eqauls

  // hashCode

  // toString

  public static enum Action {
    DEBIT, CREDIT,;
  }

  public static enum Currency {
    HKD, USD, CNY,;
  }

  public static void main(String[] args) {
    AccountEntry ae = new AccountEntry(Action.CREDIT, Currency.USD, 100);

    // ! Getter
    System.out.println(ae.action());
    System.out.println(ae.currency());
    System.out.println(ae.amount());

    // ! ae has no setter
    // ! one constructor only.
    // ! attribute is final
  }
}