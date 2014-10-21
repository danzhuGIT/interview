package leetCode;

public class Interval implements Comparable {
	public int start;
	public int end;
	public Interval(int s,int e){
		start=s;
		end=e;
	}
	
	public int compareTo(Object o) {
		Interval another=(Interval) o;
		if(this.start>another.start)
			return 1;
		else if(this.start<another.start)
			return -1;
		else if(this.end>another.end)
			return 1;
		else if(this.end<another.end)
			return -1;
		else
			return 0;
	}
	/*public boolean equals(Interval another){
		if(another.start==start && another.end==end)
			return true;
		else
			return false;
	}*/
	public String toString(){
		return("["+start+" , "+end+"]");
	}
}
