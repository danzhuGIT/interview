package leetCode;

import java.util.ArrayList;

public class UniqueBST {
    public int numTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n==0||n==1)
            return 1;
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                arr[i]+=arr[j]*arr[i-1-j];
            }
        }
        return arr[n];
    }
    public ArrayList<TreeNode> generateTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<TreeNode> result=new ArrayList<TreeNode>();
        recursion(result,1,n);
        return result;
        
    }
    
    public void recursion(ArrayList<TreeNode> trees,int start, int end){
        if(start>end){
            trees.add(null);
            return;
        }
        if(start==end){
            trees.add(new TreeNode(start));
            return;
        }
        
        for(int i=start;i<=end;i++){
            ArrayList<TreeNode> leftTrees=new ArrayList<TreeNode>();
            recursion(leftTrees,start,i-1);
            
            for(int j=0;j<leftTrees.size();j++){
                TreeNode leftChild=leftTrees.get(j);
                ArrayList<TreeNode> rightTrees=new ArrayList<TreeNode>();
                recursion(rightTrees,i+1,end);
                
                for(int k=0;k<rightTrees.size();k++){
                    TreeNode rightChild=rightTrees.get(k);
                    TreeNode root=new TreeNode(i);
                    root.left=leftChild;
                    root.right=rightChild;
                    trees.add(root);
                }
                
            }
        }
        return;
    }

}
