package com.datastructure.string.leetcode;

import java.util.Set;

/**
 * Created by danzhu on 6/30/14.
 *
 * Dynamic Programming
 */
public class WordBreak {
    public boolean wordBreak(String str, Set<String> dict){
        boolean[] t = new boolean[str.length()+1];
        t[0] = true;

        for(int i = 0; i < str.length(); i++){
            if(!t[i])
                continue;

            for(String s : dict){
                int len = s.length();
                int end = i + len;
                if(end > str.length())
                    continue;
                if(str.substring(i,end).equals(s))
                    t[end]=true;
            }
        }
        return t[str.length()];
    }
}
