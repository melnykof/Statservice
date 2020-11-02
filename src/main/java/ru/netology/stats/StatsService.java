package ru.netology.stats;

public class StatsService {

    public long sum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long average(long[] purchases) {
        long sum = sum(purchases);
        return sum / purchases.length;
    }

    public long findMonthWithMax(long[] purchases) {
        long max = findMax(purchases);
        int numberOfMonth = 0;
        int numberOfMonthWithMax = 0;

        for (long purchase : purchases) {
            numberOfMonth += 1;
            if (purchase == max) {
                numberOfMonthWithMax = numberOfMonth;
            }

        }
        return numberOfMonthWithMax;
    }


    public long findMax(long[] purchases) {
        long max = purchases[0];

        for (long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }

        return max;

    }

    public long findMonthWithMin(long[] purchases) {
        long min = findMin(purchases);
        int numberOfMonth = 0;
        int numberOfMonthWithMin = 0;

        for (long purchase : purchases) {
            numberOfMonth += 1;
            if (purchase == min) {
                numberOfMonthWithMin = numberOfMonth;
            }
        }
        return numberOfMonthWithMin;
    }

    public long findMin(long[] purchases) {
        long min = purchases[0];

        for (long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }


    public long monthLessThenAverageCount(long[] purchases) {
        long average = average(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }

    public long monthMoreThenAverageCount(long[] purchases) {
        long average = average(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }
}







