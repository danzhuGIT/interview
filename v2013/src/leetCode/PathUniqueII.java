package leetCode;

public class PathUniqueII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] table=new int[m][n];
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    if(obstacleGrid[i][j]==1)
                        return 0;
                    else
                        table[i][j]=1;
                }
                else if(obstacleGrid[i][j]==0){
                    if(i==0){
                        if(obstacleGrid[i][j-1]==0)
                            table[i][j]+=table[i][j-1];
                    }
                    else if(j==0){
                        if(obstacleGrid[i-1][j]==0)
                            table[i][j]+=table[i-1][j];
                    }
                    else{
                        if(obstacleGrid[i-1][j]==0)
                            table[i][j]+=table[i-1][j];
                        if(obstacleGrid[i][j-1]==0)
                            table[i][j]+=table[i][j-1];
                    }
                }
            }
        return table[m-1][n-1];
    }
}
