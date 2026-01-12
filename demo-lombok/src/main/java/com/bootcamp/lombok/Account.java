package com.bootcamp.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// balance
// Currency
// type (current, saving, etc)
@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Account {
  private double balance;
  private Currency currency;
  private Type type;

  @Getter
  public static enum Currency {
    USD, HKD, CNY,;
  }

  @Getter
  public static enum Type {
    CURRENT, SAVING;
  }

  public static void main(String[] args) {
    // Test Case 1
    Account a1 = new Account(0, Currency.USD, Type.SAVING);

    // Expected Value
    double expectedBalance = 0;
    Currency expectedCurrency = Currency.USD;
    Type expectedType = Type.SAVING;

    // Actual Value
    double actualBalance = a1.getBalance();
    Currency actualCurrency = a1.getCurrency();
    Type actualType = a1.getType();

    System.out.println(expectedBalance == actualBalance); // true
    System.out.println(expectedCurrency == actualCurrency); // true
    System.out.println(expectedType == actualType); // true

    // Setter
    a1.setBalance(100.0);
    System.out.println(100.0 == a1.getBalance());
    System.out.println(Currency.USD == a1.getCurrency());
    System.out.println(Type.SAVING == a1.getType());

    a1.setCurrency(Currency.CNY);
    a1.setType(Type.CURRENT);
    System.out.println(100.0 == a1.getBalance());
    System.out.println(Currency.CNY == a1.getCurrency());
    System.out.println(Type.CURRENT == a1.getType());

    Account a2 = new Account(100.0, Currency.CNY, Type.CURRENT);
    System.out.println(a1.equals(a2)); // true
    System.out.println(a1.hashCode() == a2.hashCode()); // true

  }
}