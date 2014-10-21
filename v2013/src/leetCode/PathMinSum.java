package leetCode;

public class PathMinSum {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m=grid.length;
        int n=grid[0].length;
        int[][] table=new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(i==0&&j==0){
                    table[i][j]=grid[i][j];
                }
                else if(i==0)
                    table[i][j]=table[i][j-1]+grid[i][j];
                else if(j==0)
                    table[i][j]+=table[i-1][j]+grid[i][j];
                    
                else{
                    table[i][j]=Math.min(table[i-1][j],table[i][j-1])+grid[i][j];
                }
            }
        return table[m-1][n-1];
    }
}
