package chapterfour;

public class TreeTwo {
	public static void main(String[] arg){
		int[] array=new int[15];
		
		for(int i=0;i<array.length;i++)
			array[i]=i;
		
		TreeNode root=buildMinBST(array,0,array.length-1);
		
		root.printSubtree();
					
	}
	
	public static TreeNode buildMinBST(int[] arr, int l, int r)
	{
		if(l<=r){
			int middle=(l+r)/2;
			TreeNode newNode=new TreeNode(middle);
			//System.out.print(middle+" ");
			newNode.left=buildMinBST(arr,l,middle-1);
			newNode.right=buildMinBST(arr,middle+1,r);		
			return newNode;	
		}
		else 
			return null;			
	}
}


