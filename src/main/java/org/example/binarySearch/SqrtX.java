package org.example.binarySearch;

public class SqrtX {

    //todo so close; yet so far. Re-read notes from last night and try again.

    public static int mySqrt(int x){
        if (x <= 1){
            return x;
        }

        int leftPoint = 0;
        int rightPoint = x;

        while (leftPoint <= rightPoint){
              int midPoint = leftPoint + (rightPoint - leftPoint)/2;
              long square = (long) midPoint * midPoint;

              if (square == x){
                 return midPoint;
              }if (square < x){
                leftPoint = midPoint +1;
              }else {
                rightPoint = midPoint -1;
            }
        }

        return rightPoint;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
