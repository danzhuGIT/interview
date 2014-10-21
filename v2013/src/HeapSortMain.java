
public class HeapSortMain {
	public static void main(String[] args){
		int[] array={4,6,3,3,1,9};
		HeapSorter a=new HeapSorter(array);
		a.sort();
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
}
