package org.example.neetcode150.arraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strings){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.size(); i++) {
            sb.append(strings.get(i).length()).append("#").append(strings.get(i));
        }

        return sb.toString();
    }

    public List<String> decode(String string){
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < string.length()){
            int j = i;

            //increase j until i find the delimiter
            while (string.charAt(j) != '#'){
                j++;
            }

            int stringLength = Integer.parseInt(string.substring(i, j));

            //create the start and end values for the string

            int start = j +1;
            int end = start + stringLength;

            result.add(string.substring(start, end));

            i = end;


        }

        return result;
    }

    public static void main(String[] args) {
        EncodeAndDecodeStrings eds = new EncodeAndDecodeStrings();
        List<String> list = new ArrayList<>(List.of("Hello", "World", "Te#st", "#5aj#ajl"));
        String encodedString = eds.encode(list);
        List<String> decodedList = eds.decode(encodedString);

        System.out.println(encodedString);
        System.out.println(decodedList);
    }
}


/*

5#Hello

Encode:
 1. append length
 2. append #
 3. append string

 Decode:
 1. Start at index i
 2. Find the next #
 3. Everything between i and # is the length
 4. Read exactly that many characters after #
 5. Add that string to the result
 6. Move i to the beginning of the next encoded string


public List<String> decode(String string) {
    List<String> result = new ArrayList<>();

    int i = 0;

    while (i < string.length()) {

        // Find the #
        int j = i;
        while (string.charAt(j) != '#') {
            j++;
        }

        // Everything from i -> j is the length
        int stringLength = Integer.parseInt(string.substring(i, j));

        // Move past the #
        int start = j + 1;

        // Grab exactly stringLength characters
        int end = start + stringLength;

        result.add(string.substring(start, end));

        // Move i to the beginning of the next encoded string
        i = end;
    }

    return result;
}


 */
