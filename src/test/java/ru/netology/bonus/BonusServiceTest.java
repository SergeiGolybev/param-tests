package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'registered user, bonus under limit',100060,true,30",
            "'registered user, bonus over limit',100000060,true,50",
            "'unregistered user, bonus under limit',100060,false,10",
            "'unregistered user, bonus over limit',100000060,false,500"})
    void shouldCalculate(String testName, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический результат);
        // если true то PASS
        // если false то FAIL
        assertEquals(expected, actual);

    }

//    @Test
//    void shouldCalculateRegisteredAndBonusLimited() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные
//        long amount = 1000_000_60;
//        boolean registered = true;
//        long expected = 500;
//
//        // вызываем целевой метод
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический результат);
//        // если true то PASS
//        // если false то FAIL
//        assertEquals(expected, actual);
//
//    }
}