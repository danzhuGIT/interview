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

    //greedy algorithm
    public String intToRoman(int n) {
        String result="";
        int[] base={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i=0; i < base.length; i++){
            while(n>=base[i]){
                result+=roman[i];
                n-=base[i];
            }
        }
        return result;
    }
/*

The HashMap API does not define the order of iteration.

However, if you look at the implementation of HashMap, you can deduce that there is a complex transient relationship between the iteration order,
the keys' hash values, the order in which the keys were inserted and the size of the hashtable. This relationship gets scrambled if the hashtable resizes itself.

In your case, the hash values of the keys are the key values themselves, and you inserted the entries in key order.
So it just happens that the iteration order matches the insertion order. But if you keep inserting more keys, you will find that order wraps around and then gets progressively more scrambled.

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
*/
}
