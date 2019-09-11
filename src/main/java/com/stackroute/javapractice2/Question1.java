package com.stackroute.javapractice2;

public class Question1 {
    public boolean checkPalindrome(String s)
    {
        String reverseString="";
        for(char ch: s.toCharArray()){
            reverseString=ch+reverseString;
        }
        return s.equalsIgnoreCase(reverseString);
    }
}
