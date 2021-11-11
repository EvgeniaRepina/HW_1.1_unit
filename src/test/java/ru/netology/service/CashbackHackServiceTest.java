package ru.netology.service;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService CashbackHackService;
    @Before
    public void initialize() {
        CashbackHackService = new CashbackHackService();
    }

@Test
    public void shouldCalculateCashbackAmountUnderBoundary() {
//    CashbackHackService CashbackHackService = new CashbackHackService();
    int amount = 800;

    int actual = CashbackHackService.remain(amount);
    int expected = 200;

    assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountLowerBoundary() {
//        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = CashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountOnBoundary() {
//        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = CashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountUpperBoundary() {
//        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = CashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountOverBoundary() {
//        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1450;

        int actual = CashbackHackService.remain(amount);
        int expected = 550;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackAmountLarge() {
//        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 2_200_500;

        int actual = CashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }


}