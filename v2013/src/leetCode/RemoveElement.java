package leetCode;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
            
        int i=0;
        int j=A.length-1;
        
        while(i<j){
            if(A[i]==elem){
                int tmp=A[j];
                A[j]=A[i];
                A[i]=tmp;
                j--;
            }
            else{
                i++;
            }
        }
        if(j>=0 && A[j]!=elem)
            i++;
            
        return i;
    }
}
