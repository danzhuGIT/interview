package secondbook;

import java.util.HashSet;

public class RemoveChars {
	public static void main(String[] args){
		String str="as soon as possible!";
		String remove="as";
		
		System.out.print(removeChars(str,remove));

	}
	
	public static String removeChars(String str, String rem){
		char[] strChars=str.toCharArray();
		char[] remChars=rem.toCharArray();
		HashSet<Character> charHash=new HashSet<Character>();
		for(int i=0;i<remChars.length;i++)
			charHash.add(remChars[i]);
		int index=0;
		for(int i=0;i<strChars.length;i++){
			if(!charHash.contains(strChars[i])){
				strChars[index]=strChars[i];
				index++;}
		}
		return new String(strChars,0,index);
		
	}
}
