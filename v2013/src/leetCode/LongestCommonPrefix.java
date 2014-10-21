package leetCode;

public class LongestCommonPrefix {
	public static void main(String[] args){
		String[] strs={"flow","flo","flowers","flower"};
		System.out.print(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs){
		int i=0;
		for(;i<strs[0].length();i++){
			int j=1;
			while(j<strs.length && i<strs[j].length() && strs[j].charAt(i)==strs[0].charAt(i))
				j++;
			if(j!=strs.length)
				break;
		}
		return strs[0].substring(0,i);
	}
}
