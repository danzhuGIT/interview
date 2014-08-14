package com.topic.palindrome.leetcode;

/**
 * Created by danzhu on 7/4/14.
 *
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 *
 */
public class IsPalindromeSentence {
    public static void main(String[] args){
        //System.out.print(isPalindrome("la2"));
    }

    //don't forget to consider number
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        int i =0;
        int j = s.length() - 1;
        while(i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if( !isAlpha(c1) && !isNum(c1) ){
                i++;
                continue;
            }
            if(!isAlpha(c2) && !isNum(c2)){
                j--;
                continue;
            }
            if(!isSame(c1, c2))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public  boolean isAlpha(char a){
        if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')){
            return true;
        }else{
            return false;
        }
    }

    public  boolean isNum(char a){
        if(a >= '0' && a <= '9'){
            return true;
        }else{
            return false;
        }
    }

    public  boolean isSame(char a, char b){
        if(isNum(a) && isNum(b)){
            return a == b;
        }else if(Character.toLowerCase(a) == Character.toLowerCase(b)){
            return true;
        }else{
            return false;
        }
    }
}
