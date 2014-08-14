package com.topic.math.leetcode;

import java.util.HashMap;

/**
 * Created by danzhu on 7/10/14.
 *
 * Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
 *
 */
//copy
public class RomanToNum {
    public int romanToInt(String roman) {
        HashMap<String, Integer> baseMap=new HashMap<String, Integer>();
        baseMap.put("M",1000);
        baseMap.put("CM",900);
        baseMap.put("D",500);
        baseMap.put("CD",400);
        baseMap.put("C",100);
        baseMap.put("XC",90);
        baseMap.put("L",50);
        baseMap.put("XL",40);
        baseMap.put("X",10);
        baseMap.put("IX",9);
        baseMap.put("V",5);
        baseMap.put("IV",4);
        baseMap.put("I",1);

        int i=0;
        int num=0;
        while(i<roman.length()){
            if(i+1<roman.length()){
                String tmp=roman.substring(i,i+2);
                if(baseMap.containsKey(tmp)){
                    num+=baseMap.get(tmp);
                    i+=2;
                    continue;
                }
            }

            String tmp=roman.substring(i,i+1);
            num+=baseMap.get(tmp);
            i+=1;

        }
        return num;
    }

}
