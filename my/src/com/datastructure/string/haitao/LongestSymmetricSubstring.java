package com.datastructure.string.haitao;

/**
 * Created by danzhu on 8/14/14.
 * 题目：输入一个字符串，输出该字符串中对称的子字符串的最大长度。比如输入字符串“google”，
 * 由于该字符串里最长的对称子字符串是“goog”，因此输出4。
 */
public class LongestSymmetricSubstring {
    public static void main(String[] args){
        System.out.print(longestSymmetricSubstring("ahhbag"));
    }

    //check substring with odd and even length
    //O(n^2)
    public static int longestSymmetricSubstring(String str){
        if(str == null || str.equals(""))
            return 0;
        int max = 1;
        for(int index = 0; index < str.length(); index++){
            // Substrings with odd length
            int first = index-1;
            int last = index+1;
            while(first >= 0 && last <= str.length()-1 && str.charAt(first) == str.charAt(last)){
                first--;
                last++;
            }
            max = Math.max(max, last-first-1);

            // Substrings with even length
            first = index;
            last = index+1;
            while(first >= 0 && last <= str.length()-1 && str.charAt(first) == str.charAt(last)){
                first--;
                last++;
            }
            max = Math.max(max, last-first-1);
        }
        return max;
    }
}
