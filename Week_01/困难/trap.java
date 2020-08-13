package com.company;

public class trap {
    public static int trap(int[] height) {

     int res=0;
     for(int i=1;i<height.length-1;i++)
     {
         int left_max=0;
         int right_max=0;
         for(int j=i;j>=0;j--)
         {
             left_max=Math.max(left_max,height[j]);
         }
         for(int j=i;j<height.length;j++)
         {
             right_max=Math.max(right_max,height[j]);
         }
         res+=Math.min(left_max,right_max)-height[i];
     }
     return res;
    }
    public static void main(String args[])
    {
    System.out.println(trap(new int[]{ 0,1,0,2,1,0,1,3,2,1,2,1}));
    }

}
