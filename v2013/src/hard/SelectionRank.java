package hard;

public class SelectionRank {
	public static void main(String[] args){
		int[] arr={2,1,7,8,3,5,4,6};
		System.out.print(selectionRank(arr,0,arr.length-1,5));
	}
	
	public static int selectionRank(int[] array, int start, int end, int k){
		int n=end-start+1;
		int i=start-1;
		for(int j=start;j<end;j++){
			if(array[j]<array[end]){
				i++;
				swap(array,i,j);
				//System.out.print(array[i]+" ");
			}
		}
		swap(array,++i,end);
		//System.out.print(array[i]);
		if(n-i==k)
			return array[i];
		else if(n-i<k)
			return selectionRank(array,start,i-1,k-n+i);			
		else
			return selectionRank(array,i,end,k);
		
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
