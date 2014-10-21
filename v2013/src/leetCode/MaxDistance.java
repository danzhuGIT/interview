package leetCode;

public class MaxDistance {
	public static void main(String[] args){
		int[] arr={4,3,5,2,1,3,2,3};
		System.out.print(maxDistance(arr));
	}
	
	public static int maxDistance(int[] arr){
		int maxDis=-1;
		int len=arr.length;
		int[] lMin=new int[len];
		int[] rMax=new int[len];
		lMin[0]=arr[0];
		for(int i=1;i<len;i++){
			lMin[i]=Math.min(arr[i],lMin[i-1]);
		}
		rMax[len-1]=arr[len-1];
		for(int i=len-2;i>-1;i--)
			rMax[i]=Math.max(arr[i],rMax[i+1]);
		
		for(int i=0,j=0;i<len&&j<len;){
			if(rMax[j]>lMin[i]){
				maxDis=Math.max(maxDis,j-i);
				j++;
			}
			else
				i++;
		}
		
		return maxDis;
	}
}
