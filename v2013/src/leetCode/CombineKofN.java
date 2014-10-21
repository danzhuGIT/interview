package leetCode;

import java.util.ArrayList;

public class CombineKofN {
	public static void main(String[] args){
		int n=4;
		int k=2;
		ArrayList<ArrayList<Integer>> sol=combineKofN(k,n);
		for(ArrayList<Integer> list:sol)
			System.out.println(list);
	}
	
	public static ArrayList<ArrayList<Integer>> combineKofN(int k, int n){
		ArrayList<ArrayList<Integer>> sol=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> partial=new ArrayList<Integer>();
		recursive(k, n, partial, sol);
		return sol;
	}
	public static void recursive(int k, int n, ArrayList<Integer> partial,ArrayList<ArrayList<Integer>> sol){
		if(partial.size()==2){
			if(!sol.contains(partial))
				sol.add(partial);
			return;
		}
		else if(partial.size()>2)
			return;
		else{
			for(int i=n;i>=1;i--){
				ArrayList<Integer> partial_copy=new ArrayList<Integer>();
				partial_copy.addAll(partial);
				partial_copy.add(i);
				recursive(k,i-1,partial_copy,sol);
			}
		}
	}
}
