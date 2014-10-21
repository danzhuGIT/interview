
public class MergeSort {
	public static void main(String[] args){
		int[] array={4,5,2,7,8,0,3};
		mergeSort(array,0,array.length-1);
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	public static void mergeSort(int[] array,int start,int end){
		int middle=(start+end)/2;
		if(start<end){
			mergeSort(array,start,middle);
			mergeSort(array,middle+1,end);
			merge(array,start,middle,end);}
	}
	
	public static void merge(int[] array, int start,int middle, int end){
		int n1=middle-start+1;
		int n2=end-middle;
		int[] temp1=new int[n1];
		int[] temp2=new int[n2];
		for(int i=0;i<n1;i++)
			temp1[i]=array[start+i];
		for(int i=0;i<n2;i++)
			temp2[i]=array[middle+1+i];
		int i=0;
		int j=0;
		int k=start;
		while(i<n1&&j<n2){
			if (temp1[i]<temp2[j])
				array[k++]=temp1[i++];
			else
				array[k++]=temp2[j++];
		}
		while(i<n1){
				array[k++]=temp1[i++];
		}
		while(j<n2){
			array[k++]=temp2[j++];
		}		
	}
}
