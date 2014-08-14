package com.topic.sort.cracking;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by danzhu on 7/29/14.
 */
public class SortAnagrams {
    static class AnagramComparator implements Comparator<String> {
        private String sortChars(String str){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);

        }
        @Override
        public int compare(String s1, String s2) {
            return sortChars(s1).compareTo(sortChars(s2));
        }
    }

    public static void main(String[] args){
        String[] strings = {"fdsdf","sa","as"};
        Arrays.sort(strings, new AnagramComparator());
        //System.out.print(strings);
    }
}
