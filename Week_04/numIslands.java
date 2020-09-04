package com.company;

public class numIslands {

    public static int numIslands(char[][] grid) {
        int count=0;
     int m= grid.length;
     int n= grid[0].length;
     for(int i=0;i<m;i++)
         for(int j=0;j<n;j++)
         {
             if(grid[i][j]=='1')
             {
                 backtrack(grid,i,j);
                 count++;
             }
         }
     return count;
    }
    public static void backtrack(char[][] grid,int i,int j)
    {
        if(i<0||j<0||i>= grid.length||j>=grid[0].length||grid[i][j]!='1')
            return;
        grid[i][j]='0';
        backtrack(grid,i,j+1);
        backtrack(grid,i,j-1);
        backtrack(grid,i-1,j);
        backtrack(grid,i+1,j);
    }
    public static void main(String args[])
    {
        char[][]grid=new char[][]{{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};


        int res=numIslands(grid);
        System.out.println(res);
    }
}
