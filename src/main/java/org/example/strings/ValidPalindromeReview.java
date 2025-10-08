package org.example.strings;

public class ValidPalindromeReview {
    public static boolean isPalindrome(String s){

        StringBuilder sb = new StringBuilder();

        for (Character c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        s = sb.toString().toLowerCase();
        int leftPointer = 0;
        int rightPointer = s.length() -1;
        while (leftPointer <= rightPointer){
            if (s.charAt(leftPointer) != s.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}
