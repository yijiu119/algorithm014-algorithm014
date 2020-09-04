package com.company;

public class findMin {
    public static int findMin(int[] nums) {
    int l=0;
    int r= nums.length-1;
    while(l<=r)
    {
        if(nums[r]>=nums[l])
        {
         return nums[l];
        }
        int mid=(l+r)/2;
        if(nums[l]<=nums[mid])
        {
            l=mid+1;
        }
        else
        {
            r=mid;
        }

    }
    return -1;
    }
    public static void main(String args[])
    {
       int res=findMin(new int[]{3,4,5,1,2});
        System.out.println(res);
    }
}
