package com.company;

public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        int []a=new int[26];
        boolean res=true;
        char[]m=s.toCharArray();
        char[]n=t.toCharArray();
        for(int i=0;i<m.length;i++)
        {
            a[m[i]-'a']++;
        }
        for(int i=0;i<n.length;i++)
        {
            a[n[i]-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0)
            {
                res=false;
                break;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        System.out.println(isAnagram("rat",  "car"));
    }
}
