package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class IntervalMerge {
	public static void main(String[] args){
		ArrayList<Interval> set=new ArrayList<Interval>();
		set.add(new Interval(1,3));
		set.add(new Interval(2,6));
		set.add(new Interval(8,10));
		set.add(new Interval(12,16));
		System.out.print(intervalMerge(set));
	}
	
	public static ArrayList<Interval> intervalMerge(ArrayList<Interval> set){
		if(set.size()==0||set.size()==1)
			return set;
		else{
			Collections.sort(set);
			int prev=0;
			int cur=1;
			while(cur<set.size()){
				if(set.get(prev).end>=set.get(cur).start){
					Interval newInterval=new Interval(set.get(prev).start,Math.max(set.get(prev).end, set.get(cur).end));
					set.remove(cur);
					set.remove(prev);
					set.add(prev,newInterval);
				}
				else{
					prev++;
					cur++;
				}
					
			}
			return set;
		}
	}
}
