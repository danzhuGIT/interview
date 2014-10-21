package leetCode;

import java.util.ArrayList;

public class GreyCode {
	public static void main(String[] args){
		System.out.print(greyCode(3));
	}
	
	public static ArrayList<Integer> greyCode(int n){
		ArrayList<Integer> sol=new ArrayList<Integer>();
		if(n==0)
			sol.add(0);
		else{
			ArrayList<Integer> previous=greyCode(n-1);
			sol.addAll(previous);
			for(int i=previous.size()-1;i>=0;i--){
				sol.add(sol.get(i)+(int)Math.pow(2,n-1));
			}
		}
		return sol;
	}
}
