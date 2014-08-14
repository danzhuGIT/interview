package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 6/30/14.
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
            int end = sb.length() - 1;
            while (end >= 0) {
                if (sb.charAt(end) != ' ') {
                    break;
                }
                end--;
            }
            return sb.substring(0,end+1);
        }

        return "";
    }
}
