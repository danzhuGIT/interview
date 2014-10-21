package haitaoblog;

public class FindFirstCommonListNode {
	public static void main(String[] args){
		ListNode e=new ListNode(5,null);
		ListNode d=new ListNode(4,e);
		ListNode c=new ListNode(3,d);
		ListNode a=new ListNode(1,c);
		ListNode b=new ListNode(2,d);
		
		a.print();
		b.print();	
		findFirstCommon(a,b);
	}
	
	public static void findFirstCommon(ListNode a, ListNode b){
		int al=0;
		int bl=0;

		al=listLength(a);
		bl=listLength(b);
		
		ListNode longList=a;
		ListNode shortList=b;	
		int dif=al-bl;
		
		if(bl>al){
			longList=b;
			shortList=a;	
			dif=bl-al;
		}
		
		for(int i=1;i<=dif;i++)
			longList=longList.next;
		
		while(longList!=null&&shortList!=null&&longList!=shortList){
			longList=longList.next;
			shortList=shortList.next;
		}
		if(longList==null||shortList==null)
			System.out.print("Cannot find common node");
		else
			System.out.print(shortList.data);
	}
	
	public static int listLength(ListNode x){
		int l=0;
		while(x!=null){
			l++;
			x=x.next;
		}
		return l;
	}
}
