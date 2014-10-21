package leetCode;

public class AddBinary {
	public static void main(String[] args){
		System.out.print(addBinary("10","1111"));
	}
	
	public static String addBinary(String a, String b){
		if(b.indexOf('1')==-1)
			return a.indexOf('1')==-1 ? a:a.substring(a.indexOf('1'));
		int dif=Math.abs(a.length()-b.length());
		if(a.length()>b.length()){
			for(int i=0;i<dif;i++)
				b='0'+b;
		}
		else{
			for(int i=0;i<dif;i++)
				a='0'+a;
		}
		String sum=new String();
		String carry="0";
		
		for(int i=a.length()-1;i>=0;i--){
			if((a.charAt(i)=='0'&&b.charAt(i)=='0')||(a.charAt(i)=='1'&&b.charAt(i)=='1'))
				sum='0'+sum;
			else 
				sum='1'+sum;
			
			if(a.charAt(i)=='1'&&b.charAt(i)=='1')
				carry='1'+carry;
			else
				carry='0'+carry;
					
		}		
		//System.out.print("sum:"+sum);
		//System.out.print("carry:"+carry);
		return addBinary(sum,carry);
	}
}
