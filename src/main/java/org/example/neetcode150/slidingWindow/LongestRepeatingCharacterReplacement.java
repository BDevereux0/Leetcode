package org.example.neetcode150.slidingWindow;

import java.util.HashSet;
import java.util.Set;

//424
public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k){
        int result = 0;
        int possibleReplacements = k;
        int leftPointer = 0;
        int rightPointer = leftPointer;
        Set<Character> set = new HashSet<>();
        int currentLength = 0;
        while (rightPointer < s.length()){
            if (!set.contains(s.charAt(rightPointer))){
                set.add(s.charAt(rightPointer));
                if (possibleReplacements < 0){
                    possibleReplacements--;
                    rightPointer++;
                }else{
                    result = Math.max(currentLength, result);
                    currentLength--;
                    possibleReplacements++;
                    leftPointer++;
                }
            }else {
                currentLength++;
                rightPointer++;
            }


        }

        return result;
    }


    public static void main(String[] args) {
        String s = "XYYX";
        String s1 = "AAABABB";
        String s2 = "ABAB";
        String s3 = "AABABBA";

        System.out.println(characterReplacement(s,2));
        System.out.println(characterReplacement(s1,1));
        System.out.println(characterReplacement(s2,2));
        System.out.println(characterReplacement(s3,1));

    }

}
