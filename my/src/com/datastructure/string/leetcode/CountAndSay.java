package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 7/11/14.
 *
 * The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.

 */
public class CountAndSay {
    public String countAndSay(int n){
        String result="1";
        for(int i=2;i<=n;i++){
            String newResult=new String();
            for(int j=0;j<result.length();){
                char cur=result.charAt(j);
                int count=0;
                while(j<result.length()&&result.charAt(j)==cur){
                    count++;
                    j++;
                }
                newResult+=""+count+cur;
            }
            result=newResult;
        }
        return result;
    }
}
