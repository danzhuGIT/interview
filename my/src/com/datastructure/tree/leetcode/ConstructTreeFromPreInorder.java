package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

import java.util.HashMap;

/**
 * Created by danzhu on 9/13/14.
 * Given preorder and inorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.

 前序遍历的第一个元素必然是根节点，在中序遍历中找到根节点位置，
 计算中序遍历中根节点前的节点个数，即为左子树的节点个数。
 在前序遍历中找到相应个数的节点，输入到左子树递归中，剩下的元素输入到右子树递归中。
 */
public class ConstructTreeFromPreInorder {
    //time O(n^2)
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //assume the input is valid
        return buildTreeFromPreInOrder(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode buildTreeFromPreInOrder(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart > preEnd)
            return null;

        TreeNode node = new TreeNode(preorder[preStart]);
        if(preStart == preEnd)
            return node;

        int index = inStart;
        while(index<=inEnd){
            if(inorder[index] == preorder[preStart])
                break;
            index++;
        }

        int leftLength = index-inStart;

        node.left = buildTreeFromPreInOrder(preorder, preStart+1, preStart+leftLength, inorder, inStart, index-1);
        node.right = buildTreeFromPreInOrder(preorder, preStart+leftLength+1, preEnd, inorder, index+1, inEnd);

        return node;
    }
    //or use a hashmap to find element in inorder qucikly
    //time O(n)
/*
    public static void main(String[] args){
        int[] pre={7,10,4,3,1,2,8,11};
        int[] in={4,10,3,1,7,11,8,2};
        HashMap<Integer,Integer> mapInorder=new HashMap<Integer,Integer>();
        for(int i=0;i<in.length;i++){
            mapInorder.put(in[i],i);
        }
        TreeNode root=buildInPreorder(mapInorder,pre,in,0,0,in.length);
    }

    public static TreeNode buildInPreorder(HashMap<Integer,Integer> mapInorder,int[] pre,int[] in, int prestart, int instart, int length){
        if(length<=0)
            return null;
        int cur=pre[prestart];
        TreeNode root=new TreeNode(cur);

        int index=mapInorder.get(cur);

        int lnewLength=index-instart;
        int rnewLength=length-lnewLength-1;

        root.left=buildInPreorder(mapInorder,pre,in,prestart+1,instart,lnewLength);
        root.right=buildInPreorder(mapInorder,pre,in,prestart+1+lnewLength,index+1,rnewLength);
        return root;
    }*/
}
