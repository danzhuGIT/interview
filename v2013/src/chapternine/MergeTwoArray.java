package chapternine;

public class MergeTwoArray {
	public static void main(String[] args){
		int[] a=new int[10];
		for(int i=0;i<4;i++)
			a[i]=2*i;
		int[] b={1,3,5,7,9,11};
		mergeTwoArray(a,b,4,6);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
	public static int[] mergeTwoArray(int[] a,int[] b,int m,int n){
		int ap=m-1;
		int bp=n-1;
		int p=m+n-1;

		while(ap>=0&&bp>=0){
			if(a[ap]>b[bp]){
				a[p]=a[ap];
				ap--;
			}
			else{
				a[p]=b[bp];
				bp--;
			}
			p--;
		}
		while(bp>=0){
			a[p]=b[bp];
			bp--;
			p--;
		}
		return a;
	}
}
