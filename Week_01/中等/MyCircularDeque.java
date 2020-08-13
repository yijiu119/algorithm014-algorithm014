package com.company;


import javax.swing.tree.TreeNode;

class MyCircularDeque {
        TreeNode head=new TreeNode(-1);
        TreeNode tail=new TreeNode(-1);
        public int size;
        public int capacity;

        /** Initialize your data structure here. Set the size of the deque to be k. */
        public MyCircularDeque(int k) {
         head.right=tail;
         tail.left=head;
         capacity=k;
         size=0;

        }


        /** Adds an item at the front of Deque. Return true if the operation is successful. */
        public boolean insertFront(int value) {
         if(size==capacity)return false;
         TreeNode temp=new TreeNode(value);
         TreeNode next=head.right;
         head.right=temp;
         next.left=temp;
         temp.right=next;
         temp.left=head;
         size++;
         return true;
        }

        /** Adds an item at the rear of Deque. Return true if the operation is successful. */
        public boolean insertLast(int value) {
         if(size==capacity)return false;
         TreeNode temp=new TreeNode(value);
         TreeNode pre=tail.left;
         pre.right=temp;
         tail.left=temp;
         temp.right=tail;
         temp.left=pre;
         size++;
         return true;
        }

        /** Deletes an item from the front of Deque. Return true if the operation is successful. */
        public boolean deleteFront() {
        if(size==0)return false;
        TreeNode next=head.right.right;
        head.right=next;
        next.left=head;
        size--;
        return true;
        }

        /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
        public boolean deleteLast() {
        if(size==0)return false;
        TreeNode pre=tail.left.left;
        tail.left=pre;
        pre.right=tail;
        size--;
        return true;
        }

        /** Get the front item from the deque. */
        public int getFront() {
        if(size==0)return -1;
        return head.right.val;
        }

        /** Get the last item from the deque. */
        public int getRear() {
        if(size==0)return -1;
        return tail.left.val;
        }

        /** Checks whether the circular deque is empty or not. */
        public boolean isEmpty() {
            return size==0;
        }

        /** Checks whether the circular deque is full or not. */
        public boolean isFull() {
          return size==capacity;
        }
        class TreeNode{
            public TreeNode left;
            public TreeNode right;
            public int val;
            TreeNode(int val)
            {
                this.val=val;
            }

        }

         public static void main(String args[])
       {
           MyCircularDeque circularDeque = new MyCircularDeque(3); // 设置容量大小为3
           circularDeque.insertLast(1);			        // 返回 true
           circularDeque.insertLast(2);			        // 返回 true
           circularDeque.insertFront(3);			        // 返回 true
           circularDeque.insertFront(4);			        // 已经满了，返回 false
           circularDeque.getRear();  				// 返回 2
           circularDeque.isFull();				        // 返回 true
           circularDeque.deleteLast();			        // 返回 true
           circularDeque.insertFront(4);			        // 返回 true
           circularDeque.getFront();				// 返回 4

       }


}
