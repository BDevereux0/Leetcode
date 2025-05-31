package org.example.array;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int counter = 0;

        //I figured this part out. But failed to see I could just use a 2nd loop. I was thinking the
        //2nd loop makes this o(n^2) but its just o(n + n) = o(2n) = o(n)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[counter] = nums[i];
                counter++;
            }
        }

        //Since I calculate the num of non-zeroes using the pointer, I can just use that value to add 0's
        //from that point. ChatGPT helped me on this one :(
        while (counter < nums.length){
            nums[counter] = 0;
            counter++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] nums1 = {1,0,0,3,12};
        moveZeroes(nums1);
    }


}
