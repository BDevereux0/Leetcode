package org.example.twoPointer;
//problem 409
public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s){
        int leftPointer = s.length() % 2 != 0 ? 0 : (s.length()/2) -1;
        int rightPointer = s.length()/2;
        String result = "";


        while (leftPointer >= 0 && rightPointer < s.length()) {
            if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
                result = s.substring(leftPointer, rightPointer);
                leftPointer--;
                rightPointer++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "yaababababa rz";
        String s4 = "zabay";
        String s5 = "azarfgqnlcvxd";

       // System.out.println(longestPalindrome(s1));
        System.out.println(longestPalindrome(s2));
    }
}


/*
Solution - Don't give up. For Sweetsy Pie and the Super Sillies

The solution is to go through each char, expand as far as i can, then record that distance as greatest.

 */