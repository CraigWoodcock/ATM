package com.sparta.cw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AppTest {
    @Test
    public void testWithdrawValue157() {
        int[] values = {50, 20, 10, 5, 2, 1};
        int[] quantity = {12, 20, 50, 100, 250, 500};
        int amountToWithdraw = 157;

        App.withdrawValue(values, quantity, amountToWithdraw);

        // Assert expected quantities after withdrawal
        int[] expectedQuantities = {9, 20, 50, 99, 249, 500};
        assertArrayEquals(expectedQuantities, quantity);
    }
    @Test
    public void testWithdrawValue100() {
        int[] values = {50, 20, 10, 5, 2, 1};
        int[] quantity = {12, 20, 50, 100, 250, 500};
        int amountToWithdraw = 100;

        App.withdrawValue(values, quantity, amountToWithdraw);

        // Assert expected quantities after withdrawal
        int[] expectedQuantities = {10, 20, 50, 100, 250, 500};
        assertArrayEquals(expectedQuantities, quantity);
    }
    @Test
    public void testWithdrawValue50() {
        int[] values = {50, 20, 10, 5, 2, 1};
        int[] quantity = {12, 20, 50, 100, 250, 500};
        int amountToWithdraw = 50;

        App.withdrawValue(values, quantity, amountToWithdraw);

        // Assert expected quantities after withdrawal
        int[] expectedQuantities = {11, 20, 50, 100, 250, 500};
        assertArrayEquals(expectedQuantities, quantity);
    }
    @Test
    public void testWithdrawValue26() {
        int[] values = {50, 20, 10, 5, 2, 1};
        int[] quantity = {12, 20, 50, 100, 250, 500};
        int amountToWithdraw = 26;

        App.withdrawValue(values, quantity, amountToWithdraw);

        // Assert expected quantities after withdrawal
        int[] expectedQuantities = {12, 19, 50, 99, 250, 499};
        assertArrayEquals(expectedQuantities, quantity);
    }

}
