package leetCode;

public class LongestWithoutRepeat {
	public static void main(String[] args){
		System.out.print(longestWithoutRepeat("aaabcs"));
	}
	
	public static int longestWithoutRepeat(String str){
		boolean[] exist=new boolean[256];
		int max=0;
		int i=0,j=0;
		char[] strChar=str.toCharArray();
		while(j<strChar.length){
			if(exist[strChar[j]]==true){
				max=Math.max(j-i,max);
				while(i<j){
					exist[strChar[i]]=false;
					i++;
				}
				i++;
				j++;
			}
			else{
				exist[strChar[j]]=true;
				j++;
			}
		}
		max=Math.max(strChar.length-i,max);
		return max;
	}
}
