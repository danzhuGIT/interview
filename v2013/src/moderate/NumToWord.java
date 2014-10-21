package moderate;

public class NumToWord {
	public static void main(String[] args){
		System.out.print(numToWord(20014));
	}
	public static String numToWord(int num){
		StringBuilder word=new StringBuilder();
		int len=getLength(num);
		
		String[] ones={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] teen={"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] tens={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String[] hundred={"","Hundred","Thousand"};
		
		if(num==0)
			word.append("Zero");
		else{
			int tmp;
			int tmplen;
			do{
				tmplen=len;
				tmp=num;
				if(len>3){
					tmp=num/1000;
					tmplen=len-3;
				}
				if(tmplen==3){
					word.append(ones[tmp/100]);
					word.append(hundred[1]);
				}
				tmp=tmp%100;
				if(tmp/10==1&&tmp%10!=0)
					word.append(teen[tmp%10]);
				else{
					word.append(tens[tmp/10]);
					word.append(ones[tmp%10]);
				}
				if(len>3)
					word.append(hundred[2]);
				else
					break;
				num=num%1000;
				len=getLength(num);
			}
			while(true);
		}
		
		return new String(word);
	}
	
	public static int getLength(int num){
		int len=1;
		while(Math.pow((double)10, (double)len)<num)
			len++;
		return len;
	}
}
