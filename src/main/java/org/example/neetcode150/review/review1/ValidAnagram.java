package org.example.neetcode150.review.review1;

public class ValidAnagram {

    public static boolean isAnagram(String s1, String s2){
        int[] singleFrequencyArray = new int[26];
        boolean result = true;

        if (s1.length() != s2.length()){
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            singleFrequencyArray[s1.charAt(i)-'a']++;
            singleFrequencyArray[s2.charAt(i) - 'a']--;
        }

        for (int j : singleFrequencyArray) {
            if (j != 0) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "carrace";

        System.out.println(isAnagram(s1, s2));

        String s3 = "jar";
        String s4 = "jam";

        System.out.println(isAnagram(s3, s4));

    }
}
