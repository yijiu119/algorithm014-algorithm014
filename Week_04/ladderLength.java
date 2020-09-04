package com.company;

import java.util.*;

public class ladderLength {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
       /* Set<String>wordSet=new HashSet<>(wordList);
        if(wordSet.size()==0||!wordSet.contains(endWord)){
            return 0;
        }
        wordSet.remove(beginWord);
        Queue<String>queue=new LinkedList<>();
        queue.offer(beginWord);
        Set<String>visited=new HashSet<>();
        visited.add(beginWord);
        int wordlen=beginWord.length();
        int step=1;
        while(!queue.isEmpty())
        {
            int cursize=queue.size();
            for(int i=0;i<cursize;i++)
            {
                String word=queue.poll();
                char[]charArray=word.toCharArray();
                for(int j=0;j<wordlen;j++)
                {
                    char originChar=charArray[j];
                    for(char k='a';k<='z';k++)
                    {
                        if(k==originChar){
                            continue;
                        }
                        charArray[j]=k;
                        String nextWord=String.valueOf(charArray);
                        if(wordSet.contains(nextWord))
                        {
                            if(nextWord.equals(endWord))
                            {
                                return step+1;
                            }
                            if(!visited.contains(nextWord))
                            {
                                queue.add(nextWord);
                                visited.add(nextWord);
                            }
                        }
                    }
                    charArray[j]=originChar;
                }

            }
            step++;
        }
        return (visited.contains(endWord))?step:0;*/
        Set<String>word=new HashSet<>(wordList);
        Set<String>visited=new HashSet<>();
        word.remove(beginWord);
        Queue<String>queue=new LinkedList<>();
        queue.offer(beginWord);
        visited.add(beginWord);
        int step=1;
        while(!queue.isEmpty())
        {
            int size= queue.size();
            for(int i=0;i<size;i++)
            {
                String cur= queue.poll();
                char[]originword=cur.toCharArray();
                int len=originword.length;
                for(int j=0;j<len;j++)
                {
                    char orichar=originword[j];
                    for(char k='a';k<='z';k++)
                    {
                        if(k==orichar)
                            continue;
                        originword[j]=k;
                        String nextword=String.valueOf(originword);
                        if(word.contains(nextword))
                        {
                            if(nextword.equals(endWord))
                                return step+1;
                            if(!visited.contains(nextword))
                            {
                                queue.offer(nextword);
                                visited.add(nextword);
                            }
                        }

                    }
                    originword[j]=orichar;



                }
            }
            step++;
        }
        return (visited.contains(endWord))?step:0;

    }


    public static void main(String args[])
    {
       String beginWord = "hit";
       String endWord = "cog";
       List<String>wordList=new ArrayList<>();
        String[] wordListArray = new String[]{"hot","dot","dog","lot","log","cog"};
        Collections.addAll(wordList, wordListArray);
       int a=ladderLength(beginWord,endWord, wordList);
       System.out.println(a);
    }
}
