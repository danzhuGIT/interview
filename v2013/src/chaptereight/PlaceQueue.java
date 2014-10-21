package chaptereight;

public class PlaceQueue {
	static int[] columnForRow=new int[8];
	static int count=1;
	
	public static void main(String[] args){
		placeQueue(0);
	}
	public static void placeQueue(int row)
	{
		if(row==8){
			printBoard();
			return;
		}
		else
		{
			for(int i=0;i<8;i++)
			{
				columnForRow[row]=i;
				if(check(row))
					placeQueue(row+1);
			}
		}
	}
	public static boolean check(int row)
	{
		int differ=0;
		for(int i=0;i<row;i++){
			differ=Math.abs(columnForRow[row]-columnForRow[i]);
			if(differ==0||differ==row-i) return false;
		}
		return true;
	}
	public static void printBoard()
	{
		System.out.print("count="+count+" ");
		count++;
		for(int i=0;i<8;i++)
			System.out.print(columnForRow[i]+" ");
	}	
}
