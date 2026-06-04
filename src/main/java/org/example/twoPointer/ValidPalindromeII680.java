package org.example.twoPointer;

public class ValidPalindromeII680 {
    public boolean validPalindrome(String s){
        boolean result = true;

        int leftPointer = 0;
        int rightPointer = s.length()-1;

        while (leftPointer < rightPointer){
            if (s.charAt(leftPointer) == s.charAt(rightPointer)){
                leftPointer++;
                rightPointer--;
            }else{
                if (PalinHelper(leftPointer+1, rightPointer, s) ||
                        PalinHelper(leftPointer, rightPointer-1, s)){
                    break;
                }else {
                    return false;
                }
            }
        }
        return result;
    }

    public boolean PalinHelper(int left, int right, String s){
        boolean result = true;
        while (left <= right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return result;
    }





    public static void main(String[] args) {
        ValidPalindromeII680 vp = new ValidPalindromeII680();
        String s = "aba"; //true
        String s1 = "abca"; //true
        String s2 = "abc"; //false
        String s3 = "deeee"; //true
        System.out.println(vp.validPalindrome(s));
        System.out.println(vp.validPalindrome(s1));
        System.out.println(vp.validPalindrome(s2));
        System.out.println(vp.validPalindrome(s3));
    }
}
