package leetCode;

public class StockBuySell {
	public static void main(String[] args){
		int[] prices={};
		System.out.print(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int n=prices.length;
        if(n==0)
            return 0;
        
        int maxPrice=prices[n-1];
        int maxProfit=0;
        for(int i=n-1;i>=0;i--){
            maxPrice=Math.max(maxPrice,prices[i]);
            maxProfit=Math.max(maxProfit,maxPrice-prices[i]);   
        }
        return maxProfit;    
    }
	
	public int maxProfitII(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n=prices.length;
        if(n==0) 
            return 0;
            
        int maxProfit=0;
        int start=0;
        for(int i=1;i<n;i++){
            if(prices[i]>=prices[i-1])
                continue;
            
            maxProfit+=prices[i-1]-prices[start];
            start=i;
        }
        maxProfit+=prices[n-1]-prices[start];
        
        return maxProfit;
    }
	
    public int maxProfitIII(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n=prices.length;
        if(n==0)
            return 0;
        
        int[] f1=new int[n];
        int[] f2=new int[n];
        
        f1[0]=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            f1[i]=Math.max(f1[i-1],prices[i]-min);
        }
        
        f2[n-1]=0;
        int max=prices[n-1];
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,prices[i]);
            f2[i]=Math.max(f2[i+1],max-prices[i]);
        }
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum=Math.max(sum,f1[i]+f2[i]);
        }
        return sum;
    }
}
