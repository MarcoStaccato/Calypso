package com.staccato.interviewcake.arrays;

public class ReverseInPlace {

    public static void main(String[] args) {

        String test = "Reverse in place";

        System.out.println(reverse(test.toCharArray()));
    }

    public static String reverse(char[] input){
        int start = 0;
        int end = input.length-1;

        while(start< end){
            char aux = input[start];
            input[start] = input[end];
            input[end] = aux;
            start++;
            end--;
        }

        return new String(input);


    }
}
