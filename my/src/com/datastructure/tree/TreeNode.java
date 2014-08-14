package com.datastructure.tree;

/**
 * Created by danzhu on 6/30/14.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){
        val = x;
    }

    public void insert(int d){

        if(d>val){
            if(right==null){
                TreeNode n=new TreeNode(d);
                right=n;
            } else
                right.insert(d);
        }else{
            if(left==null){
                TreeNode n=new TreeNode(d);
                left=n;
            }else
                left.insert(d);
        }
    }
    public void print(){
        System.out.print(val+" ");
        if (left!=null)
            left.print();
        if (right!=null)
            right.print();
    }
}
