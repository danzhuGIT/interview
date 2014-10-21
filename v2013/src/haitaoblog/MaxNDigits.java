package haitaoblog;

public class MaxNDigits {
	public static void main(String[] args){
		int n=2;
		int[] arr=new int[n];
		maxNDigits(arr,0);
	}
	
	public static void maxNDigits(int[] arr, int index){
		if(index==arr.length){
			print(arr);
			return;
		}
		for(int i=0;i<10;i++){
			arr[index]=i;
			maxNDigits(arr,index+1);
		}
	}
	
	public static void print(int[] num){
		boolean flag=false;
		for(int i=0;i<num.length;i++){
			if(num[i]!=0&&flag==false)
				flag=true;
			if(flag==true)
				System.out.print(num[i]);
		}
		System.out.print(" ");
	}
}
