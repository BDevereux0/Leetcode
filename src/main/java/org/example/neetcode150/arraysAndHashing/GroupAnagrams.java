package org.example.neetcode150.arraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String toCheck = strs[i];
            Map<Character, Integer> internalMap = new HashMap<>();
            for (int j = 0; j<toCheck.length(); j++ ){
                if (!internalMap.containsKey(toCheck.charAt(j))){
                    internalMap.put(toCheck.charAt(j),1);
                }else{
                    internalMap.replace(toCheck.charAt(j), internalMap.get(toCheck.charAt(j)) +1);
                }
            }

            if (!map.containsKey(internalMap)){
               map.put(internalMap, new ArrayList<>(List.of(strs[i])));
            }else{
                List<String> list;
                list = map.get(internalMap);
                list.add(strs[i]);
                map.replace(internalMap, list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] ar = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(ar));

        String[] ar1 = {""};
        System.out.println(groupAnagrams(ar1));

        String[] ar2 = {"a"};
        System.out.println(groupAnagrams(ar2));

        String[] ar3 = {"ddddddddddg", "dgggggggggg"};
        System.out.println(groupAnagrams(ar3));

    }
}


/*

My solution works but is slow. Next time do this with SFA using an array not Map as i have done
Sorting can is inexpensive for small strings like this.



 */
