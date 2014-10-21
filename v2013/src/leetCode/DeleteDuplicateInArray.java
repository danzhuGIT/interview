package leetCode;

public class DeleteDuplicateInArray {
	public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n=A.length;
        if(n<=2)
            return n;
        
        int start=0;
        int key=A[start];
        int count=0;
        for(int i=0;i<n;i++){
            if(A[i]==key){
                count++;
            }
            else{
                for(int j=0;j<Math.min(2,count);j++)
                    A[start++]=key;
                key=A[i];
                count=1;
            }
        }

        for(int j=0;j<Math.min(2,count);j++)
            A[start++]=key;
        
        return start;
    }
}
