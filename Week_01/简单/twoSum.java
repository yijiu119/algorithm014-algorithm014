package com.company;

public class twoSum {
    public static  int[] twoSum(int[] nums, int target) {
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
    }
    public static void main(String args[])
    {
        int[]res=twoSum(new int[]{2, 7, 11, 15},  9);
    }
}
