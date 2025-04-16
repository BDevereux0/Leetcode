package org.example.binarySearch;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static int maximumCount(int[] nums){
        int count =0;
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int numPosIntegers = 0;
        int numNegIntegers = 0;


                if (nums[leftPointer] > 0 || nums[rightPointer] < 0){
                    count = nums.length;

                }else {
                     numPosIntegers = findFirstPositiveIndex(nums);
                     numNegIntegers = findFirstNegativeIndex(nums);
                    }

                if (numPosIntegers > numNegIntegers){
                    count = numPosIntegers;
                }else{
                    count = numNegIntegers;
                }


        //TODO use binary search to find the last negative number and the first positive number.

        return count;
    }

    public static int findFirstPositiveIndex(int[] nums){
        int numPosIntegers;
        int leftPointer = 0;
        int rightPointer = nums.length -1;


        while (leftPointer < rightPointer){
            int midPoint = leftPointer + (rightPointer - leftPointer) / 2;
            if (nums[midPoint] <= 0){
                leftPointer = midPoint +1;
            }else {
                rightPointer = midPoint;
            }
        }

        numPosIntegers = nums.length - rightPointer;

        return numPosIntegers;
    }

    public static int findFirstNegativeIndex(int[] nums){
        int numNegIntegers = 0;
        int rightPointer = nums.length - 1;
        int leftPointer = 0;

        while (nums[rightPointer] > 0){
             int midPoint = leftPointer + (rightPointer - leftPointer)/2;

            if (nums[midPoint] >= 0){
                rightPointer = midPoint - 1;
            }else {
                leftPointer = midPoint;
            }
        }

        numNegIntegers = rightPointer + 1;

        return numNegIntegers;
    }

    //todo Found a problem. if the num to the right of the mid point, is negative my algo wont include it.
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        int[] nums1 = {-3,-2,-1, 0, 0, 1, 2};

        System.out.println(maximumCount(nums1));
    }
}
