package org.example.slidingWindow;

import java.util.*;

//problem 187
public class RepeatedDnaSequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> repeatedSequences = new ArrayList<>();

        Set<String> seenSequences = new HashSet<>();
        Set<String> addedSequences = new HashSet<>();

        for (int leftPointer = 0; leftPointer + 10 <= s.length(); leftPointer++){

            String currentSequence = s.substring(leftPointer, leftPointer +10);

            if (seenSequences.contains(currentSequence) && !addedSequences.contains(currentSequence)){

                repeatedSequences.add(currentSequence);
                addedSequences.add(currentSequence);
            }

            seenSequences.add(currentSequence);
        }


        return repeatedSequences;
    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String s2 = "AAAAAAAAAAAAA";

        System.out.println(findRepeatedDnaSequences(s2));
    }
}
