package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 7/31/14.
 * Implement strStr().

 Returns a pointer to the first occurrence of needle in haystack, or null if needle is not part of haystack.
 */
public class ImplementstrStr {
    public String strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        if(needleLen == 0 && haystackLen == 0)
            return "";

        if(needleLen == 0)
            return haystack;

        for(int i = 0; i <= haystackLen - needleLen; i++){
            if(needle.equals(haystack.substring(i, i+needleLen)))
                return haystack.substring(i);
        }
        return null;
    }
}
