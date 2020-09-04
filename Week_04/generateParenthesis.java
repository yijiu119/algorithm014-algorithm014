package com.company;


import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

   /* public static List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        if(n==0)return res;
        StringBuilder track=new StringBuilder();
        backtrack(n,n,track,res);
        return res;
    }
    public static void backtrack(int left,int right,StringBuilder track,List<String>res)
    {
        if(right<left)return;
        if(left<0||right<0)return;
        if(left==0&&right==0)
        {
            res.add(track.toString());
            return;
        }
        track.append('(');
        backtrack(left-1,right,track,res);
        track.deleteCharAt(track.length()-1);
        track.append(')');
        backtrack(left,right-1,track,res);
        track.deleteCharAt(track.length()-1);
    }*/

    /*public static List<String>res=new ArrayList<>();
   public static List<String> generateParenthesis(int n) {
   if(n==0)return res;
   backtrack(0,0,"",n);
   return res;
   }
   public static void backtrack(int left,int right,String s,int max)
   {
       if(left==max&&right==max)
       {
           res.add(s);
       }
       if(left<max)
       {
           backtrack(left+1,right,s+"(",max);
       }
       if(left>right)
       {
           backtrack(left,right+1,s+")",max);
       }

   }*/

    public static List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        StringBuilder track=new StringBuilder();
        backtrack(res,track,n,n);
        return res;
    }
    public static void backtrack(List<String>res,StringBuilder track,int right,int left)
    {
        if(right<left)return;
        if(right<0||left<0)return;
        if(right==0&&left==0)
        {
            res.add(track.toString());
        }
        track.append('(');
        backtrack(res,track,right,left-1);
        track.deleteCharAt(track.length()-1);
        track.append(')');
        backtrack(res,track,right-1,left);
        track.deleteCharAt(track.length()-1);
    }
    public static void main(String args[])
    {
      List<String>res=generateParenthesis(3);
      System.out.println(res);
    }

}
