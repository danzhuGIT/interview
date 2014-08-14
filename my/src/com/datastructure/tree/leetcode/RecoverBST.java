package com.datastructure.tree.leetcode;

import com.datastructure.tree.TreeNode;

import java.util.ArrayList;

/**
 * Created by danzhu on 7/23/14.
 *
 * Two elements of a binary search tree (BST) are swapped by mistake.

 Recover the tree without changing its structure.

 Note:
 A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 confused what "{1,#,2,3}" means?
 *
 */
public class RecoverBST {
    TreeNode pre = null;

    public void recoverTree(TreeNode root) {
        if(root == null)
            return;

        ArrayList<TreeNode> mistake = new ArrayList<TreeNode>();
        inOrder(root, mistake);

        if(mistake.size() == 2){
            int temp  = mistake.get(0).val;
            mistake.get(0).val = mistake.get(1).val;
            mistake.get(1).val = temp;
        }
    }

    public void inOrder(TreeNode root, ArrayList<TreeNode> mistake){
        if(root == null)
            return;

        inOrder(root.left, mistake);
        if(pre != null && pre.val > root.val){
            if(mistake.size() == 0){
                mistake.add(pre);
                mistake.add(root);
            } else {
                mistake.set(1, root);
            }
        }
        pre = root;
        inOrder(root.right, mistake);
    }
}
