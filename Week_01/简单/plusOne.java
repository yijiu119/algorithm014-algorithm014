package com.company;

public class plusOne {
    public static int[] plusOne(int[] digits) {
       int carry=1;
       for(int i= digits.length-1;i>=0;i--)
       {
           int value=digits[i]+carry;
           digits[i]=value%10;
           carry=value/10;
       }
       if(carry==1)
       {
           int[]res=new int[digits.length+1];
           res[0]=carry;
           for(int j=1;j< res.length;j++)
           {
               res[j]=digits[j-1];
           }
           return res;
       }
       else
       {
           return digits;
       }



    }
    public static void main(String args[])
    {
    int[]res=plusOne(new int[]{9,9,9});
    }
}
