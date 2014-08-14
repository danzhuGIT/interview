package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 7/10/14.
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.
 *
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(count == 0)
                    continue;
                return count;
            }
            count++;
        }
        return count;
    }

}
