package org.example.twoPointer;
//Problem 167
public class TwoSumII167 {

    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length-1;
        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[start] + numbers[end] == target){
                result[0] = start +1;
                result[1] = end +1;
                break;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            }else {
                end--;
            }
        }



        return result;
    }

    public static void main(String[] args) {
        int[] ar = {2,7,11,15};
        int[] ar1 = {2,3,4};
        int[] ar2 = {-1, 0};

        for (int n : twoSum(ar, 9)){
            System.out.print(n + " ");
        }

        System.out.println();

        for (int n : twoSum(ar1, 6)){
            System.out.print(n + " ");
        }

        System.out.println();

        for (int n : twoSum(ar2, -1)){
            System.out.print(n + " ");
        }
    }


}
