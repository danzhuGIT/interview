package leetCode;

public class ClimbStairs {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n==0||n==1)
            return 1;
        
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public int climbStairs2(int n) {
    	 
        // Start typing your Java solution below
        // DO NOT write main() function
        int f0 = 0, f1 = 1;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }
        return result;
    }
}
