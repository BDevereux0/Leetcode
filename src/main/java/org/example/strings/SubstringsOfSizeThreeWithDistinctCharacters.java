package org.example.strings;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    public static int countGoodSubstring(String s){
        int count = 0;

        if (s.length()<3) return 0;

        char a;
        char b;
        char c;
        for (int i = 0; i <= s.length()-3; i++) {
            a = s.charAt(i);
            b = s.charAt(i + 1);
            c = s.charAt(i + 2);

            if (a != b && b != c && a != c){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countGoodSubstring("xyzzaz"));
        System.out.println(countGoodSubstring("aababcabc"));
    }
}
