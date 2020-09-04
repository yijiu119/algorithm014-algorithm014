package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class largestValues {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> largestValues(TreeNode root) {
     List<Integer>res=new ArrayList<>();
     Queue<TreeNode>track=new LinkedList<>();
     if(root==null)return res;
     track.offer(root);
     while(!track.isEmpty())
     {
         int n=track.size();
         int max= Integer.MIN_VALUE;
         for(int i=0;i<n;i++)
         {
             TreeNode cur=track.poll();
             max=Math.max(max,cur.val);
             if(cur.left!=null)track.offer(cur.left);
             if(cur.right!=null)track.offer(cur.right);
         }
         res.add(max);
     }
     return res;

    }
}
