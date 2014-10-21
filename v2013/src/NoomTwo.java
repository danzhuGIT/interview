
public class NoomTwo {
	public static void main(String[] args){
		int n=200;
		System.out.print(makeChange(n,200));
		}
		
		public static int makeChange(int n, int denom){
			int nextdenom=0;
			switch(denom){
				case 200:
					nextdenom=100;
					break;
				case 100:
					nextdenom=50;
					break;
				case 50:
					nextdenom=20;
					break;
				case 20:
					nextdenom=10;
					break;
				case 10:
					nextdenom=5;
					break;
				case 5:
					nextdenom=2;
					break;
				case 2:
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
