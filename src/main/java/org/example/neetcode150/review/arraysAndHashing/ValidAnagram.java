package org.example.neetcode150.review.arraysAndHashing;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String firstString, String secondString){
        //Since im comparing lowercase letters, i have a constraint of 26. So i can use a freq array
        int[] freqArray = new int[26];
        char subtractionChar = 'a';

        for (char c : firstString.toCharArray()){
            freqArray[c - subtractionChar] += 1;
        }

        for (char c : secondString.toCharArray()){
            freqArray[c - subtractionChar] -=1;
        }

        for (int num : freqArray){
            if (num != 0){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        String s1 = "carrace";

        String s2 = "jar";
        String s3 = "jam";

        String s4 = "x";
        String s5 = "x";


        System.out.println(isAnagram(s, s1));
        System.out.println(isAnagram(s2,s3));
        System.out.println(isAnagram(s4,s5));
    }
}
