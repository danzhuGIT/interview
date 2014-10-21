package hard;

import java.util.Arrays;

public class maxSubsumMatrix {
	public static void main(String[] args){
		int[][] matrix={{1,2,-1},{-2,-1,2},{3,1,4}};
		int max=Integer.MIN_VALUE;
		int[] points=new int[4];
		int[][] subMatrix=preCompute(matrix);
		//System.out.print(Arrays.deepToString(subMatrix));
		for(int row1=0;row1<matrix.length;row1++)
			for(int col1=0;col1<matrix[0].length;col1++)
				for(int row2=row1;row2<matrix.length;row2++)
					for(int col2=col1;col2<matrix[0].length;col2++){
						max=Math.max(max, sumSubmatrix(subMatrix,row1,col1,row2,col2));
						if(sumSubmatrix(subMatrix,row1,col1,row2,col2)==max){
						points[0]=row1;
						points[1]=col1;
						points[2]=row2;
						points[3]=col2;
						}
					}
		System.out.print(max+" ");
		for(int i=0;i<4;i++){
			System.out.print(points[i]+" ");
		}
	}
	
	public static int[][] preCompute(int[][] matrix){
		int[][] subMatrix=new int[matrix.length][matrix[0].length];
		for(int row=0;row<matrix.length;row++){
			for(int col=0;col<matrix[0].length;col++){
				if(row==0&&col==0)
					subMatrix[row][col]=matrix[row][col];
				else if(row==0)
					subMatrix[row][col]=matrix[row][col]+subMatrix[row][col-1];
				else if(col==0)
					subMatrix[row][col]=matrix[row][col]+subMatrix[row-1][col];
				else
					subMatrix[row][col]=matrix[row][col]+subMatrix[row-1][col]+
							subMatrix[row][col-1]-subMatrix[row-1][col-1];;
			}
		}
		return subMatrix;
	}
	
	public static int sumSubmatrix(int[][] matrix,int row1,int col1,int row2,int col2){
		if(row1==0&&col1==0)
			return matrix[row2][col2];
		if(row1==0)
			return matrix[row2][col2]-matrix[row2][col1-1];
		if(col1==0)
			return matrix[row2][col2]-matrix[row1-1][col2];
		
		return matrix[row2][col2]-matrix[row2][col1-1]-matrix[row1-1][col2]+matrix[row1-1][col1-1];
		
	}
}	
