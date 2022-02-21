//Question: Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
// Write time and space complexity of your solution as comments in the source file.

// TC: O(n)
// SC: O(1)

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        String input=keyboard.next();

        boolean hasAlphabet[]= new boolean[26];
        boolean checkAlphabets=true;


        for(char i:input.toCharArray()){
            //Finding difference between ASCII values of both the char
            int lowerCase=i-'a';
            int upperCase=i-'A';
            if(lowerCase>=0 && lowerCase<26)
                hasAlphabet[lowerCase]=true;
            else if(upperCase>=0 && upperCase<26)
                hasAlphabet[upperCase]=true;
        }

        for(boolean alphabet:hasAlphabet){
            if(!alphabet){
                System.out.println("false");
                checkAlphabets=false;
                break;
            }
        }
        if(checkAlphabets) System.out.println("true");
    }
}
