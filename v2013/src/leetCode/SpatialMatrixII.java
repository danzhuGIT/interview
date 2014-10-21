package leetCode;

public class SpatialMatrixII {
	public static void main(String[] args){
		System.out.print(generateMatrix(1));
		
	}
	public static int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
            
        int[][] result=new int[n][n];
        recursion(result,1,0,n-1);
        return result;
    }
    
    public static void recursion(int[][] result,int num, int start, int end){
        if(end<start)
            return;
        
        for(int i=start;i<=end;i++)
            result[start][i]=num++;
        
        for(int i=start+1;i<=end;i++)
            result[i][end]=num++;
            
        if(start<end){
            for(int i=end-1;i>=start;i--)
                result[end][i]=num++;  

            for(int i=end-1;i>=start+1;i--)
                result[i][start]=num++;  
        }
        recursion(result,num,start+1,end-1);
    }
}
