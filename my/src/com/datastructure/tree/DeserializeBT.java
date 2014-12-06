package com.datastructure.tree;

/**
 * Created by danzhu on 11/2/14.
 */
public class DeserializeBT {
    public static void main(String[] args){
        String str = "30 10 50 # # # 20 45 # # 35 # #";
        String[] nodes = str.split(" ");
        TreeNode tree = deserializeBT(nodes);
        StringBuilder sb = new StringBuilder();
        serializeBT(tree, sb);
        System.out.println(new String(sb));

    }
    static int index = 0;
    public static TreeNode deserializeBT(String[] nodes){
        if(index >= nodes.length)
            return null;

        if(nodes[index].equals("#")){
            return null;
        }

        int val = Integer.parseInt(nodes[index]);
        TreeNode node = new TreeNode(val);
        index++;
        node.left = deserializeBT(nodes);
        index++;
        node.right = deserializeBT(nodes);
        return node;
    }

    public static void serializeBT(TreeNode root, StringBuilder sb){
        if(root == null){
            if(sb.length()==0)
                sb.append("#");
            else
                sb.append(" #");
            return;
        }
        if(sb.length()!=0)
            sb.append(" ");
        sb.append(root.val);
        serializeBT(root.left, sb);
        serializeBT(root.right, sb);
    }
}
