package org.xpdojo.bank;

public class Account {
  private Integer balance = 0;

  public Integer getBalance() {
    return balance;
  }

  public void addBalance(Integer balance) {
    this.balance += balance;
  }

  public void withdraw(Integer amount) {
    this.balance -= amount;
  }


}
