package com.stackroute.javapractice2;

public class Question2 {
    public  boolean isPower(int num)
    {
        boolean result=true;
        while(num!=1){
            if(num%4 !=0){
                result=false;
                break;
            }
            num/=4;
        }

        return result;
    }
}
