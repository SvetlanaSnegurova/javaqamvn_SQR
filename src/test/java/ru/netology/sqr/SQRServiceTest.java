package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testCalcWhenFewSqrtFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcNoWhenFewSqrtFound() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}