package com.company;

public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
     int i=0;
     int j=0;
     while(i<nums.length&&j< nums.length)
     {
         if(nums[i]==nums[j])
         {
             i++;
         }
         else
         {
             j++;
             nums[j]=nums[i];
         }
     }
     return j+1;

    }
    public static void main(String args[])
    {
     int length=removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

}
