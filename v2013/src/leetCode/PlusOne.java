package leetCode;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(digits.length==0)
            return digits;
        
        int carry=1;
        int sum=0;
        for(int i=digits.length-1;i>=0;i--){
            sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }
        if(carry==0)
            return digits;
        else{
            int[] newDigits=new int[digits.length+1];
            newDigits[0]=carry;
            for(int i=0;i<digits.length;i++){
                newDigits[i+1]=digits[i];
            }
            return newDigits;
        }
    }
}
