package com.datastructure.tree.haitao;

import com.datastructure.tree.TreeNode;

import java.util.Stack;

/**
 * Created by danzhu on 8/6/14.
 * 题目：输入一颗二元查找树，将该树转换为它的镜像，即在转换后的二元查找树中，左子树的结点都大于右子树的结点。用递归和循环两种方法完成树的镜像转换。
 例如输入：

 8
 /  \
 6      10
 /\       /\
 5  7    9   11

 输出：

 8
 /  \
 10    6
 /\      /\
 11  9  7  5
 */
public class TreeMirror {
    public static void main(String[] args){
        TreeNode root=new TreeNode(8);
        root.insert(6);
        root.insert(10);
        root.insert(5);
        root.insert(7);
        treeMirror(root);
        root.print();
    }

    //iteration solution
    public static void treeMirror(TreeNode root){
        if(root == null)
            return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left!=null)
                stack.push(node.left);

            if(node.right!=null)
                stack.push(node.right);
        }
    }
}
