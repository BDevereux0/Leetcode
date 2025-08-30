package org.example.math;

public class AliceAndBobPlayingFlowerGame {

    public static long flowerGame(int n, int m){
        int[] leftSet = determineNumOddOrEven(n);
        int[] rightSet = determineNumOddOrEven(m);

        return 1L * leftSet[0] * rightSet[1] + 1L * leftSet[1] * rightSet[0];
    }

    private static int[] determineNumOddOrEven(int num){
        int[] result = new int[2];
        if (num % 2 == 0){
            result[0] = num/2;
            result[1] = num/2;
        }else{
            result[0] = (num -1)/2;
            result[1] = ((num +1)/2);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(flowerGame(3,2));
    }


}
