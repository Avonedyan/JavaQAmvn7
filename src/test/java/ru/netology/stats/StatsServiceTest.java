package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findSalesSum() {
       StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.allSalesSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void findAverageSalesSum(){
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSum = 15;
        int actualAverageSum = service.allSalesAverageSum(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }
    @Test
    public void findMaxSalesMonth (){
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }
    @Test
    public void findMinSalesMonth () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSalesMonth = 9;
        int actualMinSalesMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }
    @Test
    public void findSumLowSalesMonths () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumLowSalesMonths = 5;
        int actualSumLowSalesMonths = service.lowSalesMonths(sales);
        Assertions.assertEquals (expectedSumLowSalesMonths, actualSumLowSalesMonths);
    }
    @Test
    public void findSumHighSalesMonths () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumHighSalesMonths = 5;
        int actualSumHighSalesMonths = service.highSalesMonths(sales);
        Assertions.assertEquals(expectedSumHighSalesMonths, actualSumHighSalesMonths);
    }
}
