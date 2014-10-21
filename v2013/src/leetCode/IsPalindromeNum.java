package leetCode;

public class IsPalindromeNum {
		public static void main(String[] args) {
	        // Start typing your code here...
	        System.out.println(isPalidrome(121));
	        System.out.println(isPalidrome(0));
	        System.out.println(isPalidrome(1234));        
	    }
	    
	    public static boolean isPalidrome(int x){
	        if(x<0) return false;
	        int div=1;
	        while(x/div>=10){
	            div*=10;   
	        }
	        while(x!=0){
	            int l=x/div;
	            int r=x%10;
	            if(l!=r) return false;
	            x=(x%div)/10;
	            div/=100;
	        }
	        return true;
	    }
}
