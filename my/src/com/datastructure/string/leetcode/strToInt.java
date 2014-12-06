package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 10/25/14.
 *
 * Implement atoi to convert a string to an integer.

 Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

 Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

 spoilers alert... click to show requirements for atoi.

 Requirements for atoi:
 The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

 The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

 If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

 If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 *
 */
public class strToInt {
    public int atoi(String str) {
        if(str == null || str.length()==0)
            return 0;

        int i = 0;
        int j = str.length()-1;
        while(str.charAt(i)==' ')
            i++;

        while(str.charAt(j)==' ')
            j--;

        if(i>j)
            return 0;

        boolean isNeg = false;
        if(str.charAt(i)=='+')
            i++;
        else if(str.charAt(i)=='-'){
            i++;
            isNeg = true;
        }

        while(str.charAt(i)=='0')
            i++;

        //check if string is composed of all nums
        for(int k = i; k <= j; k++){
            if(str.charAt(k) >= '0' && str.charAt(k) <= '9')
                continue;
            else
                j=k-1;
        }

        String maxIntStr = Integer.toString(Integer.MAX_VALUE);
        String validPart = str.substring(i,j+1);
        if(validPart.length() > maxIntStr.length() || (validPart.length() == maxIntStr.length() && validPart.compareTo(maxIntStr)>0)){
            return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        int result = 0;
        for(int k = i; k <= j; k++){
            result = result*10 + str.charAt(k)-'0';
        }
        if(isNeg)
            result = -result;
        return result;

    }
}
