package leetCode;

public class FirstMissing {
	public static void main(String[] args){
		int[] array={2,3,-1,0};
		System.out.print(firstMissing(array));
	}
	public static int firstMissing(int[] array){
		for(int i=0;i<array.length;i++){
			while(!(array[i]==i+1)){
				if(array[i]<=0 || array[i]>=array.length || array[i]==array[array[i]-1])
					break;
				swap(array,i,array[i]-1);
			}
		}
		for(int i=0;i<array.length;i++){
			if(!(array[i]==i+1))
				return i+1;
		}
		return array.length+1;
				
	}
	public static void swap(int[] array, int i,int j){
		int tmp=array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
}
