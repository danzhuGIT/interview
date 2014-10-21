package secondbook;

public class ReverseWords {
	public static void main(String[] args){
		String words="Do or do not, there is no try. ";
		System.out.println(reverseWords(words));
		System.out.print(reverseTotal(words));
	}
	
	public static String reverseWords(String words){
		char[] wordsChar=words.toCharArray();
		StringBuffer buffer=new StringBuffer();
		for(int i=wordsChar.length-1;i>=0;i--){
			if(wordsChar[i]==' '||i==0)	{
				int j=i;
				if(wordsChar[i]==' ')
					j=i+1;
				while(j<wordsChar.length&&!(wordsChar[j]==' ')){
					buffer.append(wordsChar[j]);
					j++;
				}
				buffer.append(' ');	
			}
		}				
		return buffer.toString();
	}
	
	public static String reverseTotal(String words){
		int length=words.length();
		char[] wordsChar=words.toCharArray();
		reverse(wordsChar,0,length-1);
		int start=0;
		int end=0;
		while(end<length){
			if(wordsChar[end]!=' '){
				start=end;
				while(end<length&&wordsChar[end]!=' ')
					end++;
				reverse(wordsChar,start,end-1);
			}
			else
				end++;
		}
		return new String(wordsChar);	
	}
	
	public static void reverse(char[] wordsChar, int start, int end){
		while(start<end){
			char temp=wordsChar[start];
			wordsChar[start]=wordsChar[end];
			wordsChar[end]=temp;
			start++;
			end--;
		}

	}
}
