package ru.netology.sqr.JavaqaMV.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.JavaqaMV.services.sqrService;

public class SqrServiceTest {

    @Test
    public void shouldCalcFewMatches() {
        sqrService service = new sqrService();

        int actual = service.calcSqr(200, 400);
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcOneMatches() {
        sqrService service = new sqrService();

        int actual = service.calcSqr(0, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcZeroMatches() {
        sqrService service = new sqrService();

        int actual = service.calcSqr(122, 140);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcUpperLimit() {
        sqrService service = new sqrService();

        int actual = service.calcSqr(9802, 12000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcLowerLimit() {
        sqrService service = new sqrService();

        int actual = service.calcSqr(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
