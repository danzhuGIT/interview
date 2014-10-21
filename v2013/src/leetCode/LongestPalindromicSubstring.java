package leetCode;

public class LongestPalindromicSubstring {
	public static void main(String[] args){
		System.out.print(longestPalindromicSubstring("dabcdcbab"));
	}
	
	public static String longestPalindromicSubstring(String str){
		for(int n=str.length();n>=1;n--){
			for(int i=0;i+n-1<str.length();i++){
				if(isPalindrome(str.substring(i,i+n)))
					return str.substring(i,i+n);
			}
		}
		return null;
	}
	
	public static boolean isPalindrome(String str){
		if(str==null||str.length()==0)
			return false;
		int i=0;
		int j=str.length()-1;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
