package chapternine;

import java.util.Arrays;

public class AnagramMain {
	public static void main(String[] args){
		String[] array={"cwr","dbq","qbd","dfx"};
		Arrays.sort(array,new AnagramComparator());
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
