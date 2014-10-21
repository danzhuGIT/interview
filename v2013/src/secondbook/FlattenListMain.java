package secondbook;

import java.util.Stack;

public class FlattenListMain {
	public static void main(String[] args){
		NodeWithChild first=new NodeWithChild(5,null,null,null);
		NodeWithChild second=new NodeWithChild(33,null,null,null);
		NodeWithChild third=new NodeWithChild(17,null,null,null);
		NodeWithChild fourth=new NodeWithChild(2,null,null,null);
		NodeWithChild fifth=new NodeWithChild(6,null,null,null);
		NodeWithChild sixth=new NodeWithChild(25,null,null,null);
		NodeWithChild seventh=new NodeWithChild(16,null,null,null);
		NodeWithChild eighth=new NodeWithChild(7,null,null,null);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		second.prev=first;
		third.prev=second;
		fourth.prev=third;
		first.child=fifth;
		fourth.child=eighth;
		fifth.next=sixth;
		sixth.next=seventh;
		sixth.prev=fifth;
		seventh.prev=sixth;
		
		FlattenList list=new FlattenList(first,fourth);
		list.flattenList();
		NodeWithChild temp=first;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;}
		System.out.println();
		
		list.unflatten();
		Stack<NodeWithChild> s=new Stack<NodeWithChild>();
		s.push(first);
		temp=first;
		while(s.size()!=0){
			temp=s.pop();
			while(temp!=null){
				if(temp.child!=null)
					s.push(temp.child);
				System.out.print(temp.data+" ");
				temp=temp.next;
			}		
		}		
	}
}
