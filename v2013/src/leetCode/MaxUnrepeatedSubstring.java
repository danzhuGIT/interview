package leetCode;

import java.util.HashSet;

public class MaxUnrepeatedSubstring {
	public static void main(String[] args){
		System.out.print(maxUnrepeatedSubstring("abassdfs"));
	}
	
	public static int maxUnrepeatedSubstring(String str){
		int max=0;
		HashSet<Character> set=new HashSet<Character>();
		int candidateStartIndex=0;
		for(int i=0;i<str.length();i++){
			if(set.contains(str.charAt(i))){
				max=Math.max(i-candidateStartIndex,max);
				while(str.charAt(candidateStartIndex)!=str.charAt(i)){
					set.remove(str.charAt(candidateStartIndex));
					candidateStartIndex++;
				}
				candidateStartIndex++;
			}
			else{
				set.add(str.charAt(i));
			}
		}
		max=Math.max(max,str.length()-candidateStartIndex);
		return max;
	}
}
