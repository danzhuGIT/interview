package tictactoe;

public class TicTacToeGame {
	public static void main(String[] args){
		
	}
	
	Piece hasWon(Piece[][] board){
		int n=board.length;
		Piece winner=Piece.Empty;
		
		for(int i=0;i<n;i++){
			winner=getWinner(board,i,Check.Row);
			if(winner!=Piece.Empty)
				return winner;
			winner=getWinner(board,i,Check.Column);
			if(winner!=Piece.Empty)
				return winner;
		}
		winner=getWinner(board,0,Check.Diagonal);
		if(winner!=Piece.Empty)
			return winner;
		
		winner=getWinner(board,0,Check.ReverseDiagonal);
		if(winner!=Piece.Empty)
			return winner;
		return winner;
	}
	
	Piece getWinner(Piece[][] board,int k, Check check){
		Piece color=getIthColor(board,k,0,check);
		if(color==Piece.Empty) return Piece.Empty;
		for(int i=1;i<board.length;i++){
			if(color!=getIthColor(board,k,i,check))
				return Piece.Empty;
		}
		return color;
	}
	Piece getIthColor(Piece[][] board, int index, int offset, Check check){
		if(check==Check.Row)	return board[index][offset];
		if(check==Check.Column)	return board[offset][index];
		if(check==Check.Diagonal)	return board[offset][offset];
		if(check==Check.ReverseDiagonal) return board[offset][board.length-1-offset];
		return Piece.Empty;
	}
}
