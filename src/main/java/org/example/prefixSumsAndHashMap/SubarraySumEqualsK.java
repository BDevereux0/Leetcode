package org.example.prefixSumsAndHashMap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1, 2, 2, 4, 6, 10 k = 9

//560
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        int sum = 0;
        //key = prefix sum
        //value = how many times i've seen that prefix sum
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            int neededPrefix = sum - k;

            if (map.containsKey(neededPrefix)) {
                result += map.get(neededPrefix);
            }

            if (map.containsKey(sum)) {
                int updateFreq = map.get(sum);
                updateFreq++;
                map.replace(sum, updateFreq);
            } else {
                map.put(sum, 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] ar = {1,1,1};
        int[] ar2 = {1,2,3};

        System.out.println(subarraySum(ar, 2));
       // System.out.println(subarraySum(ar2, 3));
    }

}
/*
1. Update current prefix
2. Determine what OLD prefix would satisfy the problem
3. Look for that prefix in the HashMap
4. Use its frequency
5. Add current prefix to the HashMap
 */