package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//problem 739
public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        int rightPointer = 0;
        int counter = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()){
                stack.push(i);
            }
            if (!stack.isEmpty() && temperatures[i] < temperatures[stack.peek()]){
                stack.push(i);
            }
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                stack.pop();
                counter++;
            }
            if (stack.isEmpty()){
                System.out.println(Math.abs(counter - i));
                counter = 0;
            }
        }

        return result;
    }


    /*

    TODO - review GPTs answer.
    public static int[] dailyTemperatures(int[] T) {
    int n = T.length;
    int[] res = new int[n];
    Deque<Integer> stack = new ArrayDeque<>(); // holds indices, temps strictly decreasing bottom→top

    for (int i = 0; i < n; i++) {
        // Pop all indices whose temperature is less than current (we found their next warmer day)
        while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
            int j = stack.pop();
            res[j] = i - j;            // distance to next warmer day
        }
        // Push current index (stack remains strictly decreasing)
        stack.push(i);
    }
    return res; // any leftover indices naturally stay 0
}
     */

    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] arr2 = {30,40,50,60};
        int[] arr3 = {30,60,90};
    }
}
