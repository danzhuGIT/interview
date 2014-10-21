package com.datastructure.array.careercup;

import java.util.ArrayList;

/**
 * Created by danzhu on 8/26/14.
 *
 * There are 2 sorted sets.Find the common elements of those sets
 e.g.
 A={1,2,3,4,5,6}
 B={5,6,7,8,9}
 o/p C={5,6}

 Complexity should ne 0(n+m) where n and m is the size of the first and second set respectively

 Which data structure should be used to store the output

 */
public class FindIntersection {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int[] b = {5,6,7,8};
        ArrayList<Integer> result = findIntersection(a,b);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> findIntersection(int[] a, int[] b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                result.add(a[i]);
                i++;
                j++;
            } else if(a[i] < b[j]){
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
