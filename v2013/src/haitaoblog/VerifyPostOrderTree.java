package haitaoblog;

public class VerifyPostOrderTree {
	public static void main(String[] args){
		int[] order={5,9,11,12,8};
		boolean result=verifyPostOrderTree(order,0,order.length-1);
		System.out.print(result);
		
	}
	public static boolean verifyPostOrderTree(int[] arr, int start,int end){
		int root=arr[end];
		int p=0;
		if(arr==null||start>end)
			return false;
		
		for(;p<end;p++){
			if(arr[p]>root)
				break;
		}
		for(int i=p+1;i<end;i++){
			if(arr[i]<root)
				return false;
		}
		boolean left=true;
		boolean right=true;
		if(p>0)
			left=verifyPostOrderTree(arr,0,p-1);
		if(p<end)
			right=verifyPostOrderTree(arr,p,end-1);
		
		return left && right;
	}
}
