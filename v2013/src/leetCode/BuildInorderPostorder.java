package leetCode;

import java.util.HashMap;

public class BuildInorderPostorder {
	public static void main(String[] args){
		int[] post={4,1,3,10,11,8,2,7};
		int[] in={4,10,3,1,7,11,8,2};
		HashMap<Integer,Integer> mapInorder=new HashMap<Integer,Integer>();
		for(int i=0;i<in.length;i++){
			mapInorder.put(in[i],i);
		}
		TreeNode root=buildInPostorder(mapInorder,post,in,post.length-1,0,in.length);
		root.printPostorder();
		root.printInorder();
	}
	
	public static TreeNode buildInPostorder(HashMap<Integer,Integer> mapInorder,int[] post,int[] in, int postend, int instart, int length){
		if(length<=0)
			return null;
		int cur=post[postend];
		TreeNode root=new TreeNode(cur);
		
		int index=mapInorder.get(cur);
		
		int lnewLength=index-instart;
		int rnewLength=length-lnewLength-1;

		root.left=buildInPostorder(mapInorder,post,in,postend-rnewLength-1,instart,lnewLength);
		root.right=buildInPostorder(mapInorder,post,in,postend-1,index+1,rnewLength);
		return root;
	}
}
