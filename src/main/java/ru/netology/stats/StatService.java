package ru.netology.stats;

public class StatService {
    public int allSalesSum;

    public int allSalesSum(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int allSalesAverageSum (long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int averageSum = sum/(sales.length);
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowSalesMonths(long[] sales) {
        int lowSalesMonths = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < allSalesAverageSum(sales)) {
                lowSalesMonths++;
            }
        }
        return lowSalesMonths;
    }

    public int highSalesMonths(long[] sales) {
        int highSalesMonths = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > allSalesAverageSum(sales)) {
                highSalesMonths++;
            }
        }
        return highSalesMonths;
    }
}