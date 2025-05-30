package org.example.array;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit =0;
        int _profit = 0;
        int buy = prices[0];
        int sell = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }else {
                sell = prices[i];
                if ((sell - buy) > _profit) {
                    _profit = sell - buy;
                    profit = sell - buy;
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        int[] price1 = {2,1,2,1,0,1,2};
        System.out.println(maxProfit(price1));
    }
}
