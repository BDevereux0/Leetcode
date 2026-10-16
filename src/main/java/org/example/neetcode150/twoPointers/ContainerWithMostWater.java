package org.example.neetcode150.twoPointers;


//11
public class ContainerWithMostWater {

    public static int maxArea(int[] height){
       int result = 0;

       int leftPointer = 0;
       int rightPointer = height.length -1;
       int length = 0;
       while (leftPointer < rightPointer){
        int area = 0;
        int distance = rightPointer - leftPointer;


        if (height[leftPointer] < height[rightPointer]){
            length = height[leftPointer];
            leftPointer++;
        }else{
            length = height[rightPointer];
            rightPointer--;
        }
           area = length * distance;
           result = Math.max(area, result);
       }


       return result;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1, 1};

        System.out.println(maxArea(height2));
        System.out.println(maxArea(height));
    }
}
