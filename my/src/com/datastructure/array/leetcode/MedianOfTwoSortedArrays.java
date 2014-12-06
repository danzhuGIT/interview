package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 10/21/14.
 * There are two sorted arrays A and B of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * Analysis:
 Note that the definition of the Median:
 (1) If the size of the sequence N is odd: N/2+1th element is median.
 (1) If the size of the sequence N is even:  average of the N/2th and N/2+1th element is median.

 So in this problem, median of the two sorted arrays is the (m+n)/2+1 th element (if m+n is odd), the average of (m+n)/2 th and (m+n)/2+1 th  (if m+n is even).
 E.g.,  [1,2,3],[5,6,7], the median is (3+5)/2 = 4.0.
 [1,2,3,4], [1,3,5,7,9], the median is 3.

 Our task becomes finding the Kth (K or K+1, K=(m+n)/2) number in two sorted arrays, in O(log(m+n)) time constraint (what's in your mind to see log? Yes, binary search).

 Similar to but slight different from binary search, we still divide K into two halves each time. Two pointers are used for each array, so that we can compare which side is smaller (?A[pa]>B[pb]).
 E.g., A = [1,3,5,7,9]  B = [2,4,8,10,12,14,16,18]. K=(5+8) /2= 6.

 pa = K/2 = 3;
 pb = K-pa = 3;
 pa
 A[1,3,5,7,9]
 pb
 B[2,4,8,10,12,14,16,18]

 if (A[pa]<B[pb]), which means the elements from A[0] to A[pa] must exist in the first Kth elements.
 The next step now becomes finding the (K-pa) th (equals to K/2) element in the array A[pa:end] and B[].  This procedure can be viewed as "cutting" K/2 elements from the "smaller" array, and continue find the other K/2 th elements from the "bigger" array and the array after the cut. Note that smaller and bigger here is the comparison of the last elements.

 if (A[pa]>B[pb]), the same procedure is applied but we "cut" the B array.

 In this way, every time we have "cut" K/2 elements from one of the arrays, the next time is to cut (K/2) /2 elements from the new arrays, until:
 (1) K=1, the smaller one from A[0] and B[0] is the "Kth element".
 (2) One of the array meets the end. Then just return the current Kth element from the other array.

 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int A[], int B[]) {
        int Alen = A.length;
        int Blen = B.length;
        if((Alen+Blen)%2 == 0){
            return (findMedianHelper(A, 0, Alen-1, B, 0, Blen-1, (Alen+Blen)/2) + findMedianHelper(A, 0, Alen-1, B, 0, Blen-1, (Alen+Blen)/2+1)) * 0.5;
        }
        return findMedianHelper(A, 0, Alen-1, B, 0, Blen-1, (Alen+Blen)/2+1);
    }

    private double findMedianHelper(int[] A, int Astart, int Aend, int[] B, int Bstart, int Bend, int k){
        int Alen = Aend - Astart + 1;
        int Blen = Bend - Bstart + 1;
        if(Alen > Blen)
            return findMedianHelper(B, Bstart, Bend, A, Astart, Aend, k);

        if(Alen <= 0)
            return B[k-1];

        if(k==1)
            return Math.min(A[Astart], B[Bstart]);


        int pa = Math.min(k/2, Alen);
        int pb = k-pa;

        if(A[Astart+pa-1] < B[Bstart+pb-1])
            return findMedianHelper(A, Astart+pa, Aend, B, Bstart, Bend, k-pa);
        else
            return findMedianHelper(A, Astart, Aend, B, Bstart+pb, Bend, k-pb);

    }
}
