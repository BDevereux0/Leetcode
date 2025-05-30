package org.example.strings;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        String builderChecker = "";
        for (char c : arr){
            //I could have use Character.IsLetterOrDigit(c)
            if (((int)c >= 97 && (int)c <= 122) || ((int)c >= 48 && (int)c <= 57)){
                builderChecker = builderChecker + c;
                sb.append(c);
            }
        }
        System.out.println(builderChecker);
        sb.reverse();

        //this could be sb.toString().contentEquals(sb.reverse());
        return builderChecker.contentEquals(sb);
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
