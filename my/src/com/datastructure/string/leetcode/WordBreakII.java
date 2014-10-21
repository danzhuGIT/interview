package com.datastructure.string.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by danzhu on 7/23/14.
 * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.

 Return all such possible sentences.

 For example, given
 s = "catsanddog",
 dict = ["cat", "cats", "and", "sand", "dog"].

 A solution is ["cats and dog", "cat sand dog"].
 */
public class WordBreakII {
    /* Time Limit Exceeded
    public List<String> wordBreak(String s, Set<String> dict) {
        ArrayList<String> result = new ArrayList<String>();
        if(s==null || s.length()==0)
            return result;
        addWordBreak(s,dict,0,result);
        return result;
    }
    private void addWordBreak(String s, Set<String> dict, int start, ArrayList<String> result)
    {
        if(start>=s.length()){
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(String word : dict){
            if(start+word.length() > s.length())
                continue;

            if(word.equals(s.substring(start, start+word.length()))){
                result.add(word);
                addWordBreak(s, dict, start+word.length(), result);
                result.remove(result.size()-1);
            }
        }
    }
     */
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        String str = "ab";
        List<String> result = wordBreak(str, set);
        System.out.print(result);
    }
    public List<String> wordBreak(String str, Set<String> dict) {
        ArrayList<String> result = new ArrayList<String>();
        if(str==null || str.length()==0)
            return result;

        boolean[][] possible = new boolean[str.length()][str.length()+1];
        for(int len = 1; len <= str.length(); len++){
            for(int start=0; start < str.length(); start++){
                if(start+len<=str.length()){
                    if(dict.contains(str.substring(start, start+len))){
                        possible[start][len]=true;
                        continue;
                    }
                    for(int i = 1; i < len; i++){
                        if(possible[start][i]==true && possible[start+i][len-i]==true){
                            possible[start][start+len]=true;
                            break;
                        }
                    }

                }

            }
        }
        if(!possible[0][str.length()])
            return result;

        addWordBreak(str,dict,0,new StringBuilder(),possible,result);
        return result;
    }
    private void addWordBreak(String s, Set<String> dict, int start, StringBuilder sb, boolean[][] possible, ArrayList<String> result)
    {
        if(s.length()==0){
            result.add(sb.substring(0,sb.length()-1));
            return;
        }
        for(int len=1; len<=s.length(); len++){
            if(possible[start][len]){
                String temp = s.substring(0, len);
                if(dict.contains(temp)){
                    sb.append(temp).append(" ");
                    addWordBreak(s.substring(len), dict, start+len, sb, possible, result);
                    sb.delete(sb.length()-temp.length()-1, sb.length());
                }
            }
        }
    }
}
