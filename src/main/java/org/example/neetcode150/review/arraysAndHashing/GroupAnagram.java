package org.example.neetcode150.review.arraysAndHashing;

import java.sql.Array;
import java.util.*;

/*
A manufacturing company assigns identification codes to products. Each code consists of lowercase English letters.
Due to differences in how codes are generated, multiple products may receive codes containing the same letters
in different arrangements. The company wants to organize its inventory by identifying products that belong to
the same classification. Two product codes belong to the same classification if they contain exactly the same
letters, with the same number of occurrences of each letter, regardless of their arrangement.
Write a function that determines how many distinct product classifications exist.

 */
public class GroupAnagram {

    public static List<List<String>> groupAnagram(List<String> strings){
       //act pots
        Map<String, List<String>> map = new HashMap<>();
        char subtractionValue = 'a';
        for (String s : strings){
            int[] freqMap = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freqMap[ s.charAt(i)  - subtractionValue] += 1;
            }
            if (!map.containsKey(Arrays.toString(freqMap))){
                map.put(Arrays.toString(freqMap), new ArrayList<>(List.of(s)));
            }else {
                map.get(Arrays.toString(freqMap)).add(s);
            }

        }
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("act", "pots", "cat", "tops", "stop", "hat"));
        System.out.println(groupAnagram(list));

    }


}
