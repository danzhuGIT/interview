
public class Pair2 {
	private Object first;
	private Object second;
	
	public Pair2(Object f, Object s){
		first=f;
		second=s;
	}
	
	public Object getFirst(){
		return first;
	}
	public Object getSecond(){
		return second;
	}
	public String toString(){
		return("("+first+","+second+")");
	}
}
