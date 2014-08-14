package com.topic.math.leetcode;

import java.util.HashMap;

/**
 * Created by danzhu on 7/10/14.
 * Given an integer, convert it to a roman numeral.

 Input is guaranteed to be within the range from 1 to 3999.
 *
 */

//copy
public class NumToRoman {

    public String intToRoman(int n) {
        String result="";
        int[] base={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        HashMap<Integer,String> baseMap=new HashMap<Integer,String>();
        baseMap.put(1000, "M");
        baseMap.put(900, "CM");
        baseMap.put(500, "D");
        baseMap.put(400, "CD");
        baseMap.put(100, "C");
        baseMap.put(90, "XC");
        baseMap.put(50, "L");
        baseMap.put(40, "XL");
        baseMap.put(10, "X");
        baseMap.put(9, "IX");
        baseMap.put(5, "V");
        baseMap.put(4, "IV");
        baseMap.put(1, "I");

        for(int i:base){
            while(n>=i){
                result+=baseMap.get(i);
                n-=i;
            }
        }
        return result;
    }

}
