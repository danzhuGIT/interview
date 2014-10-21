package haitaoblog;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int d){
		data=d;
	}
	public void insert(int d){

		if(d>data){
			if(right==null){
				TreeNode n=new TreeNode(d);
				right=n;
			}
			else
				right.insert(d);
		}
		else{
			if(left==null){
				TreeNode n=new TreeNode(d);
				left=n;
			}
			else
				left.insert(d);
		}
	}
	public void print(){
		System.out.print(data+" ");
		if (left!=null)
			left.print();
		if (right!=null)
			right.print();
	}
}
