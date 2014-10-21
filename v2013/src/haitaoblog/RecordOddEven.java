package haitaoblog;

public class RecordOddEven {
	public static void main(String[] args){
		int[] array={1,2,3,4,5};
		array=recordOddEven(array);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	
	public static int[] recordOddEven(int[] arr){
		int odd=0;
		int even=arr.length-1;
		

		while(odd<even){
			while(!isEven(arr[odd]))
				odd++;
			
			while(isEven(arr[even]))
				even--;
			
			int t=arr[even];
			arr[even]=arr[odd];
			arr[odd]=t;
			
		}
		
		return arr;
	}
	
	public static boolean isEven(int n){
		return (n&1)==0;
	}
}
