package leetCode;

import java.util.ArrayList;

public class PascalTriangle {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<numRows;i++){
            if(i==0){
                ArrayList<Integer> list=new ArrayList<Integer>();
                list.add(1);
                result.add(list);
            }
            else{
                ArrayList<Integer> list=new ArrayList<Integer>();
                for(int j=0;j<=i;j++){
                    
                    if(j==0||j==i)
                        list.add(1);
                    else{
                        list.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                    }
                }
                result.add(list);
            }
        }
        return result;
    }
	
	public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer>();
        int[] ret=new int[rowIndex+1];
        ret[0]=1;
        for(int i=1;i<=rowIndex;i++){
            for(int j=i;j>=1;j--){
                if(j==i)
                    ret[j]=1;
                else
                    ret[j]=ret[j]+ret[j-1];
            }
        }
        for(int i=0;i<ret.length;i++){
            result.add(ret[i]);
        }
        return result;
    }
}
