package com.company;

public class canJump {
    public static boolean canJump(int[] nums) {
    int endreachable= nums.length-1;
    for(int i= nums.length-1;i>=0;i--)
    {
        if(nums[i]+i>=endreachable)
        {
            endreachable=i;
        }
    }
    return endreachable==0;
    }
    public static void main(String args[])
    {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
}
