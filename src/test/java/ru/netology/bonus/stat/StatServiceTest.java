package ru.netology.bonus.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatServiceTest {

    @Test
    void shouldCalcSum() {
        StatService service = new StatService();
        int[] sales = {25,45,31,29,10};
        int expected = 140;

        int actual = service.calcSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatService service = new StatService();
        int[] sales = {25,45,31,29,10};
        int expected = 45;

        int actual = service.findMax(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckLength() {
        StatService service = new StatService();
        String[] words = {"Аб", "Ф", "Фыва"};
        int expected = 4;

        int actual = service.findLongestWord(words);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        StatService service = new StatService();
        int[] sales = {25,45,31,29,10};
        int expected = 28;

        int actual = service.findAverage(sales);

        assertEquals(expected, actual);
    }
}