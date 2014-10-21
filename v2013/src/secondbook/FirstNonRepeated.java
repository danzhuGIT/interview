package secondbook;

import java.util.Hashtable;

public class FirstNonRepeated {
	public static void main(String[] args){
		String str="asgaisl";
		Hashtable<Character,Boolean> charHash=new Hashtable<Character,Boolean>();
		
		for(int i=0;i<str.length();i++){
			char curChar=str.charAt(i);
			if(!charHash.containsKey(curChar)){
				charHash.put(curChar, true);
			}
			else
				charHash.put(curChar,false);			
		}
		int index;
		for(index=0;index<str.length();index++){
			char curChar=str.charAt(index);
			boolean check=charHash.get(curChar);
			if (check==true){
				break;
			}
		}
		if(index>str.length()){
			System.out.print("No first non-repeated chacracter.");
		}
		else
			System.out.print("First non-repeated chacracter is: "+str.charAt(index));
	}
}
