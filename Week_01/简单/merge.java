package com.company;

public class merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     int []arr=new int[m+n];
     int i=0;
     int j=0;
     int x=0;
     while(i<m&&j<n)
     {
         if(nums1[i]<=nums2[j])
         {
             arr[x]=nums1[i];
             i++;
             x++;
         }
         else
         {
             arr[x]=nums2[j];
             j++;
             x++;
         }
     }
     while(i<m)
     {
         arr[x]=nums1[i];
         i++;
         x++;
     }
     while(j<n)
     {
         arr[x]=nums2[j];
         j++;
         x++;
     }
    }
    public static void main(String args[])
    {
     merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
