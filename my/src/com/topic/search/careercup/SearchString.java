package com.topic.search.careercup;

/**
 * Created by danzhu on 7/30/14.
 *
 * Given a sorted array of strings which is interspersed with empty strings, write a method to find the location of a given string.
 Example: find “ball” in [“at”, “”, “”, “”, “ball”, “”, “”, “car”, “”, “”, “dad”, “”, “”] will return 4
 Example: find “ballcar” in [“at”, “”, “”, “”, “”, “ball”, “car”, “”, “”, “dad”, “”, “”] will return -1

 */
public class SearchString {

    public static void main(String[] args){
        String[] strings={"at","","","ball","car","","","","dad","",""};
        System.out.print(searchString(strings,"car"));
    }

    public static int searchString(String[] strs, String s){
        if(strs.length == 0)
            return -1;

        //s is empty
        if(s == ""){
            for(int i = 0; i < strs.length; i++){
                if(strs[i] == "")
                    return i;
            }
            return -1;
        }

        //s is not empty
        int start = 0;
        int end = strs.length - 1;

        while(start <= end){
            while(start <= end && strs[end] == ""){
                end--;
            }
            if(start > end)
                return -1;

            int middle = (start+end)/2;
            //will always find one
            while(strs[middle] == "")
                middle++;
            int cmp = s.compareTo(strs[middle]);
            if(cmp == 0)
                return middle;
            if(cmp < 0)
                end = middle-1;
            else
                start = middle+1;
        }
        return -1;
    }
}
