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
        int start = 0;

        for (int i = 0; i <s.length(); i++) {
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(i));
            result = Math.max(result, i - start + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbb";
        String s2 = "pwwkew";
        String s3 = " ";
        String s4 = "dvdfe";
        System.out.println(lengthOfLongestSubstring(s4));


    }
}
