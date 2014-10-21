package haitaoblog;

public class FindTwoWithSum {
	public static void main(String[] args){
		int[] sortedArr={1,3,4,7,8,11,15};
		findTwoWithSum(sortedArr,15);
		
	}
	public static void findTwoWithSum(int[] arr, int sum){
		int start=0;
		int end=arr.length-1;
		while(start<end){
			if(arr[start]+arr[end]==sum){
				System.out.print(arr[start]+" "+arr[end]);
				break;
			}
			else if(arr[start]+arr[end]<sum)
				start++;
			else
				end--;
		}
		if (start==end)
			System.out.print("There is no such two numbers in the arrays whose sum is "+sum);
	}
}
