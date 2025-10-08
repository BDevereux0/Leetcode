package org.example.binarySearch;

//problem 704
public class BinarySearch {

    public static int search(int[] nums, int target){
        int result = -1;
        int leftPointer = 0;
        int rightPointer = nums.length -1;

        while (leftPointer <= rightPointer){
            int midPointer = leftPointer + (rightPointer - leftPointer)/2;
            //here i used mid pointer instead of nums[midPointer]
            if (nums[midPointer] == target){
                result = midPointer;
                break;
            }else {
                if (target > midPointer){
                    leftPointer = midPointer;
                }else {
                    rightPointer = midPointer;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};

        System.out.println(search(arr, 9));
        System.out.println(search(arr, 2));

        //On this one, after the first check of mid point, rightPointer is at index 1.
        //then i recalc mid and it goes to 0. so i never have the mid point at 1.
        System.out.println(search(arr, 0));
    }
}
