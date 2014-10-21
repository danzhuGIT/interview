package haitaoblog;

public class CountOne {
	public static void main(String[] args){
		int n=-10;
		
		System.out.print(countOneOne(n));
	}
	
	//Method One is not good enough. If n is negative, it will go into dead loop;
	//We could use unsigned right shift
	public static int countOneOne(int n){
		int count=0;
		int i=n;
		while(i!=0){
			if((i&1)==1)
				count++;
			i=i>>>1;//unsigned right shift
		}
		return count;
	}
	
	public static int countOneTwo(int n){
		int count=0;
		int flag=1;
		
		while(flag!=0){
			if((n&flag)!=0)
				count++;
			flag=flag<<1;
		}
		return count;
	}
}
