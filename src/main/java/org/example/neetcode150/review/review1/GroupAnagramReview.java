package org.example.neetcode150.review.review1;

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

/*
A manufacturing company assigns identification codes to products. Each code consists of lowercase English letters.
Due to differences in how codes are generated, multiple products may receive codes containing the same letters
in different arrangements. The company wants to organize its inventory by identifying products that belong to
the same classification. Two product codes belong to the same classification if they contain exactly the same
letters, with the same number of occurrences of each letter, regardless of their arrangement.
Write a function that determines how many distinct product classifications exist.

 */
