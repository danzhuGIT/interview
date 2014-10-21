package leetCode;

public class PathUnique {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[][] table=new int[m][n];
        for(int i=0;i<table.length;i++)
            for(int j=0;j<table[0].length;j++){
                if(i==0||j==0){
                    table[i][j]=1;
                }
                else{
                    table[i][j]=table[i-1][j]+table[i][j-1];
                }
            }
        return table[m-1][n-1];
    }
}
