
public class HeapSorter {
	private int[] a;
	public HeapSorter(int[] array){
		a=array;
	}
	
	public void sort(){
		int n=a.length-1;
		for(int i=(n-1)/2;i>=0;i--)
			fixHeap(i,n);
		while(n>0)
		{
			swap(0,n);
			n--;
			fixHeap(0,n);
		}
		
	}
	
	public void fixHeap(int rootIndex,int lastIndex){
		boolean more=true;
		while(more){
			int minIndex = rootIndex;
			int leftIndex=getLeftChildIndex(rootIndex);
			int rightIndex=getRightChildIndex(rootIndex);
			if(leftIndex<=lastIndex){
				if(a[leftIndex]>a[rootIndex])
					minIndex=leftIndex;
				if(rightIndex<=lastIndex&&a[rightIndex]>a[minIndex])
					minIndex=rightIndex;
				if(minIndex==rootIndex)
					more=false;
				else{
					swap(minIndex,rootIndex);
					rootIndex=minIndex;
				}
			}
			else
				more=false;
		}
	}
	private static int getLeftChildIndex(int i){
		return i*2+1;
	}
	
	private static int getRightChildIndex(int i){
		return i*2+2;
	}
	
	public void swap(int i, int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
}
