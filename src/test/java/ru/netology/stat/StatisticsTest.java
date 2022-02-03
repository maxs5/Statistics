package ru.netology.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void sumSales() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void belowAverageSales() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverageSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void upAverageSales() {
        Statistics service = new Statistics();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.upAverageSales(sales);
        assertEquals(expected, actual);
    }
}
