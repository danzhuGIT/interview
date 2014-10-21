package hard;

public class FindSubsquare {
	class Square{
		int row;
		int col;
		int size;
		Square(int row, int col, int size){
			this.row=row;
			this.col=col;
			this.size=size;
		}
	}
	//Black=1; White=0;
	public Square findSubsquare(int[][] matrix){
		assert(matrix.length>0);
		assert(matrix[0].length==matrix.length);
		
		int maxSize=0;
		Square maxSubsquare=null;
		int curCol=0;
		
		int N=matrix.length;
		
		while(curCol<N-maxSize){
			for(int row=0;row<N;row++){
				int size=N-Math.max(row,curCol);
				while(size>maxSize){
					if(isSquare(row,curCol,size,matrix)){
						maxSize=size;
						maxSubsquare=new Square(row,curCol,size);
						break;
					}
					size--;
				}
			}
			curCol++;
		}	
		return maxSubsquare;
	}
	
	public boolean isSquare(int row, int col, int size, int[][] matrix){
		for(int i=0;i<size;i++){
			if(matrix[row][col+i]==0)
				return false;
			if(matrix[row+size-1][col+i]==0)
				return false;
		}
		for(int i=1;i<size-1;i++){
			if(matrix[row+i][col]==0)
				return false;
			if(matrix[row+i][col+size-1]==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		int [][] matrix={{0,1,1,1},{1,1,0,1},{0,1,1,1},{0,1,1,1}};
		FindSubsquare f=new FindSubsquare();
		FindSubsquare.Square maxSubsquare=f.findSubsquare(matrix);
		System.out.print("Left-Top Point: "+maxSubsquare.row+" "+maxSubsquare.col+" Size is: "+maxSubsquare.size);
		
	}
}
