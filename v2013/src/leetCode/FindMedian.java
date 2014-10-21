package leetCode;

public class FindMedian {
	static int[] a={1,2,4,8,9,10};
	static int[] b={5,6,7};
	public static void main(String[] args){
		int m=a.length;
		int n=b.length;
		System.out.print(findMedian(0,m-1,0,n-1));
	}
	public static double findSingleArrayMedian(int[] arr, int start, int end){
		int len=end-start+1;
		int mid=start+len/2;
		return (len%2==0)? (arr[mid]+arr[mid-1])/2.0:arr[mid];			
	}
	public static double findMedianBaseCase(int med, int[] arr, int start, int end){
		int len=end-start+1;
		if(len==1)
			return (med+arr[start])/2.0;
		
		int mid=start+len/2;
		int x=arr[mid-1];
		int y=arr[mid];
		int z=arr[mid+1];
		if(len%2==0){
			if(med<x)
				return x;
			else if(med<y)
				return med;
			else 
				return y;
		}
		else{
			if(med<x)
				return (x+y)/2.0;
			else if(med<z)
				return (med+y)/2.0;
			else 
				return (y+z)/2.0;
		}
	}
	
	public static double findMedianBaseCase2(int med1, int med2, int[] arr, int start, int end){
		int len=end-start+1;
		int mid=start+len/2;
		if(len%2==1){
			int x=arr[mid-1];
			int y=arr[mid];
			int z=arr[mid+1];
			if(y<med1)
				return Math.min(z,med1);
			else if(y<med2)
				return y;
			else
				return Math.max(x,med2);	
		}
		else{
			int w=(mid-2)>=start? arr[mid-2]:Integer.MIN_VALUE;
			int x=arr[mid-1];
			int y=arr[mid];
			int z=(mid+1)<=end? arr[mid+1]:Integer.MAX_VALUE;
			if (med2<x)
				return (x+Math.max(med2,w))/2.0;
			else if (med2<y)
				return (med2+Math.max(x,med1))/2.0;
			else 
				return (y+Math.max(x,med1))/2.0;
		}
	}
	
	public static double findMedian(int m1, int m2, int n1, int n2){	
		int m=m2-m1+1;
		int n=n2-n1+1;
		
		if(m==0)
			return findSingleArrayMedian(b,n1, n2);
		else if(n==0)
			return findSingleArrayMedian(a,m1, m2);
		else if(m==1)
			return findMedianBaseCase(a[m1],b,n1,n2);
		else if(n==1)
			return findMedianBaseCase(b[n1],a,m1,m2);
		else if(m==2)
			return findMedianBaseCase2(a[m1],a[m2],b,n1,n2);
		else if(n==2)
			return findMedianBaseCase2(b[n1],b[n2],a,m1,m2);
		
		int k=0;
		if(a[m1+m/2]<=b[n1+n/2]){
			if(m%2==0)
				k=Math.min(m/2-1,n2-n/2);
			else
				k=Math.min(m/2,n2-n/2);
			return findMedian(m1+k,m2,n1,n2-k);
		}
		else{
			if(n%2==0)
				k=Math.min(n/2-1,m2-m/2);
			else
				k=Math.min(n/2,m2-m/2);
			return findMedian(m1,m2-k,n1+k,n2);
		}
		
	}
	
}
