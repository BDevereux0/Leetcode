package org.example.divideAndConquer;


//problem: Find the maximum number in an array
public class WorkingWithGPT {


    public static int findMax(int[] arr, int leftIndex, int rightIndex){
        int max = 0;

        //base case - gpt says general D&Q starts with each end of the structure.
        if (leftIndex == rightIndex){
            //its left == right because once those two are on top of each other, there are no other values
            //to check as array.length is effectively one at this point. so we smply return that value as
            //the max.
            return arr[leftIndex];
        }else {

            //note that the midpoint recalculation is what shrinks the range of each method call
            //each subsequent recursive call passes the midPoint depending on which section of the
            //array im working
            int midPoint = leftIndex + (rightIndex - leftIndex) / 2;

            //each recursive call is stored in a local variable to capture the result of each
            //recursive call.
            int leftMax = findMax(arr, leftIndex, midPoint);
            int rightMax = findMax(arr, midPoint + 1, rightIndex);
            max = Math.max(leftMax, rightMax);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] ar = {3,7,2,9,5};
        System.out.println(findMax(ar, 0, (ar.length-1)));

        String x = "Test";
        String y = "test";



    }
}
