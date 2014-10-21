package haitaoblog;

public class LongestCommonString {
	enum Dir{Init,Left,Up,LeftUp};
	
	public static void main(String[] args){
		String x="BDCABA";
		String y="ABCBDAB";	
		longestCommonString(x,y);
	}
	
	public static int longestCommonString(String x, String y){
		if(x==null||y==null)
			return 0;
		int m=x.length();
		int n=y.length();
		int[][] longestNum=new int[m][n];
		Dir[][] direction=new Dir[m][n];
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++){
				direction[i][j]=Dir.Init;
				longestNum[i][j]=0;
			}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i==0||j==0){
					if(x.charAt(i)==y.charAt(j)){
						direction[i][j]=Dir.LeftUp;
						longestNum[i][j]=1;
					}
					else{
						longestNum[i][j]=0;
					}
				}
				else{
					if(x.charAt(i)==y.charAt(j)){
						direction[i][j]=Dir.LeftUp;
						longestNum[i][j]=longestNum[i-1][j-1]+1;
					}
					else{
						if(longestNum[i-1][j]>longestNum[i][j-1]){
							direction[i][j]=Dir.Up;
							longestNum[i][j]=longestNum[i-1][j];
						}
						else{
							direction[i][j]=Dir.Left;
							longestNum[i][j]=longestNum[i][j-1];
						}
					}
				}					
			}
		}
		lcs_print(x,m-1,n-1,direction);
		return longestNum[m-1][n-1];	
	}
	
	public static void lcs_print(String x, int row, int column, Dir[][] direction){
		if(row<0||column<0)
			return;
		if(direction[row][column]==Dir.LeftUp){
			lcs_print(x,row-1,column-1,direction);
			System.out.print(x.charAt(row));
		}
		else if(direction[row][column]==Dir.Up){
			lcs_print(x,row-1,column,direction);
		}
		else if(direction[row][column]==Dir.Left){
			lcs_print(x,row,column-1,direction);
		}
	}
	
}
