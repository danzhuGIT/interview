package haitaoblog;

public class FindNumOnce {
	public static void main(String[] args){
		int[] array={1,2,3,5,3,2,4,1};
		findNumOnce(array);
	}
	
	public static void findNumOnce(int[] arr){
		int num1=0;
		int num2=0;
		int total=0;
		for(int i=0;i<arr.length;i++){
			total=total^arr[i];
		}
		int index=findFirstDiffBit(total);
		for(int i=0;i<arr.length;i++){
			if(isBit1(arr[i],index)){
				num1=num1^arr[i];
			}
			else
				num2=num2^arr[i];
		}
		System.out.print(num1+" "+num2);
	}
	
	public static int findFirstDiffBit(int n){
		int index=0;
		while((n&1)!=1){
			n=n>>1;
			index++;
		}
		return index;
	}
	
	public static boolean isBit1(int n,int index){

		n=n>>index;
		return (n&1)==1;
	}
}
