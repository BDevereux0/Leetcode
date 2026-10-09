package org.example.neetcode150.review.review1;

import java.util.Arrays;

public class ArrayProductExceptSelf {

    public static int[] computeProduct(int[] nums){
        int[] result = new int[nums.length];

        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        for (int i= nums.length-1; i >= 0; i--){
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        System.out.println(Arrays.toString(result));


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        int[] nums2 = {0,1,5,9,1};

        computeProduct(nums);
    }


}




//A manufacturing company operates several facilities that contribute to its overall production output.
//Each facility is assigned a multiplier representing its contribution to the company's production
//process. The company's total production multiplier is determined by multiplying the individual
//multipliers of all operating facilities. The company is conducting a reliability assessment to understand
//how temporary facility shutdowns affect production. During the assessment, engineers simulate shutting
//down each facility individually while keeping all other facilities operational.Each simulation is independent,
//meaning all facilities are restored to normal operation before the next simulation begins.
//Management needs a report showing the company's resulting production multiplier for each shutdown scenario.