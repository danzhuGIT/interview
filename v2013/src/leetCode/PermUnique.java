package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class PermUnique {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        boolean[] used=new boolean[num.length];
        for(int i=0;i<used.length;i++)
            used[i]=false;
        int[] candidate=new int[num.length];
        Arrays.sort(num);
        getUniquePerm(num,candidate,0,used,result);
        return result;
        
    }
    
    public void getUniquePerm(int[] num, int[] candidate, int level, boolean[] used, ArrayList<ArrayList<Integer>> result){
        if(level==num.length){
            ArrayList<Integer> x=new ArrayList<Integer>();
            for(int i=0;i<candidate.length;i++){
                x.add(candidate[i]);
            }
            result.add(x);
            return;
        }

        for(int i=0;i<num.length;){
            if(!used[i]){
                used[i]=true;
                candidate[level]=num[i];
                getUniquePerm(num,candidate,level+1,used,result);
                used[i]=false;
                i++;
                while(i<num.length&&num[i]==num[i-1])
                    i++;
            }
            else{
                i++;
                continue;
            }
        }
    }
}
