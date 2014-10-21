package leetCode;

public class RegularExpressionMatch {
	public static void main(String[] args){
		String s="abcbcd";
		String t="a.*c";
		char[] ss=s.toCharArray();
		char[] ts=t.toCharArray();
		System.out.print(isMatch(ss,0,ts,0));
	}
	public static boolean isMatch(char[] s, int sindex, char[] t, int tindex){
		if(sindex>=s.length)
			return tindex>=t.length;
		if(tindex>=t.length)
			return sindex>=s.length;
		if(tindex==t.length-1||t[tindex+1]!='*')
			return (s[sindex]==t[tindex]||t[tindex]=='.')&&isMatch(s,sindex+1,t,tindex+1);
		
		while(sindex>=s.length||t[tindex]=='.'||s[sindex]==t[tindex]){
			if(isMatch(s,sindex,t,tindex+2)) return true;
			sindex++;
		}
		
		return isMatch(s,sindex,t,tindex+2);
			
	}
}
