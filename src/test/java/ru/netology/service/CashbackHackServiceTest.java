package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void shouldCalculateCashbackAmountUnderBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 800;

        int actual = CashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashbackAmountLowerBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = CashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashbackAmountOnBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = CashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashbackAmountUpperBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = CashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashbackAmountOverBoundary() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1450;

        int actual = CashbackHackService.remain(amount);
        int expected = 550;

        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashbackAmountLarge() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 2_200_500;

        int actual = CashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }


}