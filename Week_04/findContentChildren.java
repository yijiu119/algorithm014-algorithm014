package com.company;

import java.util.Arrays;

public class findContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res=0;
        int i=0;
        int j=0;
        while(i<g.length&&j<s.length)
        {
            if(s[j]>=g[i])
            {
                res++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
int[]s=new int[]{1,2};
int[]g=new int[]{1,2,3};
System.out.println(findContentChildren(g,s));
    }
}
