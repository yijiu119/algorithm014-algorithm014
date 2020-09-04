package com.company;

public class mySqrt {
    public static int mySqrt(int x) {
        if(x==0||x==1)
        {
            return x;
        }
        int left=1;
        int right=x;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int target=mid*mid;
            if(target==x)
                return mid;
            else if(target>x)
                right=mid-1;
            else
                left=mid+1;
        }
        return right;
    }
    public static void main(String args[])
    {
        System.out.println(mySqrt(8));
    }
}
