package org.example.neetcode150.review.review1;

import java.util.ArrayList;
import java.util.List;

public class EandDString {

    String encode(List<String> strings){
        StringBuilder sb = new StringBuilder();
        for (String s : strings){
            sb.append(s.length())
                    .append("#")
                    .append(s);
        }

        return sb.toString();
    }

    List<String> decode(String encodedString){
        List<String> result = new ArrayList<>();

        int start = 0;
        int decodeFinder = 0;
        while (decodeFinder < encodedString.length()){
            if (encodedString.charAt(decodeFinder) == '#'){
                int length = Integer.parseInt(String.valueOf(encodedString.charAt(decodeFinder-1)));
                System.out.println(length);
                result.add(encodedString.substring(decodeFinder+1, decodeFinder+1+length));
                //capture length
                //build string
                //move start and decode finder

                start = decodeFinder + length;
                decodeFinder = start +1;
            }
            decodeFinder++;

        }



        return result;
    }


    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Hello", "worldz", "3#qwerty"));
        EandDString eds = new EandDString();
        String encodedString = eds.encode(list);
        System.out.println(encodedString);
        System.out.println(
        eds.decode(encodedString));



    }

}
