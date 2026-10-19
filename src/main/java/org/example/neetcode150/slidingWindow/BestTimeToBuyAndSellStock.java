package org.example.neetcode150.slidingWindow;
//121
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices){
        int result = 0;
        int profit = 0;
        int leftPointer = 0;
        int rightPointer = leftPointer + 1;

        while (rightPointer < prices.length){
            if (prices[rightPointer] <= prices[leftPointer]){
                leftPointer = rightPointer;
            }else {
                profit = prices[rightPointer] - prices[leftPointer];
                result = Math.max(profit, result);
            }
            rightPointer++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        int[] prices1 = {10,8,7,5,2};
        int[] prices2 = {1,5,6,7,8};

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));

    }
}

/*


 * A retail company records its daily sales over n days.
 * Management wants to identify the most profitable period
 * of exactly k consecutive days.
 *
 * Given an integer array sales and an integer k, return
 * the maximum total sales achievable over any k consecutive days.
 */