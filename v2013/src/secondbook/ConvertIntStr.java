package secondbook;

public class ConvertIntStr {
	public static void main(String[] args){
		String str="-100";
		int num=-1;
		System.out.println(stringToInt(str));
		System.out.println(intToString(num));
	}
	
	public static String intToString(int number){
		final int MAX_DIGIT=10;
		char[] digit=new char[MAX_DIGIT+1];
		
		StringBuffer buf=new StringBuffer();
		if(number<0){
			buf.append('-');
			number=0-number;
		}
		int i=0;
		do{
			digit[i]=(char)(number%10+'0');
			number=number/10;
			i++;
		}while(number!=0);
		
		while(i>0){
			buf.append(digit[--i]);
		}
		
		return buf.toString();	
	}
	
	public static int stringToInt(String str){
		boolean isNeg=false;
		int i=0;
		if(str.charAt(i)=='-'){
			i++;
			isNeg=true;
		}
		int number=0;	
		while(i<str.length()){
			number=number*10+(int)(str.charAt(i)-'0');
			i++;
		}
		if(isNeg)
			number=0-number;
		return number;
	}
}

