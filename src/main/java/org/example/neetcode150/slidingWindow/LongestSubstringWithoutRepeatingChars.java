package org.example.neetcode150.slidingWindow;
//3

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static int lengthOfLongestSubstring(String s){
        int result = 0;
        int currentLength = 0;
        Set<Character> repeatedChars = new HashSet<>();
        int leftPointer = 0;
        int rightPointer = leftPointer;

        while (rightPointer < s.length()){
            if (!repeatedChars.contains(s.charAt(rightPointer))){
                repeatedChars.add(s.charAt(rightPointer));
                rightPointer++;
                currentLength++;
            }else{
                repeatedChars.remove(s.charAt(leftPointer));
                leftPointer++;
                result = Math.max(result, currentLength);
                currentLength -= 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "zxyzxyz";
        String s2 = "xxxx";
        String s3 = "abcabcbb";
        String s4 = "bbbbb";
        String s5 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));
        System.out.println(lengthOfLongestSubstring(s5));


    }

}
