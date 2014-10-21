package chapterfour;

public class TreeNode {
	public TreeNode left;
	public TreeNode right;
	public int value;
	
	public TreeNode(int value)
	{
		this.value=value;
	}
	
	public void addNode(int data){	
		if(data<value){
			if(left==null){
				TreeNode newNode=new TreeNode(data);
				left=newNode;
			}
			else	
				left.addNode(data);
		}
		else if(data>value){
			if(right==null){
				TreeNode newNode=new TreeNode(data);
				right=newNode;
			}
			else	
				right.addNode(data);
		}
	}
	
	public void printSubtree()
	{
			if(left!=null)
				left.printSubtree();
			System.out.print(value+" ");
			if(right!=null)
				right.printSubtree();
		
	}
	public String toString(){
		return ""+value;
	}
}
