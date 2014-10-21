package chaptereight;

public class MakeChange {
	public static void main(String[] args){
	int n=10;
	System.out.print(makeChange(n,25));
	}
	
	public static int makeChange(int n, int denom){
		int nextdenom=0;
		switch(denom){
			case 25:
				nextdenom=10;
				break;
			case 10:
				nextdenom=5;
				break;
			case 5:
				nextdenom=1;
				break;
			case 1:
				return 1;}
		int way=0;
		for(int i=0;i*denom<=n;i++)
			way=way+makeChange(n-i*denom,nextdenom);
		return way;		
	}
}
