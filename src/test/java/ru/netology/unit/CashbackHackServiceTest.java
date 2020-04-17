package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CashbackHackServiceTest {

    @Test
    void amountEqualsZero()  {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 0;
        IllegalAccessException exception = assertThrows(IllegalAccessException.class, () -> {
            throw new IllegalAccessException("amount must be greater than zero");
        });

        assertEquals("amount must be greater than zero", exception.getMessage()));
    }

    @Test
    void amountEqualsMoreZero()  {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 500;
        int actual = cashbackHackService.remain(boundary);
        int expected = 500;
        assertEquals(expected, actual);
    }
    @Test
    void amountEqualsBoundary()  {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;
        int actual = cashbackHackService.remain(boundary);
        int expected = 0;
        assertEquals(expected, actual);
    }
}