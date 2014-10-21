package haitaoblog;

public class FindGreatestSum {
	public static void main(String[] args){
		int[] array={2,-8,3,-2,4};
		
		boolean result=findGreatestSum(array);
	}
	
	public static boolean findGreatestSum(int[] arr){
		int sum=0;
		int curSum=0;
		 if(arr==null||arr.length==0)
			 return false;
		
		for(int i=0;i<arr.length;i++){
			curSum=curSum+arr[i];
			if(curSum<0){
				curSum=0;
			}
			else{
				if(curSum>sum)
					sum=curSum;
			}				
		}
		if(sum==0){
			sum=arr[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i]>sum)
					sum=arr[i];
			}
		}
		System.out.print(sum);
		return true;
		
	}
}
