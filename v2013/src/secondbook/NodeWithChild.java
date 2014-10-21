package secondbook;

public class NodeWithChild {
	public int data;
	public NodeWithChild next;
	public NodeWithChild prev;
	public NodeWithChild child;
	
	public NodeWithChild(int d, NodeWithChild n, NodeWithChild p, NodeWithChild c){
		data=d;
		next=n;
		prev=p;
		c=child;
	}
}

