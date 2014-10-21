package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 6/30/14.
 *Given an input string, reverse the string word by word.

 For example,
 Given s = "the sky is blue",
 return "blue is sky the".

 click to show clarification.

 Clarification:
 What constitutes a word?
 A sequence of non-space characters constitutes a word.
 Could the input string contain leading or trailing spaces?
 Yes. However, your reversed string should not contain leading or trailing spaces.
 How about multiple spaces between two words?
 Reduce them to a single space in the reversed string.
 *
 */
public class ReverseWords {

    public static void main(String[] args){
        String str = " ";
        System.out.print(reverseWords(str));
    }

    public static String reverseWords(String str){
        if(str == null || str.length() == 0){
            return "";
        }

        String[] arr = str.split("[ ]+");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            if(!arr[i].equals("")){
                sb.append(arr[i]).append(" ");
            }
        }

        if(sb.length() != 0) {
            /*
            int end = sb.length() - 1;
            while (end >= 0) {
                if (sb.charAt(end) != ' ') {
                    break;
                }
                end--;
            }
            */
            return sb.substring(0,sb.length()-1);
        }

        return "";
    }
}
