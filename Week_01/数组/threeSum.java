package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>>res=new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i< nums.length;i++)
    {
        int target=0-nums[i];
        int left=i+1;
        int right= nums.length-1;
        if(i>0&&nums[i]==nums[i-1])continue;
        while(left<right)
        {
            if(nums[left]+nums[right]==target)
            {
               List<Integer>arr=new ArrayList<>();
               arr.add(nums[i]);
               arr.add(nums[left]);
               arr.add(nums[right]);
               res.add(arr);
               left++;
               right--;
               while(left<right&&nums[left]==nums[left-1])left++;
               while(left<right&&nums[right]==nums[right+1])right--;
            }
            else if(nums[left]+nums[right]>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
    }

    return res;
    }
    public static void main (String args[])
    {
        List<List<Integer>> result=  threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println("做完了");
    }
}
