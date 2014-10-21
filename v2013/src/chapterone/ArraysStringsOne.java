package chapterone;

// Implement an algorithm to determine if a string has all unique characters.
// What if you can not use additional data structures?

public class ArraysStringsOne {
	public static void main(String[] args){
		String str="abc";
		boolean unique=uniqueCharacters2(str);
		System.out.println(unique);
		
	}
	public static boolean uniqueCharacters(String str){

		boolean[] ASCII=new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			if (ASCII[str.charAt(i)]==true)
				return false;
			ASCII[str.charAt(i)]=true;
		}				
		return true;
	}
	
	public static boolean uniqueCharacters2(String str){
		boolean result=true;
		char[] strchar=str.toCharArray();

		for(int i=0;i<strchar.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(strchar[j]==strchar[i])
				{
					result=false;
					break;
				}
			}
		}				
		return result;
	}
}
