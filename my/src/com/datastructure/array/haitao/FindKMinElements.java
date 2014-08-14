package com.datastructure.array.haitao;

import java.util.HashSet;

/**
 * Created by danzhu on 8/6/14.
 * 输入n个整数，输出其中最小的k个。

 例如输入1，2，3，4，5，6，7和8这8个数字，则最小的4个数字为1，2，3和4。
 */
public class FindKMinElements {
    public static HashSet<Integer> findKMinElements(int[] array, int k){
        HashSet<Integer> set = new HashSet<Integer>();
        if(array == null || array.length == 0)
            return set;
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(set.size() < k){
                set.add(array[i]);
                max = Math.max(max, array[i]);
            } else {
                if(array[i] < max){
                    set.remove(max);

                }
            }
        }
        return set;

    }
}
