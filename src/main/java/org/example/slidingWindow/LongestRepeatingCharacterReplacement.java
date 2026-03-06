package org.example.slidingWindow;

import java.util.HashSet;
import java.util.Set;

//p. 424
public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int result = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        int counter = k;
        while(rightPointer < s.length() -1){
            if(s.charAt(rightPointer+1)==s.charAt(leftPointer)){
                rightPointer++;
                result = Math.max(result, rightPointer - leftPointer);
            } else if (s.charAt(rightPointer+1) != s.charAt(leftPointer) && k >0) {
                rightPointer++;
                counter--;
                result = Math.max(result, rightPointer - leftPointer);
            }else{

                while (set.contains(s.charAt(leftPointer))){
                    leftPointer++;
                }
                counter = k;

            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "ABAB";
        String s2 = "AABABBA";

        System.out.println(characterReplacement(s1, 2));
        System.out.println(characterReplacement(s2, 1));
    }
}
