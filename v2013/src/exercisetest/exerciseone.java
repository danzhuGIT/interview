package exercisetest;

public class exerciseone {
	public static void main(String[] args){
		int[] A={1,1,-1,1};
		int[] B=new int[A.length];
		int result=0;
		int temp=0;
		
		while(temp<A.length)
		{
			if(B[temp]==1){
				temp=A.length;
				result=-1;
				}
			else{
			B[temp]=1;
			temp=temp+A[temp];
			result++;	
			}
		}
		
		System.out.print(result);
			
	}
}
