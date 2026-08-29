package org.example.prefixSumsAndHashMap;
//303

//***** SEE BELOW FOR AN EXPLANATION OF HOW TO DO THIS PROPERLY *****
public class RangeSumQueryImmutable {
    private int[] nums;
    public RangeSumQueryImmutable(int[] nums){
        this.nums = nums;
    }

    public int sumRange(int left, int right){
        int sum = 0;

        for (int i = left; i <=right; i++) {
            sum += nums[i];
        }


        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,3,-5,2,-1};
        RangeSumQueryImmutable range = new RangeSumQueryImmutable(nums);
        System.out.println(range.sumRange(0,2));
        System.out.println(range.sumRange(2,5));
        System.out.println(range.sumRange(0,5));
    }
}


/*
My solution works but it is not the preferred solution. Because this requires looping through the array
multiple times. Big O(qn) where q = number of times method is called, n = size of array. If n = 10,000 then
I'm potentially doing 30,000 iterations :O

do this instead:

private int[]ar;
public RangeSumQueryImmutable(int[] nums){
    ar = nums;
    //Notice this begins at i = 1 not 0.
    //****I am adding the current index (ar[i]) w/ the prev index, because
    //the prev index represents the current sum
    for (int i = 1; i<nums.length; i++){
        ar[i] += ar[i-1]
    }

    //so ar would be
    //[-2, 0, 3, -2, 0, -1]

    public int sumRange(int left, int right){
        if(left==0) return ar[right];
        return ar[right]-ar[left-1];
    }
}



 */