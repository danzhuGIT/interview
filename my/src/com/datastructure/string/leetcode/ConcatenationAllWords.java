package com.datastructure.string.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by danzhu on 7/30/14.
 * You are given a string, S, and a list of words, L, that are all of the same length. Find all starting indices of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.

 For example, given:
 S: "barfoothefoobarman"
 L: ["foo", "bar"]

 You should return the indices: [0,9].
 (order does not matter).
 */
public class ConcatenationAllWords {
    public static void main(String[] args){
        String[] L = {"wing","sorr","wing"};
        String S = "avwinwingwingsorr";
        //findSubstring(S, L);
    }

    public List<Integer> findSubstring(String S, String[] L) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(S.length() == 0 || L.length == 0 || L[0].length() == 0)
            return result;

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String str : L){
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }else{
                map.put(str, 1);
            }
        }

        int wordLen = L[0].length();

        for(int index = 0; index <= S.length()-wordLen*L.length; index++){
            if(isValid(map, S, wordLen, L.length, index))
                result.add(index);
        }
        return result;
    }

    private boolean isValid(HashMap<String, Integer> map, String S, int wordLen, int length, int start){
        HashMap<String, Integer> curMap = new HashMap<String, Integer>();
        for(int j = start; j < length*wordLen+start; j+=wordLen){
            String str = S.substring(j, j+wordLen);
            if(!map.containsKey(str)){
                return false;
            } else {
                if(curMap.containsKey(str)){
                    curMap.put(str, curMap.get(str)+1);
                    if(curMap.get(str) > map.get(str)){
                        return false;
                    }
                }else{
                    curMap.put(str, 1);
                }
            }
        }
        return true;
    }
}
