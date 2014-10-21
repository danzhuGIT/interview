package leetCode;

import java.lang.reflect.Array;
import java.util.HashMap;

public class BuildInorderPreorder {
	public static void main(String[] args){
		int[] pre={7,10,4,3,1,2,8,11};
		int[] in={4,10,3,1,7,11,8,2};
		HashMap<Integer,Integer> mapInorder=new HashMap<Integer,Integer>();
		for(int i=0;i<in.length;i++){
			mapInorder.put(in[i],i);
		}
		TreeNode root=buildInPreorder(mapInorder,pre,in,0,0,in.length);
		root.printPreorder();
		root.printInorder();
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
	}
	
}
