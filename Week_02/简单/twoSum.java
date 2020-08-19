package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoSum {
/*  public static  int[] twoSum(int[] nums, int target) {
        int p=0;
        int q=0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    p=i;
                    q=j;
                    break;
                }
            }
        }
       return new int[]{p,q};
   }*/
public static  int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> num=new HashMap<>();
    int a=0;
    int b=0;

    for(int i=0;i<nums.length;i++)
    {
        num.put(nums[i],i);
    }
    for(int i=0;i<nums.length;i++)
    {
        int tem=target-nums[i];
        if(num.containsKey(tem)&& num.get(tem) != i)
        {
         a=i;
         b=num.get(tem);
         break;
        }
    }
    return new int[]{a,b};


}
public static void main(String args[])
    {
        int[]res=twoSum(new int[]{2, 7, 11, 15},  9);
        for (int x:res) {
            System.out.println(x);
        }

    }
}
