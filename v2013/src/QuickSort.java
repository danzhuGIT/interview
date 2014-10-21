public class QuickSort
{
	public static void main(String[] args){
		int[] array={4,5,2,7,8,0,3};
		quickSort(array,0,array.length-1);
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]+" ");
	}
	
	public static void quickSort(int[] array, int start, int end)
	{
		if (start<end)
		{
			int middle=partition(array,start,end);
			quickSort(array,start,middle-1);
			quickSort(array,middle+1,end);
			
		}
	}
	
	public static int partition(int[] array, int start, int end)
	{
		int i=start-1;
		for(int k=start;k<end;k++){
			if(array[k]<array[end]){
				i++;
				swap(array,i,k);
			}
		}
		swap(array,i+1,end);
		return i+1;
	}

	public static void swap(int[] array,int i,int j)
	{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}