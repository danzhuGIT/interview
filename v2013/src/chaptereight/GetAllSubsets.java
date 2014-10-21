package chaptereight;

import java.util.ArrayList;

public class GetAllSubsets {
	public static void main(String[] args){
		ArrayList<Integer> set=new ArrayList<Integer>();
		for(int i=1;i<4;i++)
			set.add(i);
		
		//ArrayList<ArrayList<Integer>> allSubsets=getAllSubsets(set);
		ArrayList<ArrayList<Integer>> allSubsets=getAllSubsets(set,0);
		ArrayList<Integer> subset=new ArrayList<Integer>();
		for(int i=0;i<allSubsets.size();i++){
			subset=allSubsets.get(i);
			System.out.print("Subset "+i+"th is:"+" ");
			for(int j=0;j<subset.size();j++){
				System.out.print(subset.get(j)+" ");
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> getAllSubsets(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allSubsets=new ArrayList<ArrayList<Integer>>();
		int s=set.size();
		int max=1<<s;
		for(int i=0;i<max;i++){
			ArrayList<Integer> subset=new ArrayList<Integer>();
			int k=i;
			int index=0;
			while(k>0){
				if((k&1)>0){
					subset.add(set.get(index));
				}
				k=k>>1;
				index++;
			}
			allSubsets.add(subset);
		}
		
		return allSubsets;
	}
	
	public static ArrayList<ArrayList<Integer>> getAllSubsets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allSubsets;
		
		if(index==set.size()){
			allSubsets=new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
		}
		else{
			allSubsets=getAllSubsets(set,index+1);
			ArrayList<ArrayList<Integer>> moreSubsets=new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset:allSubsets){
				ArrayList<Integer> newSubset=new ArrayList<Integer>();
				newSubset.addAll(subset);
				newSubset.add(set.get(index));
				moreSubsets.add(newSubset);
			}
			allSubsets.addAll(moreSubsets);
		}
		
		return allSubsets;
	}
	
}
