package org.example.slidingWindow;

public class DynamicSlidingWindowTechnique {

    public static int minLengthDynamicSlidingWindow(int[] arr, int target){
        int sum = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        int count = 0;

        while (rightPointer < arr.length -1){ //this loop move the right pointer
            //adds right pointer to the sum
            sum += arr[rightPointer];

            //dynamically drives the left pointer
            //TODO fix the count. Its returning 0. I just need to figure out how to set the initial value
            //and then its the minimum from there on out.
            while (sum >= target){
                count = Math.min(count, rightPointer - leftPointer +1);
                sum -= arr[leftPointer];
                leftPointer++;
            }

            rightPointer++;
        }


        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4};
        System.out.println(minLengthDynamicSlidingWindow(arr, 7));
    }
}
