package org.example.neetcode150.twoPointers;

public class TrappingRainWater {

    public static int height(int[] height){
        int result = 0;

        int leftPointer = 0;
        int rightPointer = height.length -1;
        int leftMax = 0;
        int rightMax = 0;

        while (leftPointer < rightPointer){
            if (height[leftPointer] < height[rightPointer]){
                leftMax = Math.max(leftMax, height[leftPointer]);
                result += leftMax - height[leftPointer];
                leftPointer++;
            }else {
                rightMax = Math.max(rightMax, height[rightMax]);
                result += rightMax - height[rightPointer];
                rightPointer--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = {4,2,0,3,2,5};
        int[] height3 = {1, 0, 1};


        int[] height4 = {0,2,0,3};
    }
}
