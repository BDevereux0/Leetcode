package org.example.neetcode150.review.arraysAndHashing;

import java.util.*;

public class GroupAnagramReview {

    public static List<String> groupAnagrams(String[] strs){
        List<String> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String string : strs){
            int[] freqArray = new int[26];
            for (int i = 0; i < string.length(); i++) {
                int currentChar = string.charAt(i) - 'a';
                freqArray[currentChar] += 1;
            }
            String key = Arrays.toString(freqArray);

            if (map.containsKey(key)){
               map.get(key).add(string);
            }
            map.computeIfAbsent(key, v -> new ArrayList<>(List.of(string)));

        }
        map.forEach((k,v) -> System.out.println(k +":" + v));
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat", "apple"};
        String[] strs1 = {"x"};
        String[] strs2 = {""};

        groupAnagrams(strs);
    }
}


