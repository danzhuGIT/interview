import java.util.Arrays;


public class SwapString {
	public static void main(String[] args){
		String s1="hello";
		String s2="world";
		System.out.print(s1+" "+s2);
		//swap(s1,s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println(s1+" "+s2);
		
		
		
		String[] strs={"aa","bb"};
		String tmp=strs[1];
		strs[1]=strs[0];
		strs[0]=tmp;
		System.out.print(Arrays.toString(strs));
	}
	
	public static void swap(String s1, String s2){
		s2=s1.substring(2);
	}
}
