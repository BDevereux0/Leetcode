package org.example.twoPointer;

public class TrappingRainWater42 {
    public static int trap(int[] height){
        int result = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right){
            if (height[left] < height[right]){
                if (height[left] >= leftMax){
                    leftMax = height[left];
                }else {
                    result += leftMax - height[left];
                }
                left++;
            }else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    result += rightMax - height[right];
                }
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
