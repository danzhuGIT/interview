package haitaoblog;

public class LeftRotateString {
	public static void main(String[] args){
		String str="ABCDEF";
		int m=2;
		System.out.print(leftRotateString(str,m));
		
	}
	public static String leftRotateString(String str, int m){

		String strX=str.substring(0,m);
		String strY=str.substring(m);
		
		strX=rotate(strX);
		strY=rotate(strY);
		return rotate(strX+strY);
		
	}
	public static String rotate(String str){
		char[] strChar=str.toCharArray();
		int start=0;
		int end=str.length()-1;
		while(start<end){
			char temp=strChar[start];
			strChar[start]=strChar[end];
			strChar[end]=temp;
			start++;
			end--;
		}	
		return new String(strChar);
	}
}
