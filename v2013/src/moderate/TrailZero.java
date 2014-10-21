package moderate;

public class TrailZero {
	public static void main(String[] args){
		int n=26;
		System.out.print(trailZero(n));
	}
	public static int trailZero(int n){		
		if(n<0){
			System.out.println("Factorial is not defined for < 0");
			return 0;
		}
		int count=0;
		for(int i=5;n/i>0;i*=5){
			count+=n/i;
		}
		return count;
	}
}
