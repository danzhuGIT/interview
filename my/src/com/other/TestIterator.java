package com.other;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by danzhu on 10/29/14.
 */
public class TestIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));

        for (String s : list) {
            if (s.equals("a"))
                list.remove(s);
        }
    }
}
