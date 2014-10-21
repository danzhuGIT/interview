package chaptereight;

import java.util.ArrayList;

public class GetPerm {
	public static void main(String[] args){
		String str="abc";
		System.out.print(getPerm(str));
		
	}
	
	public static ArrayList<String> getPerm(String str){
		ArrayList<String> permutations=new ArrayList<String>();
		if(str==null)
			return null;
		else if(str.length()==1)
			permutations.add(str);
		else {
			String first=str.substring(0,1);
			String remainder=str.substring(1);
			ArrayList<String> remainderPerm=getPerm(remainder);
			for(String perm:remainderPerm)
			{
				for(int i=0;i<=remainder.length();i++){
					permutations.add(addFirst(perm,first,i));
				}
			}
		}
		return permutations;
	}
	
	public static String addFirst(String word, String letter,int pos)
	{
		String head=word.substring(0,pos);
		String tail=word.substring(pos);
		return head+letter+tail;
	}
}
