package ru.netology.stats.myhwcyclesAmassive.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatsServiceTest {

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15.0;
        double result = service.averageSales(sales);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int result = service.minSales(sales);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int result = service.minSalesMonth(sales);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testBelowAverageSalesMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // 5 месяцев с продажами ниже среднего
        int result = service.belowAverageSalesMonths(sales);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAboveAverageSalesMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // 5 месяцев с продажами выше среднего
        int result = service.aboveAverageSalesMonths(sales);
        Assertions.assertEquals(expected, result);
    }

}

