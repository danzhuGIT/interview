package com.datastructure.tree.haitao;

import com.datastructure.tree.TreeNode;

/**
 * Created by danzhu on 8/6/14.
 * 输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。要求不能创建任何新的结点，只调整指针的指向。
 */
public class TreeToDoubleLinkedList {

    public static void main(String[] args){
        TreeNode head=new TreeNode(10);
        head.insert(6);
        head.insert(14);
        head.insert(4);
        head.insert(8);

        TreeNode newHead=treeToDoubleLinkedList(head,true);
        while(newHead!=null){
            System.out.print(newHead.val+" ");
            newHead=newHead.right;
        }

    }

    //change left subtree to list and right subtree recursively
    public static TreeNode treeToDoubleLinkedList(TreeNode node, boolean isRight){
        if(node == null)
            return null;

        TreeNode left = treeToDoubleLinkedList(node.left, false);
        node.left = left;
        if(left != null)
            left.right = node;

        TreeNode right = treeToDoubleLinkedList(node.right, true);
        node.right = right;
        if(right != null)
            right.left = node;

        if(isRight){
            while(node.left != null)
                node = node.left;
        } else {
            while(node.right != null)
                node = node.right;
        }
        return node;
    }
}
