package leetCode;

import java.util.ArrayList;

public class SpatialMatrix {
	public static void main(String[] args){
		int[][] matrix={{6,9,7}};
		System.out.print(spiralOrder(matrix));
		
	}
	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(matrix==null||matrix.length==0)
            return result;
        recursion(matrix, 0, 0, matrix.length-1, matrix[0].length-1,result);
        return result;
        
    }
    public static void recursion(int[][] matrix, int x, int y, int m, int n, ArrayList<Integer> result){
        if(m<x||n<y)
            return;
        
        for(int i=y;i<=n;i++)
            result.add(matrix[x][i]);
        
        for(int i=x+1;i<=m;i++)
            result.add(matrix[i][n]);
        if(m>x){
            for(int i=n-1;i>=y;i--)
                result.add(matrix[m][i]);  
        }
        if(n>y){   
            for(int i=m-1;i>=x+1;i--)
                result.add(matrix[i][y]);  
        }
    
        recursion(matrix,x+1,y+1,m-1,n-1,result);
        
    }
}
