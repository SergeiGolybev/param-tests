package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    @Test
    void shouldCalculateSqrtCeil() {
        MathService service = new MathService();
        int expected = 7;
        int actual = service.calculateSqrtCeil(49);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateSqrtCeilLarger() {
        MathService service = new MathService();
        int expected = 3;
        int actual = service.calculateSqrtCeil(8);

        assertEquals(expected, actual);
    }
}