package leetCode;

public class WordSearch {
	public static void main(String[] args){
		char[][] board={{'a'}};
		System.out.print(exist(board,"ab"));
		
	}
	public static boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (board.length == 0) {
            return word.length() == 0;
        }
        int m=board.length;
        int n=board[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(recursion(board,word,0,visited,i,j))
                    return true;
            }
        }
        return false;
    }
    public static boolean recursion(char[][] board, String word, int level, boolean[][] visited, int row, int col){
        if(board[row][col]!=word.charAt(level))
            return false;
        
        if(level==word.length()-1)
            return true;
            
        boolean up = false, down = false, left = false, right = false;
        int m=board.length, n=board[0].length;
        visited[row][col]=true;
        if(row-1>=0 && !visited[row-1][col]){
            up=recursion(board,word,level+1,visited,row-1,col);
        }
        
        if(up) return true;
        if(col-1>=0 && !visited[row][col-1])
            left=recursion(board,word,level+1,visited,row,col-1);
        
            
        if(left) return true;
        if(row+1<m && !visited[row+1][col])
            down=recursion(board,word,level+1,visited,row+1,col);        
            
        if(down) return true;
        if(col+1<n && !visited[row][col+1])
            right=recursion(board,word,level+1,visited,row,col+1);
       
        if(right) return true;
        visited[row][col]=false;
        return false;
        
    }
}
