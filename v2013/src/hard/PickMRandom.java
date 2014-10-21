package hard;

public class PickMRandom {
	public static void main(String[] args){
		int[] original={1,2,3,4,5,6};
		int m=3;
		pickMRandom(original,m);
	}
	public static int[] pickMRandom(int[] original, int m){
		int[] set=new int[m];
		int[] copy=original.clone();
		int index;
		for(int i=0;i<m;i++){
			index=i+(int)(Math.random()*(copy.length-i));
			set[i]=copy[index];
			copy[index]=copy[i];
			System.out.print(set[i]+" ");
		}
		return set;
	}
}
