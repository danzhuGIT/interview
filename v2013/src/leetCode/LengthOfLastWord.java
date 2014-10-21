package leetCode;

public class LengthOfLastWord {
	public static void main(String[] args){
		System.out.print(lengthOfLastWord("a gdsdg "));
	}
	
	public static int lengthOfLastWord(String str){
		int length=0;
		int i=str.length()-1;
		for(;i>=0;i--){
			if(!(str.charAt(i)==' '))
				break;
		}

		while(i>=0&&str.charAt(i)!=' '){
			i--;
			length++;
		}
		
		return length;
	}
}
