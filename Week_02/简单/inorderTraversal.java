package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class inorderTraversal {
    List<Integer> res=new ArrayList<>();


    public List<Integer> inorderTraversal(TreeNode root) {
        Queue<TreeNode>num=new LinkedList<TreeNode>();

    inoder(root);
    return res;
    }
    public void inoder(TreeNode root)
    {
        if(root.left!=null)inoder(root.left);
        res.add(root.val);
        if(root.right!=null)inoder(root.right);
    }

}
