package leetCode;

public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start=0, end=A.length-1, middle=(start+end)/2;
        int result=-1;
        while(start<=end){
            if(A[middle]>target)
                end=middle-1;
            else if(A[middle]==target)
                return middle;
            else{
                start=middle+1;
                result=middle;
            }
            middle=(start+end)/2;
        }
        if(result==-1||A[result]!=target)
            result+=1;
        return result;
    }
}
