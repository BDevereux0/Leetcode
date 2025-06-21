package org.example.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k){
        double result = 0;
        int sum = 0;
        //i<k because array index starts at 0
        for (int i = 0; i < k; i++){
            sum += nums[i];
        }

        result = sum;

        //this works by subtracting the difference between the start and end values of the slide.
        //nums[i] is the end value where nums[i - k] represents the start value.
        //by subtracting these two values I maintain an accurate summation on the number line.
        for (int i = k; i<nums.length; i++){
            sum += nums[i] - nums[ i -k];
            result = Math.max(result,sum);
        }

        return result/k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        int[] nums1 = {5};
        int k1 = 1;
        int[] nums3 = {-1};
        int k2 = 1;
        System.out.println(findMaxAverage(nums, k));
        double test = -1;

    }
}
