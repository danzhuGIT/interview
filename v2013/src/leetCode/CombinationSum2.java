package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum2 {
	public static void main(String[] args){
		int[] array={1,1,5,6,7};
		int target=7;
		ArrayList<ArrayList<Integer>> sol=combinationSum(array,target);
		for(ArrayList<Integer> list:sol)
			System.out.println(list);
	}
	
	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target){
		ArrayList<ArrayList<Integer>> sol=new ArrayList<ArrayList<Integer>>();
		Arrays.sort(candidates);
		combSumRec(candidates, target, new ArrayList<Integer>(), sol);
		return sol;
	}
	
	public static void combSumRec(int[] candidates, int target, ArrayList<Integer> partial, ArrayList<ArrayList<Integer>> sol){
		int sum=0;
		for(int num:partial){
			sum+=num;
		}
		if(sum==target){
			if(!sol.contains(partial))
				sol.add(partial);
			return;
		}
		else if(sum>target)
			return;
		else{
			for(int i=0;i<candidates.length;i++){	
				ArrayList<Integer> partial_copy=new ArrayList<Integer>();
				partial_copy.addAll(partial);
				partial_copy.add(candidates[i]);
				int[] remain=new int[candidates.length-1-i];
				System.arraycopy(candidates, i+1, remain, 0, remain.length);
				combSumRec(remain,target,partial_copy,sol);
			}
		}
	}
}
