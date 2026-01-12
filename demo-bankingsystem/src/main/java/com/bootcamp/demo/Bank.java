package com.bootcamp.demo;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
  private LinkedHashMap<Long, Account> accounts; // object reference
  private static long accountNumberCount = 0L;

  public Bank() {
    // complete the function
    this.accounts = new LinkedHashMap<>();
  }

  public Account getAccount(Long accountNumber) {
    // complete the function
    return this.accounts.get(accountNumber);
  }

  public Long openCommercialAccount(Company company, int pin,
      double startingDeposit) {
    // complete the function
    Long accountNumber = ++accountNumberCount; // ! if multi-thread, you can lock this line.
    Account account =
        new CommercialAccount(company, accountNumber, pin, startingDeposit);
    this.accounts.put(accountNumber, account);
    return accountNumber;
  }

  public Long openConsumerAccount(Person person, int pin,
      double startingDeposit) {
    // complete the function
    Long accountNumber = ++accountNumberCount; // ! if multi-thread, you can lock this line.
    Account account =
        new ConsumerAccount(person, accountNumber, pin, startingDeposit);
    this.accounts.put(accountNumber, account);
    return accountNumber;
  }

  public boolean authenticateUser(Long accountNumber, int pin) {
    // complete the function
    return this.getAccount(accountNumber).validatePin(pin);
  }

  public double getBalance(Long accountNumber) {
    // complete the function
    return this.getAccount(accountNumber).getBalance();
  }

  public void credit(Long accountNumber, double amount) {
    // complete the function
    this.getAccount(accountNumber).creditAccount(amount);
  }

  public boolean debit(Long accountNumber, double amount) {
    // complete the function
    return this.getAccount(accountNumber).debitAccount(amount);
  }
}