package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
@Test
    public void shouldCalculateCashbackAmountUnderBoundary() {
    CashbackHackService CashbackHackService = new CashbackHackService();
    int amount = 800;

    int actual = CashbackHackService.remain(amount);
    int expected = 200;

    Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountLowerBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = CashbackHackService.remain(amount);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountOnBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = CashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountUpperBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = CashbackHackService.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountOverBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1450;

        int actual = CashbackHackService.remain(amount);
        int expected = 550;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountLarge() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 2_200_500;

        int actual = CashbackHackService.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }


}