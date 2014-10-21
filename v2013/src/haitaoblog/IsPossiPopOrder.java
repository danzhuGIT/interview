package haitaoblog;

import java.util.Stack;

public class IsPossiPopOrder {
	public static void main(String[] args){
		int[] pushOrder={1,2,3,4,5};
		int[] popOrder={4,5,3,2,1};		
		System.out.print(isPossiPopOrder(pushOrder,popOrder));
	}
	public static boolean isPossiPopOrder(int[] pushOrder,int[] popOrder){
		boolean result=false;
		Stack<Integer> buffer=new Stack<Integer>();
		int ipush=0;
		int ipop=0;
		while(ipop<popOrder.length){
			while(buffer.isEmpty()||buffer.peek()!=popOrder[ipop]){
				if(ipush>=pushOrder.length)
					break;
				buffer.push(pushOrder[ipush]);
				ipush++;
			}
			if(buffer.peek()!=popOrder[ipop])
				break;
			
			buffer.pop();
			ipop++;
		}
		if(buffer.isEmpty()&&ipop==popOrder.length)
			result=true;
		return result;
	}
}
