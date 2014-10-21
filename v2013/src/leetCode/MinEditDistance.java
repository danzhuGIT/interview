package leetCode;

public class MinEditDistance {
	public static void main(String[] args){
		String s1="abcd";
		String s2="abd";
		System.out.print(minEditDistance(s1,s2));
	}
	public static int minEditDistance(String s1, String s2){
		int n1=s1.length()+1;
		int n2=s2.length()+1;
		int[][] table=new int[n1][n2];
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				if(i==0)
					table[i][j]=j;
				else if(j==0)
					table[i][j]=i;
				else{
					if(s1.charAt(i-1)==s2.charAt(j-1))
						table[i][j]=table[i-1][j-1];
					else{
						table[i][j]=Math.min(Math.min(table[i-1][j],table[i][j-1]),table[i-1][j-1])+1;
					}
				}
				
			}
		}
		return table[n1-1][n2-1];
	}
}
