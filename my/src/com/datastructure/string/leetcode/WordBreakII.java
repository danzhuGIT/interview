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
        //List<String> result = wordBreak(str, set);
        //System.out.print(result);
    }
    public List<String> wordBreak(String s, Set<String> dict) {
        ArrayList<String> result = new ArrayList<String>();
        if(s==null || s.length()==0)
            return result;

        boolean[][] seg = new boolean[s.length()][s.length()+1];
        for(int len = 1; len <= s.length(); len++){
            for(int start=0; start < s.length(); start++){
                if(start+len<=s.length()){
                    if(dict.contains(s.substring(start, start+len))){
                        seg[start][len]=true;
                        continue;
                    }
                    for(int i = 1; i < len; i++){
                        if(seg[start][i]==true && seg[start+i][len-i]==true){
                            seg[start][len]=true;
                            break;
                        }
                    }

                }

            }
        }

        // if no solution
        if (!seg[0][s.length()])
            return result;

        dfs(s,seg,0,result,new StringBuilder(),dict);
        return result;
    }

    private void dfs(String s, boolean seg[][], int start,
                     ArrayList<String> ret, StringBuilder sb, Set<String> dict) {
        // exit
        if ("".equals(s)) {
            // need to trim the ending white space
            ret.add(sb.substring(0, sb.length() - 1));
        }

        for (int len = 1; len <= s.length(); len++) {
            // do pruning here
            if (seg[start][len]) {
                String str = s.substring(0, len);
                if (dict.contains(str)) {
                    sb.append(str).append(" ");
                    dfs(s.substring(len), seg, start + len, ret, sb, dict);
                    // backtrack
                    sb.delete(sb.length() - str.length() - 1, sb.length());
                }
            }
        }
    }

    public List<String> wordBreakII(String str, Set<String> dict) {
        ArrayList<String> result = new ArrayList<String>();
        if(str==null || str.length()==0)
            return result;

        boolean[] t = new boolean[str.length()+1];
        t[0] = true;

        for(int i = 0; i < str.length(); i++){
            if(!t[i])
                continue;

            for(String s : dict){
                int len = s.length();
                int end = i + len;
                if(end > str.length())
                    continue;
                if(str.substring(i,end).equals(s))
                    t[end]=true;
            }
        }

        // if no solution
        if (!t[str.length()])
            return result;

        dfs(str,0,result,new StringBuilder(),dict);
        return result;
    }

    private void dfs(String s, int start,
                     ArrayList<String> ret, StringBuilder sb, Set<String> dict) {
        // exit
        if ("".equals(s)) {
            // need to trim the ending white space
            ret.add(sb.substring(0, sb.length() - 1));
        }

        for (int len = 1; len <= s.length(); len++) {
            String str = s.substring(0, len);
            if (dict.contains(str)) {
                sb.append(str).append(" ");
                dfs(s.substring(len), start + len, ret, sb, dict);
                // backtrack
                sb.delete(sb.length() - str.length() - 1, sb.length());
            }

        }
    }
}
