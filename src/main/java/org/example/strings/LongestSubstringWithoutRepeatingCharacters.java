package org.example.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//TODO - Handle this edge case: s =  " "; Currently returns 0 because my logic checks for a matching char
//TODO - in the set. With only 1 char of ' ', the correct value is not applied.
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> set = new HashSet();
        char[] arr = s.toCharArray();

        for (char c : arr){
            if (set.contains(c)){
                if (set.size() > result) {
                    result = set.size();
                }
                set.clear();
                set.add(c);
            }else {
                set.add(c);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbb";
        String s2 = "pwwkew";
        String s3 = " ";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
