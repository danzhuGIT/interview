package chapterone;

// Write code to reverse a C-Style String.
// (C-String means that “abcd” is represented as five characters, including the null character.)

public class CStyleReverse {
	public static void main(String[] args){
		char[] str={'a','b','c','n'};
		int start=0;
		int end=str.length-2;
		while(start<end){
			char temp=str[end];
			str[end]=str[start];
			str[start]=temp;
			end--;
			start++;
		}
		System.out.print(str);
	}
}
