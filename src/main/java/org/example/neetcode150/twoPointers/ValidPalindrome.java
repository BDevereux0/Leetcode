package org.example.neetcode150.twoPointers;

import java.util.stream.Stream;

//125
public class ValidPalindrome {

    public static boolean isPalindrome(String str){
        String restructuredString = str.chars().filter(c -> Character.isLetterOrDigit(c))
                        .map(c -> Character.toLowerCase(c))
                        .collect(
                            () -> new StringBuilder(),
                            (stringBuilder, value) ->
                            stringBuilder.appendCodePoint(value),
                            (stringBuilder, stringBuilder2) ->
                            stringBuilder.append(stringBuilder2)
                            )
                        .toString();


        int leftPointer = 0;
        int rightPointer = restructuredString.length()-1;

        while (leftPointer < rightPointer){
            if (restructuredString.charAt(leftPointer) != restructuredString.charAt(rightPointer)){
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        return true;
    }


    public static void main(String[] args) {
        String s1 = "Was it a car or a cat I saw?";
        String s2 = "A man, a plan, a canal: Panama";
        String s3 = " ";
        String s4= "tab a cat";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
    }
}
