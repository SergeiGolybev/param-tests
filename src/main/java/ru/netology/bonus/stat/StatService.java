package ru.netology.bonus.stat;

public class StatService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for(int sale : sales) {
            // sum = sum + sale;
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales) {
        return calcSum(sales) / sales.length;

    }

    public int findMax(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales) {
            if (currentMax < sale) {
                currentMax = sale;
            }
        }
        return currentMax;
    }

    public int findLongestWord(String[] words) {
        int length = 0;
        for (String word : words) {
            int currentLength = word.toCharArray().length;
            if(currentLength > length) {
                length = currentLength;
            }
        }
        return length;
    }
}
