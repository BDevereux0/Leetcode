package org.example.neetcode150.arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!freqMap1.containsKey(s.charAt(i))){
                freqMap1.put(s.charAt(i), 1);
            }else {
                freqMap1.replace(s.charAt(i), freqMap1.get(s.charAt(i)) + 1);
            }

            if (!freqMap2.containsKey(t.charAt(i))){
                freqMap2.put(t.charAt(i), 1);
            }else {
                freqMap2.replace(t.charAt(i), freqMap2.get(t.charAt(i)) +1);
            }
        }

        return freqMap1.equals(freqMap2);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2,t2));
    }

}
