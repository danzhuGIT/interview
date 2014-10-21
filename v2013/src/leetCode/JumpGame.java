package leetCode;

public class JumpGame {
	public static void main(String[] args){
		int[] arr={2,3,1,1,4};
		System.out.println(canJump(arr));
		System.out.println(minJump(arr));

		int[] arr2={3,4,1,0,4};
		System.out.println(canJump(arr2));
		System.out.println(minJump(arr2));
	}
	public static boolean canJump(int[] arr){
		int n=arr.length;
		boolean[] table=new boolean[n];
		table[n-1]=true;
		for(int i=n-2;i>=0;i--){
			if(arr[i]==0){
				table[i]=false;
			}
			else{
				for(int j=1;j<=arr[i];j++){
					if(table[i+j]==true){
						table[i]=true;
						break;
					}
				}
			}
		}
		return table[0];
	}
	public static int minJump(int[] arr){
		int n=arr.length;
		int[] table=new int[n];
		table[n-1]=0;
		for(int i=0;i<n-1;i++)
			table[i]=Integer.MAX_VALUE;
		
		for(int i=n-2;i>=0;i--){
			if(!(arr[i]==0)){
				if(i+arr[i]>=n-1){
					table[i]=1;
				}
				else
					for(int j=arr[i];j>0;j--){
						if(!(table[i+j]==Integer.MAX_VALUE) && table[i+j]+1<table[i]){
							table[i]=table[i+j]+1;
					}
				}
			}
		}
		return table[0];
	}
}
