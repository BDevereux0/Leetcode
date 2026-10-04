package org.example.neetcode150.arraysAndHashing;

import java.util.Arrays;
//238
public class ProductsOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];

        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
            // put the starting value (leftProduct) because there is nothing to the left of index 0
            // make a running product of everything to the left of i, which is stored in output
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];

            // output now contains the left products, so now i multiply by the right product
            // make a running product of everything to the right of i
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {2,4,5,8};

        ProductsOfArrayExceptSelf products = new ProductsOfArrayExceptSelf();
        System.out.println(Arrays.toString(
        products.productExceptSelf(input)));
    }
}
