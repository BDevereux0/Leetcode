package org.example.array;

public class TwoSumII {

    //TODO looks like what is broken is i'm starting at index 1 and skipping the first number. Otherwise
    //logic looks ok.
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int leftPointer = 0;
        int rightPointer = numbers.length -1;

        //use condition while (left < right) 
        while (numbers[leftPointer] + numbers[rightPointer] != target){
            if (numbers[leftPointer] + numbers[rightPointer] < target){
                leftPointer++;
            }else
                rightPointer--;
        }
        result[0] = leftPointer +1;
        result[1] = rightPointer +1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] arr2 = {2,3,4};
        int[] arr3 = {-1,0};

        for (int num : twoSum(arr, 9)){
            System.out.print(num);
        }
        System.out.println();

        for (int num : twoSum(arr2, 6)){
            System.out.print(num);
        }
        System.out.println();
        for (int num : twoSum(arr3, -1)){
            System.out.print(num);
        }
    }
}
