
public class Singleton2 {
	//private static int n=0;
	private Singleton2(){
		//System.out.print(++n);
	}
	private static Singleton2 uniqueInstance=new Singleton2();
	
	public static Singleton2 getInstance(){
		return uniqueInstance;
	}
	
	//public static void main(String[] args){
	//	Singleton2.getInstance();
	//	Singleton2.getInstance();
	//}
}
