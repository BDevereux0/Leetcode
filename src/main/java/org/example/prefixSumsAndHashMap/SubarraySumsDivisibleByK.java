package org.example.prefixSumsAndHashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//974
public class SubarraySumsDivisibleByK {

    public static int subarraysDivByK(int[] nums, int k){
        int result = 0;
        int sum = 0;
        //<Sum % k, frequency>
        Map<Integer, Integer> map = new HashMap<>();
        int modulo;
        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];
            modulo = sum % k;

            if (map.containsKey(modulo)){
                map.replace(modulo, map.get(modulo) +1);
                result = result + map.get(modulo);
            }else {
                map.put(modulo,0);
            }
        }

        System.out.println(map);

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(nums, 5));

        int[] nums2 = {5};
        System.out.println(subarraysDivByK(nums2, 9));

    }
}



/*
This basically boils down to do something like this:
Calculate prefix sum
sum % k
If the value of of sum % k exists in the map, that means i have a match because:
ex. 4 + 5 = 9; 9 % 5 = 4, because 4 = (5 * 0) leaves 4. So if I have a 4 in the map, I know that if I were to
remove the 4 from the sum (9 - 4) it leaves the 5.

 */