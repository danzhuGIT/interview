package com.datastructure.tree.cracking;

/**
 * Created by danzhu on 8/1/14.
 * Write an algorithm to find the ‘next’ node
 * (e.g., in-order successor) of a given node in a binary search tree where each node has a link to its parent.
 */
public class InorderSuccessor {
    public static void main(String[] args){
        TreeNode four  = new TreeNode(4);
        TreeNode three  = new TreeNode(3);
        TreeNode two  = new TreeNode(2);
        TreeNode one  = new TreeNode(1);
        TreeNode five  = new TreeNode(5);
        TreeNode six  = new TreeNode(6);

        four.left = two;
        two.parent = four;
        four.right = six;
        six.parent = four;
        six.left = five;
        five.parent = six;
        two.right = three;
        three.parent = two;
        two.left = one;
        one.parent = two;
        System.out.print(inorderSucc(three).val);


    }

    public static TreeNode inorderSucc(TreeNode node){
        if(node == null)
            return null;

        if(node.right != null){
            TreeNode temp = node.right;
            while(temp.left != null){
                temp = temp.left;
            }
            return temp;
        } else {
            TreeNode p = node.parent;
            if(p != null){
                if(node == p.left){
                    return p;
                } else {
                    while(p.parent != null && p == p.parent.right){
                        p = p.parent;
                    }
                    return p.parent;
                }
            } else {
                return null;
            }
        }

    }

}
