package leetCode;

public class PermKth {
	public static void main(String[] args){
		System.out.print(getPermutation(2,1));
	}
	public static String getPermutation(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean[] used=new boolean[n];
        StringBuffer result=new StringBuffer();
        int nFact=1;
        if(n>0){
            for(int i=1;i<=n;i++)
                nFact=nFact*i;
        }
        if(k>nFact)
            return "";
            
        while(k>0){
        	if(n==0)
        		break;
            else
            	nFact=nFact/(n--);

            int d=(k-1)/nFact+1;
            k=k-(d-1)*nFact;

            int i=0;
            for(;i<used.length;i++){
                if(used[i]==false)
                    d--;
                if(d==0)
                    break;
            }
            used[i]=true;
            result.append(i+1);

        }
        
        return result.toString();   
    }
}
