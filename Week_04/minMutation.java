package com.company;

import java.util.*;

public class minMutation {
    /*public static int minStepCount=Integer.MAX_VALUE;
    public  static int  minMutation(String start, String end, String[] bank) {
        HashSet<String>step=new HashSet<>();
        dfs(step,0,start,end,bank);
        return (minStepCount==Integer.MAX_VALUE)?-1:minStepCount;
    }
    public static void dfs(HashSet<String>step,int stepCount,String current,String end,String[]bank)
    {
        if(current.equals(end))
            minStepCount=Math.min(stepCount,minStepCount);
        for(String str:bank)
        {
            int diff=0;
            for(int i=0;i<str.length();i++)
            {
                if(current.charAt(i)!=str.charAt(i))
                {
                    diff++;
                    if(diff>1)break;
                }
            }
            if(diff==1&&!step.contains(str)){
                step.add(str);
                dfs(step,stepCount+1,str,end,bank);
                step.remove(str);
            }
        }
    }*/
    public  static int  minMutation(String start, String end, String[] bank) {
        if(bank.length==0)return -1;
        char[]choose=new char[]{'A','T','C','G'};
        Set<String>wordlist=new HashSet<>(Arrays.asList(bank));
        Queue<String>q=new LinkedList<>();
        Set<String>visited=new HashSet<>();
        q.offer(start);
        visited.add(start);
        int step=0;
        while(!q.isEmpty())
        {
            int sz=q.size();
            for(int i=0;i<sz;i++)
            {
                String cur=q.poll();
                char[]arr=cur.toCharArray();
                for(int j=0;j<arr.length;j++)
                {
                    char origin=arr[j];
                    for(char item:choose)
                    {
                        if(item==origin)
                            continue;
                        arr[j]=item;
                        String nextword=String.valueOf(arr);
                        if(wordlist.contains(nextword))
                        {
                            if(nextword.equals(end))
                                return step+1;
                            if(!visited.contains(nextword))
                            {
                                q.offer(nextword);
                                visited.add(nextword);
                            }
                        }
                    }
                    arr[j]=origin;
                }

            }
            step++;
        }
        return (visited.contains(end))?step:-1;
    }
    public static void main(String args[])
    {
        String start= "AACCGGTT";
        String end="AAACGGTA";
        String[] bank=new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int a=minMutation(start,end,bank);
        System.out.println(a);
    }
}
