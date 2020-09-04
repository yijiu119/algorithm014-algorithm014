package com.company;

public class search {
    public static int search(int[] nums, int target) {
     int l=0;
     int len= nums.length;
     int r= len-1;
     while(l<=r)
     {
         int mid=(l+r)/2;
         if(nums[mid]==target)
         {
             return mid;
         }
          if(nums[0]<=nums[mid])
         {
             if(nums[0]<=target&&target<nums[mid])
             {
                 r=mid-1;
             }
             else
             {
                 l=mid+1;
             }
         }
         else
         {
             if(nums[mid]<target&&target<=nums[len-1])
             {
                 l=mid+1;
             }
             else
             {
                 r=mid-1;
             }
         }
     }
     return -1;
    }
    public static void main(String args[])
    {
        int res=search(new int[]{1,3},3);
        System.out.println(res);
    }
}
