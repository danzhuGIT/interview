package leetCode;

public class MultipleString {
    public String multiply(String num1, String num2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        char[] arr1=num1.toCharArray();
        char[] arr2=num2.toCharArray();
        
        char[] result=new char[arr1.length+arr2.length];
        for(int i=arr1.length-1;i>=0;i--){
            int carry=0;
            int startIndex=i+arr2.length;
            for(int j=arr2.length-1;j>=0;j--){
                int index=startIndex+j-arr2.length+1;
                int tmp=(arr1[i]-'0')*(arr2[j]-'0')+carry;
                result[tmp]=result[tmp]+tmp%10;
                carry=tmp/10;
                
            }
        }
    }
}
