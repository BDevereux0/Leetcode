package org.example.strings;
public class Largest3SameDigitNumberInString {

    public static String largestGoodInteger(String num){
        int currentValue = 0;
        String result = "";
        int counter = 0;

        currentValue = num.charAt(0);
        for (int i = 0; i < num.length() ; i++) {
            System.out.println(i);
        }



        return result;


    }

    public static void main(String[] args) {
        String num = "6777133339";
        String num2 = "2300019";
        String num3 = "42352338";

        largestGoodInteger(num);

    }
}
