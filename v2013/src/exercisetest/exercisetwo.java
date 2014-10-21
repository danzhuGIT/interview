package exercisetest;

import java.util.Arrays;

//import java.util.ArrayList;

public class exercisetwo {
	public static void main(String[] args){
		//ArrayList<Integer> number=new ArrayList<Integer>();
		
		//number.add(10);
		//number.add(1,15);
		
		double[] number={1,2,3};
		double[] numbercopy=Arrays.copyOf(number,number.length*2);
		
		for(int i=0;i<numbercopy.length;i++)
		System.out.print(numbercopy[i]+" ");
		
		
	}
}

