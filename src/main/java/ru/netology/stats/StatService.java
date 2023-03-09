package ru.netology.stats;

public class StatService {
    
    public int allSalesSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int allSalesAverageSum (int[] sales) {
        return allSalesSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowSalesMonths(int[] sales) {
        int lowSalesMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[(int) i] < allSalesAverageSum(sales)) {
                lowSalesMonths++;
            }
        }
        return lowSalesMonths;
    }

    public int highSalesMonths(int[] sales) {
        int highSalesMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[(int) i] > allSalesAverageSum(sales)) {
                highSalesMonths++;
            }
        }
        return highSalesMonths;
    }
}