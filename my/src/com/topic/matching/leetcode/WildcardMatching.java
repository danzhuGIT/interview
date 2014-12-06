package com.topic.matching.leetcode;

/**
 * Created by danzhu on 7/8/14.
 *
 * Implement wildcard pattern matching with support for '?' and '*'.

 '?' Matches any single character.
 '*' Matches any sequence of characters (including the empty sequence).

 The matching should cover the entire input string (not partial).

 The function prototype should be:
 bool isMatch(const char *s, const char *p)

 Some examples:
 isMatch("aa","a") → false
 isMatch("aa","aa") → true
 isMatch("aaa","aa") → false
 isMatch("aa", "*") → true
 isMatch("aa", "a*") → true
 isMatch("ab", "?*") → true
 isMatch("aab", "c*a*b") → false
 *
 */
public class WildcardMatching {
    public static void main(String[] args){
        String p = "aaa";
        System.out.println(isMatch("aab", "c*a*b"));
        System.out.println(isMatch("bsdakkkk", "****"));
    }

    public boolean isMatchBetter(String s, String p) {
        if(p == null)   return s == null;

        int posS = 0;
        int posP = 0;
        int sl = s.length();
        int pl = p.length();
        int star = -1;
        int mark = -1;

        while(posS < sl){
            if(posP<pl && (s.charAt(posS)==p.charAt(posP) || p.charAt(posP)=='?')){
                posP++;
                posS++;
            }else if(posP<pl && p.charAt(posP)=='*'){
                star = posP;
                mark = posS;
                posP++;
            }else if(star>=0){
                posP = star+1;
                posS = ++mark;
            }else
                return false;
        }
        while(posP < pl && p.charAt(posP)=='*')
            posP++;

        return posP == pl;
    }

    public static boolean isMatch(String s, String p) {
        if(p == null)   return s == null;

        int mark = 0;
        int i = 0;
        int j = 0;
        int star = -1;

        while(i < s.length()){
            while(j < p.length() && p.charAt(j) == '*'){
                star = j;
                j++;
                mark = i;
            }
            if(j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')){
                i++;
                j++;
            } else {
                if(star < 0)
                    return false;
                else {
                    j = star + 1;
                    i = ++mark;
                }
            }
        }
        // p = "", q = "**"; p = "a", q = "a*" ....
        while(j < p.length() && p.charAt(j) == '*'){
            j++;
        }

        return j == p.length();
    }

/*
    //time limit exceeded
    public static boolean isMatch(String s, String p) {
        if(p == null)   return s == null;
        if(p.length() == 0) return s.length() == 0;

        if(p.charAt(0) != '*') {
            if(s.length() < 1 || (p.charAt(0) != '?' && p.charAt(0) != s.charAt(0)) ){
                return false;
            } else {
                return isMatch(s.substring(1), p.substring(1));
            }
        }

        else {
            for(int i = -1; i < s.length(); i++){
                if( isMatch(s.substring(i+1), p.substring(1)) )
                    return true;
            }
        }
        return false;
    }

    */
}
