package leetCode;

public class TrapRainWater {
	public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int sum=0;
        int i=0,j=A.length-1;
        
        while(i<j){
            while(i<j && A[i]<=A[i+1])
                i++;
            while(i<j && A[j]<=A[j-1])
                j--;
            if(i==j)
                break;
            if(A[i]<A[j]){
                int k=i+1;
                for(;k<=j;k++){
                    if(A[k]>=A[i])
                        break;
                    else{
                        sum+=A[i]-A[k];
                    }
                }
                i=k;
            }
            else{
                int k=j-1;
                for(;k>=i;k--){
                    if(A[k]>=A[j])
                        break;
                    else{
                        sum+=A[j]-A[k];
                    }
                }
                j=k;
            }
                
        }
        return sum;
    }
}
