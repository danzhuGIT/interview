package com.datastructure.string.haitao;

/**
 * Created by danzhu on 8/17/14.
 * 题目：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。句子中单词以空格符隔开。为简单起见，标点符号和普通字母一样处理。

 例如输入“I am a student.”，则输出“student. a am I”。
 */

public class ReverseWords {
    public static void main(String[] args){
        String words="Do or do not, there is no try. ";
        System.out.print(reverseWords(words));
    }

    public static String reverseWords(String str){
        char[] strChars = str.toCharArray();
        reverse(strChars, 0, str.length()-1);
        int start = 0;
        int end = 0;
        while(end < strChars.length){
            if(strChars[end] != ' '){
                start = end;
                while(end < strChars.length && strChars[end] != ' ')
                    end++;
                reverse(strChars, start, end-1);
            } else {
                end++;
            }
        }
        return new String(strChars);
    }

    private static void reverse(char[] chars, int start, int end){
        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
