package com.datastructure.tree.careercup;

import com.datastructure.tree.TreeNode;

import java.util.ArrayList;

/**
 * Created by danzhu on 8/1/14.
 *
 * Given two nodes of a binary tree, find number of nodes on the path between the two nodes.
 * 1
 2  3
 4   5

 4, 3 -> (4-2-1-3): 4
 *
 */
public class PathBetweenTwoNodes {

    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode two  = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four  = new TreeNode(4);
        TreeNode five  = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        one.left = two;
        one.right = three;
        three.left = four;
        three.right = five;
        four.left = six;
        ArrayList<TreeNode> p = new ArrayList<TreeNode>();

        ArrayList<TreeNode> result = findRootPath(one, six, p);

        System.out.print(findPath(six, five, one));

    }
    public static int findPath(TreeNode n1, TreeNode n2, TreeNode root){
        ArrayList<TreeNode> p1 = new ArrayList<TreeNode>();
        p1 = findRootPath(root, n1, p1);

        ArrayList<TreeNode> p2 = new ArrayList<TreeNode>();
        p2 = findRootPath(root, n2, p2);

        int i = 0;
        for(; i < Math.min(p1.size(), p2.size()); i++){
            if(p1.get(i) != p2.get(i))
                break;
        }

        return p2.size() + p1.size() - 2*i + 1;

    }

    private static ArrayList<TreeNode> findRootPath(TreeNode current, TreeNode target, ArrayList<TreeNode> path){
        path.add(current);

        if(current == target){
            return path;
        }
        if(current.left != null){
            ArrayList<TreeNode> left = findRootPath(current.left, target, path);
            if(left != null)
                return left;
        }
        if(current.right != null){
            ArrayList<TreeNode> right = findRootPath(current.right, target, path);
            if(right != null)
                return right;
        }
        path.remove(path.size()-1);

        return null;
    }

}
