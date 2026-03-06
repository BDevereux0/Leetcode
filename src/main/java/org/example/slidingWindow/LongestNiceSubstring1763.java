package org.example.slidingWindow;

import java.util.HashSet;
import java.util.Set;

//“LC 1763: D&Q — build set → find invalid char → split & recurse”

public class LongestNiceSubstring1763 {

    public static String longestNiceSubstring(String s) {
        String output = "";

        Set<Character> foundLetters = new HashSet<>();
        for (Character c : s.toCharArray()){
            if (!foundLetters.contains(c)){
                foundLetters.add(c);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String s1 = "abABB";
        String s2 = "YazaAay";
        String s3 = "";
        String s4 = "c";

        //System.out.println(longestNiceSubstring(s1));
        //System.out.println(longestNiceSubstring(s2));
        System.out.println(longestNiceSubstring(s3));
        System.out.println(longestNiceSubstring(s4));

        int a = 'a';
        int A = 'A';
        System.out.println(a);
        System.out.println(A);
    }
}
