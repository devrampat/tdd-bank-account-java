package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

  @Test
  public void startingBalanceZero() {
    Account account = new Account();
    assertThat(account.getBalance()).isEqualTo(0);
  }

  @Test
  public void depositAnAmountToIncreaseTheBalance() {
      Account account = new Account();
      account.addBalance(20);
      assertThat(account.getBalance()).isEqualTo(20);

      account.addBalance(100);
      assertThat(account.getBalance()).isEqualTo(120);
  }

  @Test
  public void validateAmountAfterSuccessfulWithdrawal() {
    Account account = new Account();
    account.addBalance(100);

    account.withdraw(80);
    assertThat(account.getBalance()).isEqualTo(20);
  }
}
