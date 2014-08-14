package com.datastructure.string.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by danzhu on 7/2/14.
 */
public class WordLadder {
    public static void main(String args){
        String start = "a";
        String end = "b";
        HashSet<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.print(ladderLength(start,end,set));
    }
    public static int ladderLength(String start, String end, Set<String> dict) {

        if(dict.size()==0) return 0;

        LinkedList<String> words = new LinkedList<String>();
        LinkedList<Integer> count = new LinkedList<Integer>();

        words.add(start);
        count.add(1);

        while(!words.isEmpty()){
            String word = words.pop();
            Integer distance = count.pop();

            if(word.equals(end)) return distance;

            for(int i = 0; i < word.length(); i++){
                char[] wordArr = word.toCharArray();
                for(char c = 'a'; c <= 'z'; c++){
                    wordArr[i] = c;
                    String newWord = new String(wordArr);
                    if(dict.contains(newWord)){
                        words.add(newWord);
                        count.add(distance+1);
                        dict.remove(newWord);
                    }
                }
            }
        }

        return 0;

    }

    /*
    public int ladderLength(String start, String end, Set<String> dict) {
        if(dict.size()==0) return 0;

        LinkedList<String> curDistance = new LinkedList<String>();
        LinkedList<String> nextDistance = new LinkedList<String>();

        curDistance.add(start);
        int distance=0;
        while(!curDistance.isEmpty()){
            distance++;
            while(!curDistance.isEmpty()){
                String word = curDistance.pop();
                if(word.equals(end)) return distance;

                for(int i = 0; i < word.length(); i++){
                    char[] wordArr = word.toCharArray();
                    for(char c = 'a'; c <= 'z'; c++){
                        wordArr[i] = c;
                        String newWord = new String(wordArr);
                        if(dict.contains(newWord)){
                            nextDistance.add(newWord);
                            dict.remove(newWord);
                        }
                    }
                }
            }
            LinkedList<String> tmp = curDistance;
            curDistance = nextDistance;
            nextDistance = tmp;
        }

        return 0;
    }
     */
}
