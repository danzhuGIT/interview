package haitaoblog;

//输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。要求不能创建任何新的结点，只调整指针的指向。

public class TreeToDoubleLinked {
	public static void main(String[] args){
		TreeNode head=new TreeNode(10);
		head.insert(6);
		head.insert(14);
		head.insert(4);
		head.insert(8);
		head.print();
		
		TreeNode newHead=treeToDoubleLinked(head,true);
		while(newHead!=null){
			System.out.print(newHead.data+" ");
			newHead=newHead.right;			
		}
		
	}
	
	public static TreeNode treeToDoubleLinked(TreeNode node, boolean isRight){
		if(node==null)
			return null;
		
		TreeNode leftNode=null;
		TreeNode rightNode=null;
		
		if(node.left!=null){
			leftNode=treeToDoubleLinked(node.left,false);		
		}
		if(leftNode!=null){
			leftNode.right=node;
			node.left=leftNode;
		}
		
		if(node.right!=null){
			rightNode=treeToDoubleLinked(node.right,true);		
		}
		if(rightNode!=null){
			rightNode.left=node;
			node.right=rightNode;
		}
		TreeNode temp=node;
		if(isRight){
			while(temp.left!=null)
				temp=temp.left;
		}
		else{
			while(temp.right!=null)
				temp=temp.right;
		}
		return temp;
	}
}
