package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class IntervalInsert {
	public static void main(String[] args){
		ArrayList<Interval> set=new ArrayList<Interval>();
		set.add(new Interval(1,2));
		set.add(new Interval(3,5));
		set.add(new Interval(6,7));
		set.add(new Interval(8,10));
		set.add(new Interval(12,16));
		System.out.print(intervalInsert(set,new Interval(9,17)));
		
	}
	
	public static ArrayList<Interval> intervalInsert(ArrayList<Interval> set, Interval newInterval){
		set.add(newInterval);
		Collections.sort(set);
		
		int startIndex=0;
		for(int i=0;i<set.size();i++){
			if (set.get(i).equals(newInterval)){
				startIndex=i;
			}
		}
		int i=startIndex;
		for(;i-1>=0;i--){
			Interval cur=set.get(i);
			Interval prev=set.get(i-1);
			if(prev.end<cur.start)
				break;
			else{
				Interval mergeInterval=new Interval(prev.start,Math.max(prev.end, cur.end));
				set.remove(i);
				set.remove(i-1);
				set.add(i-1,mergeInterval);			
			}
		}
		
		int j=i;
		for(;j+1<set.size();){
			Interval cur=set.get(j);
			Interval next=set.get(j+1);
			if(cur.end<next.start)
				break;
			else{
				Interval mergeInterval=new Interval(cur.start,Math.max(cur.end, next.end));
				set.remove(j+1);
				set.remove(j);
				set.add(j,mergeInterval);
			}
		}	
		
		return set;
	}
}
