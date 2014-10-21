package chapterten;

public class MathFour {
	public static void main(String[] args){
		int a=6;
		int b=2;
		
		System.out.print(minus(a,b)+" "+multiple(a,b)+" "+divide(a,b));
	}
	
	public static int negate(int x){
		int neg=0;
		int d=x<0?1:-1;
		while(x!=0){
			neg+=d;
			x+=d;
		}
		return neg;
	}
	
	public static int minus(int a, int b){
		return a+negate(b);
	}
	
	public static int abs(int a){
		return a>0?a:negate(a);
	}
	
	public static boolean diffSign(int a, int b){
		return (a>0&&b<0)||(b>0&&a<0);
	}
	
	public static int multiple(int a, int b){
		if(abs(a)<abs(b)) return multiple(b,a);
		int result=0;
		for(int iter=abs(b);iter>0;iter--)
			result+=a;
		if(b<0) result=negate(result);
		return result;
	}
	
	public static int divide(int a, int b){
		int result=0;
		for(int divident=abs(a);divident>=abs(b);divident-=abs(b))
			result++;
		if(diffSign(a,b)) result=negate(result);
		return result;
	}
}
