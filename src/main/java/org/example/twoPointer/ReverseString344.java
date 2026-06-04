package org.example.twoPointer;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        char left;
        char right;
        while (start < end){
            left = s[start];
            right = s[end];

            s[start] = right;
            s[end] = left;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] ar = {'h', 'e', 'l', 'l', 'o'};
        char[] ar1 = {'H', 'a', 'n', 'n', 'a', 'H'};

        reverseString(ar);
        reverseString(ar1);
    }

}
