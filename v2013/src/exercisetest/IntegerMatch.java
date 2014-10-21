package exercisetest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class IntegerMatch {
	public static void main(String[] args){
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("-12a".matches("-?\\d+"));
		System.out.println("-1234".matches("\\+?\\d+"));
		System.out.println("1234".matches("-?\\d+"));
		System.out.println("1234".matches("\\+?\\d+"));
		
		int[] a={1,2,3};
		Arrays.sort(a);
		System.out.print(Arrays.toString(a));
		
	}
}
