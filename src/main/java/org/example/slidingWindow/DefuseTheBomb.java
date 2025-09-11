package org.example.slidingWindow;
//problem 1652
public class DefuseTheBomb {

    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        int sum = 0;
        int leftPointer = 0;
        int rightPointer;
        if (k == 0){
            for (int i = 0; i < code.length; i++) {
                result[i] = 0;
            }
        }

        if (k > 0){
            rightPointer = leftPointer;
            //produces initial sum
            for (int i = 1; i <= k; i++) {
                //guards the rightPointer and wraps it for initial sum
                if (rightPointer == code.length){
                    rightPointer = 0;
                }
                rightPointer++;
                sum = sum + code[rightPointer];

            }
            result[leftPointer] = sum;

            while (leftPointer < code.length -1){
                System.out.println("right pointer" + rightPointer);
                leftPointer++;
                rightPointer++;
                if (rightPointer >= code.length){
                    rightPointer = 0;
                }
                sum = sum - code[leftPointer] + code[rightPointer];
                result[leftPointer] = sum;
            }
        }

        if (k < 0){
            leftPointer = code.length - 1;
            rightPointer = leftPointer;
            //gets the sum
            for (int i = code.length -1; i > leftPointer - Math.abs(k) ; i--) {
                if (rightPointer < 0){
                    rightPointer = code.length-1;
                }else{
                    rightPointer--;
                    sum = sum + code[rightPointer];
                }
            }
            result[leftPointer] = sum;

            while (leftPointer > 0){
                leftPointer--;
                rightPointer--;
                if (rightPointer < 0){
                    rightPointer = code.length-1;
                }
                sum = sum + code[rightPointer] - code[leftPointer];
                result[leftPointer] = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /*int[] arr = {1,2,3,4};
        for (int num: decrypt(arr, 0)){
            System.out.print(num + " ");
        }*/

        /*int[] arr2 = {5,7,1,4};
        for (int num: decrypt(arr2, 3)){
            System.out.print(num + " ");
        }*/

        /*int[]arr3 = {2,4,9,3};
        for (int num: decrypt(arr3, -2)){
            System.out.print(num + " ");
        }*/

        int[]arr4 = {5,2,2,3,1};
        for (int num: decrypt(arr4, 3)){
            System.out.print(num + " ");
        }
    }
}
