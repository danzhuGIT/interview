package leetCode;

import java.util.ArrayList;

public class NumDecode {
	public static void main(String[] args){
		String nums="1234";
		System.out.print(numDecode(nums));
	}
	
	public static int numDecode(String nums){
		ArrayList<Integer> sol=new ArrayList<Integer>();
		if(nums.length()>0)
			recursion(nums,sol);
		return sol.size();
	}
	
	public static void recursion(String nums,ArrayList<Integer> sol){
		if(nums.length()==0)
			sol.add(1);
		else{
			int value=Character.getNumericValue(nums.charAt(0));
			if(value>0 && value<=9)
				recursion(nums.substring(1),sol);
			if(nums.length()>=2){
				int value2=Character.getNumericValue(nums.charAt(1));
				if(value==1 && value2>=0 && value2<=9)
					recursion(nums.substring(2),sol);
				if(value==2 && value2>=0 && value2<=6)
					recursion(nums.substring(2),sol);			
			}
		}
	}
}
