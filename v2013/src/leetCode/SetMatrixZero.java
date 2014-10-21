package leetCode;

public class SetMatrixZero {
	public static void main(String[] args){
		int[][] matrix={{0},{1}};
		setZeroes(matrix);
	}
    public static void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m=matrix.length;
        int n=matrix[0].length;
        int row=-1,col=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row=i;
                    col=j;
                    i=m;
                    j=n;
                }
            }
        }
        
        if(row==-1||col==-1)
            return;
        
        for(int i=row+1;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[row][j]=0;
                    matrix[i][col]=0;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i!=row && j!=col){
                    if(matrix[row][j]==0||matrix[i][col]==0)
                        matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++)
            matrix[i][col]=0;
            
        for(int j=0;j<n;j++)
            matrix[row][j]=0;
        
    }
}
