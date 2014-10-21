package secondbook;

public class FlattenList {
	public NodeWithChild head;
	public NodeWithChild tail;
	public FlattenList(NodeWithChild h,NodeWithChild t){
		head=h;
		tail=t;
	}
	public void flattenList(){
		NodeWithChild curNode=head;
		while(curNode!=null){
			if(curNode.child!=null)
				append(curNode.child);
			curNode=curNode.next;
		}
	}
	public void append(NodeWithChild child){
		tail.next=child;
		child.prev=tail;
		NodeWithChild temp=child;
		while(temp.next!=null)
			temp=temp.next;
		tail=temp;		
	}
	
	public void unflatten(){
		NodeWithChild curNode=tail;
		while (curNode!=null){
			if (curNode.child!=null){
				exploreAndSeparate(curNode.child);
			}
			curNode=curNode.prev;
		}
		curNode=head;
		while(curNode.next!=null){
			curNode=curNode.next;
		}
		tail=curNode;
	}
	
	public void exploreAndSeparate(NodeWithChild child)
	{
		child.prev.next=null;
		child.prev=null;
		
	}
}
