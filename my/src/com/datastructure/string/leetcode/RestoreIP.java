package com.datastructure.string.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danzhu on 7/23/14.
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.

 For example:
 Given "25525511135",

 return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */
public class RestoreIP {
    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> result = new ArrayList<String>();
        restore(s, 0, 0, "", result);
        return result;
    }

    public void restore(String s, int start, int part, String ip, ArrayList<String> result){
        int length = s.length();
        if((length-start) > 3*(4-part) || (length-start) < (4-part))
            return;

        if(start == length && part == 4){
            result.add(ip.substring(0, ip.length()-1));
            return;
        }

        int num = 0;
        for(int i = start; i < length && i < start+3; i++){
            num = num*10 + (s.charAt(i)-'0');
            if(num <= 255){
                String newIP = ip + num + ".";
                restore(s, i+1, part+1, newIP, result);
            }
            if(num == 0) break;
        }

    }
}
