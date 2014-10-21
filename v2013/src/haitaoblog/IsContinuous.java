package haitaoblog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class IsContinuous {
	public static void main(String[] args){
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(0);
		num.add(0);
		num.add(9);
		num.add(6);
		num.add(4);
		System.out.print(isContinuous(num));
		
	}
	public static boolean isContinuous(ArrayList<Integer> num){
		boolean result=false;
		
		Collections.sort(num);
		int zeroNum=0;
		int gap=0;
		int cur=0;
		int prev=0;
		
		ListIterator<Integer> iter=num.listIterator();
		while(iter.hasNext()){
			cur=iter.next();
			if(cur==0){
				zeroNum++;
			}
			else{
				if(prev!=0){
					gap=gap+cur-prev-1;
				}
			}
			prev=cur;
		}
		
		if(gap<=zeroNum)
			result=true;
			
		return result;
	}
}
