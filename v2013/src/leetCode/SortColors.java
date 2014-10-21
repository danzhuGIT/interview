package leetCode;

public class SortColors {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int l=0,i=0,r=A.length-1;
        while(i<=r){
            if(A[i]==0){
                swap(A,i,l);
                l++;
                i++;
            }
            else if(A[i]==2){
                swap(A,i,r);
                r--;
            }
            else
                i++;
        }
    }
    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j]= temp;
    }
}
