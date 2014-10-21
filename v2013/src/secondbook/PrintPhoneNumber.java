package secondbook;

public class PrintPhoneNumber {
	static final int PHONE_NUMBER_LENGTH = 4;
	
	public static void main(String[] args){
		int[] phoneNumber={3,4,1,2};
		char[] result=new char[PHONE_NUMBER_LENGTH];
		//doPrintPhoneNumberWords(phoneNumber,result,0);
		
		//iterative solution;
		for(int i=0;i<PHONE_NUMBER_LENGTH;i++)
			result[i]=getCharKey(phoneNumber[i],1);
		
		while(true){
			System.out.print(new String(result)+" ");
			for(int i=PHONE_NUMBER_LENGTH-1;i>=-1;i--){
				if(i==-1)
					return;
				if(result[i]=='0'||result[i]=='1'||result[i]==getCharKey(phoneNumber[i],3)){
					result[i]=getCharKey(phoneNumber[i],1);
				}
				else if(result[i]==getCharKey(phoneNumber[i],1)){
					result[i]=getCharKey(phoneNumber[i],2);
					break;
				}
				else if(result[i]==getCharKey(phoneNumber[i],2)){
					result[i]=getCharKey(phoneNumber[i],3);
					break;
				}
			}
		}
		
	}
	
	public static void doPrintPhoneNumberWords(int[] phoneNumber, char[] result, int curDigit){
		if(curDigit==PHONE_NUMBER_LENGTH){
			System.out.print(new String(result)+" ");
			return;
		}
		
		if(phoneNumber[curDigit]==0||phoneNumber[curDigit]==1){
			result[curDigit]=Character.forDigit(phoneNumber[curDigit],10);
			doPrintPhoneNumberWords(phoneNumber,result,curDigit+1);
		}
		else{		
			for(int i=1;i<=3;i++){
				result[curDigit]=getCharKey(phoneNumber[curDigit],i);
				doPrintPhoneNumberWords(phoneNumber,result,curDigit+1);
			}
		}
	}
	
	public static char getCharKey(int number,int index){
		char key = 0;
		switch(number){
		case 0:
			key='0';
			break;
		case 1:
			key='1';
			break;
		case 2:
			key=(char) ('a'+(index-1));
			break;
		case 3:
			key=(char) ('d'+(index-1));
			break;
		case 4:
			key=(char) ('g'+(index-1));		
			break;
		}
		return key;
	}
}
