package org.example.drills.binarySearch;

public class BinarySearchDrill {
        public static int exact(int[] nums, int target){
            int result = -1;
            int start = 0;
            int end = nums.length -1;
            int mid;

            while (start <= end){
                mid = start + (end - start)/2;
                if (nums[mid] == target){
                    result = mid;
                    break;
                }
                    if (nums[mid] < target){
                        start = mid + 1;
                    }else {
                        end = mid  -1;
                    }

            }

            return result;
        }

        public static int lower(int[] nums, int target){
            int result = -1;
            int start = 0;
            int end = nums.length -1;
            int mid = 0;

            while (start < end){
                mid = start + (end - start)/2;
                if (nums[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }
            //return the start and check if the value is actually what i'm looking for.
            if (nums[start] == target){
                return start;
            }
            return result;
        }

        public static int upper(int[] nums, int target){
            int result = -1;
            int start = 0;
            int end = nums.length - 1;
            int mid;
            while (start < end){
                //use upper mid calc
                mid = start + (end - start +1)/2;
                if (nums[mid] > target){
                    end = mid -1;
                }else {
                    start = mid;
                }
            }

            if (nums[start] == target){
                return start;
            }

            return result;
        }

    public static void main(String[] args) {
        int[] exact = {1,4,7,9,13,18,21};
        System.out.println(exact(exact, 21));
        int[] lower = {2,5,5,5,8,12,15};
        System.out.println(lower(lower, 5));
        int[] upper = {3,5,5,5,10,14,20};
        System.out.println(upper(upper, 5));
    }
}
