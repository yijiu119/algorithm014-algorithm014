package com.company;

import java.util.PriorityQueue;

public class maxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
    if(nums.length==0||k==0)
        return new int[0];
    int n= nums.length;;
    int []res=new int[n-k+1];
        PriorityQueue<Integer>maxPQ=new PriorityQueue<>((o1, o2) ->(o2-o1));
        for(int i=0;i<n;i++)
        {
            int start=i-k;
            if(start>=0)
            {
                maxPQ.remove(nums[start]);
            }
            maxPQ.add(nums[i]);
            if(maxPQ.size()==k)
            {
                res[i-k+1]=maxPQ.peek();
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int []res=maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
        for(int item:res)
            System.out.println(item);
    }


}
