package com.topic.math.leetcode;

/**
 * Created by danzhu on 8/6/14.
 * Validate if a given string is numeric.

 Some examples:
 "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true
 ".6" => true
 "49." => true
 "78.e4" => true

 Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
 */
public class ValidNum {
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0)
            return false;

        int i = 0;
        while(i < s.length() && s.charAt(i) == ' ')
            i++;
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            i++;

        int j = s.length()-1;
        while(j >= 0 && s.charAt(j) == ' ')
            j--;

        if(i > j)
            return false;
        s = s.substring(i,j+1);

        int dot = -1;
        int ee = -1;
        for(i = 0; i < s.length(); i++){
            if(dot == -1 && s.charAt(i) == '.'){
                dot = i;
            }else if(ee == -1 && s.charAt(i) == 'e'){
                ee = i;
                if(i+1 < s.length() && (s.charAt(i+1) == '+' || s.charAt(i+1) == '-'))
                    i++;
            }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                continue;
            }else{
                return false;
            }
        }

        String partOne, partTwo, partThree;
        if(dot == -1 && ee == -1){ //xxx
            if(s.length() < 1)
                return false;
        }else if(dot != -1 && ee == -1){ //xxx.yyy
            partOne = s.substring(0,dot);
            partTwo = s.substring(dot+1);
            if(partOne.length() < 1 && partTwo.length() < 1)
                return false;
        }else if(dot == -1 && ee != -1){ ///xxxeyyy
            partOne = s.substring(0,ee);
            if(ee+1 < s.length() && (s.charAt(ee+1) == '+' || s.charAt(ee+1) == '-'))
                partTwo = s.substring(ee+2);
            else
                partTwo = s.substring(ee+1);
            if(partOne.length() < 1 || partTwo.length() < 1)
                return false;
        }else{ //xxx.yyyezzz
            if(ee < dot)
                return false;
            partOne = s.substring(0,dot);
            partTwo = s.substring(dot+1, ee);

            if(partOne.length() < 1 && partTwo.length() < 1)
                return false;

            if(ee+1 < s.length() && (s.charAt(ee+1) == '+' || s.charAt(ee+1) == '-'))
                partThree = s.substring(ee+2);
            else
                partThree = s.substring(ee+1);

            if(partThree.length() < 1)
                return false;

        }

        return true;
    }
}
