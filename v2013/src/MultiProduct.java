
public class MultiProduct {
	public static void main(String[] args){
		int[] array={1,2,3,4};
		
		int[] result=multipleProduct(array);
		for(int i=0;i<4;i++){
		System.out.print(result[i]);
		}
		
	}
	public static int[] multipleProduct(int[] array){
		int length=array.length;
	int[] first=new int[length];
		int[] second=new int[length];
		int[] result=new int[length];
		
		first[0]=1;
		second[0]=1;
		for(int i=1;i<length;i++){
			first[i]=first[i-1]*array[i-1];
			second[i]=second[i-1]*array[length-i];
		}
		
		for(int i=0;i<length;i++){
			result[i]=first[i]*second[length-1-i];
	}
		return result;
	}
}
