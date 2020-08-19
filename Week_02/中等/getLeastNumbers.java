package com.company;

import java.util.PriorityQueue;

public class getLeastNumbers {
    public static  int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
        int[]res=new int[k];
        for(int i=0;i<arr.length;i++)
        {
            queue.add(arr[i]);
        }
        for(int i=0;i<k;i++)
        {
            res[i]=queue.poll();
        }
        return res;
    }
    public static void main(String args[])
    {
      int[]res=getLeastNumbers(new int[]{3,2,1},2);
        for (int item:res) {
            System.out.println(item);
        }
    }

}
