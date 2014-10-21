package leetCode;

public class NextPermutation {
	public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num==null||num.length==0)
            return;
        
        for(int i=num.length-1;i>=1;i--){
            int j=i-1;
            if(num[i]<=num[j])
                continue;
            int l=i;
            int k=num.length-1;
            while(l<k){
            	swap(num,l,k);
                l++;
                k--;
            }
            int m=i;
            while(num[m]<=num[j])
            	m++;
            swap(num,j,m);
            return;        
        }
        int i=0;
        int j=num.length-1;
        while(i<j){
        	swap(num,i,j);
            i++;
            j--;
        }
        return;
    }
	public static void swap(int[] num, int i, int j){
        int tmp=num[j];
        num[j]=num[i];
        num[i]=tmp;
        return;
	}
}
