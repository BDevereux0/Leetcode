package org.example.binarySearch;

import java.util.Arrays;
import java.util.Vector;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {

     static int searchInsert(int[] nums,int target){
        //I set the left and right points like this because I'm going to use them dynamically to find the
        //mid-point each iteration of the while loop.
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        //I use this condition because the leftPointer will tell me where the index of the target should be.
        //This is because when the leftPointer moves past the rightPointer I now know I've gone past where it should be.
        //A key insight is that binary Search narrows this down to 2 indices. So that means if the left
        //pointer has moved to the right of the right pointer then I know that where the left index is now
        //is where the target's index should be because of how the pointers are being moved.
        while (leftPointer <= rightPointer){

            //Originally I calculated the halfwayPoint by doing halfwayPoint = nums.length/2. But that will only
            //work once time. Now I can shift the pointers in my while loop and then reacquire the mid-point.
            //Also putting this at the top of the while loop means I won't have to duplicate it in my conditionals
            //don't forget the parentheses around leftPointer + rightPointer
            int halfwayPoint = (leftPointer + rightPointer)/2;
            if (nums[halfwayPoint] == target){
                return halfwayPoint;
            }

            //for both conditionals, I modify the pointer using the halfwayPoint then adjust the midway
            //point. GPT says this technique remains the same so practice practice practice!
            if (nums[halfwayPoint] > target){
                rightPointer = halfwayPoint - 1;
            }else {
                leftPointer = halfwayPoint + 1 ;
            }
        }
        return leftPointer;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }

    //This problem basically looks like this:
    //1. Create pointers and use them to fight a halfway point. midPoint =(leftPointer + rightPointer)/2
    //2. Loop through the array, move the pointers as needed.
    //3. If leftPointer > rightPointer break the loop because the target is not found but its location
    //where it should be, has been found.
    //4. Break the loop if midPoint = target
}
