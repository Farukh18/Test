package junitFrameWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {

    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void shouldGiveNoDiscountForValue999() {
        // Подготовка
        int buySum = 999;
        int expectedSum = 999;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGiveNoDiscountForValue1() {
        int buySum = 1;
        int expectedSum = 1;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGiveNoDiscountForValue333() {
        int buySum = 333;
        int expectedSum = 333;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldGive2PercentDiscountForValue1000() {
        int buySum = 1000;
        int expectedSum = 1000;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(980, resultSum);
    }

    @Test
    public void shouldGive2PercentDiscountForValue2000() {
        int buySum = 2000;
        int expectedSum = 2000;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(1960, resultSum);
    }
}
