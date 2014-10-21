package leetCode;

public class FindKthSmallest {
	static int[] a={1,3,5};
	static int[] b={2,4,6,7,8};
	public static void main(String[] args){		
		
	}
	public int findKthSmallest(int m1, int m2, int n1, int n2, int k){
		int m=m2-m1+1;
		int n=n2-n1+1;
		int i=(int)((double) m/(m+n)*k);
		int j=k-1-i;
		int ai_1=(i==0)?Integer.MIN_VALUE:a[i-1];
		int ai=(i==m1)?Integer.MIN_VALUE:a[i-1];
	}
}
