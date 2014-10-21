package leetCode;

public class sqrt {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        double ans=x;
        while(Math.abs(ans*ans-x)>0.0001){
            ans=(ans+x/ans)/2;
        }
        return (int) ans;
    }
}
