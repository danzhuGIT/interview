package leetCode;

import java.util.ArrayList;

public class TrianglePathSum {
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(triangle.size()==0)
            return 0;
        
        int[] f=new int[triangle.size()];
        for(int i=0;i<triangle.size();i++)
            for(int j=triangle.get(i).size()-1;j>=0;j--){
                if(j==0)
                    f[j]+=triangle.get(i).get(j);
                else if(j==triangle.get(i).size()-1)
                    f[j]=f[j-1]+triangle.get(i).get(j);
                else
                    f[j]=Math.min(f[j-1],f[j])+triangle.get(i).get(j);
            }
        
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<f.length;i++)
            sum=Math.min(sum,f[i]);
        return sum;
    }
}
