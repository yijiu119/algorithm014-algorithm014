package com.company;

public class rotate {
    public static void rotate(int[] nums, int k) {
      int[]arr=new int[nums.length];
      for(int i=0;i< nums.length;i++)
      {
          arr[(i+k)% nums.length]=nums[i];
      }
      for(int i=0;i< nums.length;i++)
      {
          nums[i]=arr[i];
      }

    }
   public static void main(String args[])
   {
    rotate(new int[]{1,2,3,4,5,6,7},3);
   }
}
