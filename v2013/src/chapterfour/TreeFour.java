package chapterfour;
import java.util.*;

public class TreeFour {
	public static void main(String[] arg){
		TreeNode root=new TreeNode(14);
		root.addNode(7);
		root.addNode(16);
		root.addNode(18);
		root.addNode(8);
		root.addNode(6);
		root.addNode(5);
		root.addNode(9);
		
		ArrayList<LinkedList<TreeNode>> result=levelLinkedList(root);
		ArrayList<ArrayList<TreeNode>> result2=zigzagLevelOrder(root);
		System.out.print(result2);
	}
	public static ArrayList<LinkedList<TreeNode>> levelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
		int level=0;
		LinkedList<TreeNode> list=new LinkedList<TreeNode>();
		list.add(root);
		result.add(level,list);
		while(true){
			list=new LinkedList<TreeNode>();
			for(int i=0;i<result.get(level).size();i++)
			{
				TreeNode tempNode=(TreeNode)result.get(level).get(i);
				if(tempNode.left!=null)		
					list.add(tempNode.left);
				if(tempNode.right!=null)	
					list.add(tempNode.right);
			}
			if(result.get(level).size()!=0)
			{
				level++;
				result.add(level,list);
			}
			else
				break;
		} 
		return result;
	}
	
	public static ArrayList<ArrayList<TreeNode>> zigzagLevelOrder(TreeNode root) {

        ArrayList<ArrayList<TreeNode>> result=new ArrayList<ArrayList<TreeNode>>();
        ArrayList<TreeNode> list=new ArrayList<TreeNode>();
        list.add(root);
        result.add(list);
        int level=0;
        boolean leftToRight=true;
        while(true){
            ArrayList<TreeNode> newList=new ArrayList<TreeNode>();
            for(int i=result.get(level).size()-1;i>=0;i--){
                TreeNode tmp=result.get(level).get(i);
                if(leftToRight){
                    if(tmp.left!=null)
                        newList.add(tmp.left);
                    if(tmp.right!=null)
                        newList.add(tmp.right);
                }
                else{
                    if(tmp.right!=null)
                        newList.add(tmp.right);
                    if(tmp.left!=null)
                        newList.add(tmp.left);
                }
            }
            if(newList.size()>0){
                result.add(++level,newList);
                leftToRight= !leftToRight;
            }
            else
                break;

        }
        return result; 
	}
}
