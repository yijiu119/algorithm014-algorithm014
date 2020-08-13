package com.company;

public class maxArea {
    public static int maxArea(int[] height) {
     int i=0;
     int j=height.length-1;
     int Minheight=0;
     int area=0;
     while(i<j)
     {
     Minheight=height[i]<height[j]?height[i++]:height[j--];
     area=Math.max(area,(j-i+1)*Minheight);
     }
     return area;
    }
    public static void main(String args[])
    {
     System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
