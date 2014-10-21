package leetCode;

public class CountAndSay {
	public static void main(String[] args){
		System.out.print(countAndSay(5));
	}
	
	public static String countAndSay(int n){
		String result="1";
		for(int i=2;i<=n;i++){
			String newResult=new String();			
			for(int j=0;j<result.length();){
				char cur=result.charAt(j);
				int count=0;
				while(j<result.length()&&result.charAt(j)==cur){
					count++;
					j++;
				}
				newResult+=""+count+cur;
			}
			result=newResult;
		}
		return result;
	}
}
