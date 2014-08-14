package com.topic.Nsum.leetcode;

import java.util.*;

/**
 * Created by danzhu on 8/5/14.
 */
public class FourSum {
    class Pair{
        int index1;
        int index2;

        Pair(int index1, int index2){
            this.index1 = index1;
            this.index2 = index2;
        }

        boolean isRepeat(Pair p){
            if(index1 == p.index1 || index1 == p.index2 || index2 == p.index1 || index2 == p.index2)
                return true;
            return false;
        }
    }

    public List<ArrayList<Integer>> fourSum(int[] num, int target) {
        List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(num == null || num.length < 4)
            return result;

        HashMap<Integer, ArrayList<Pair>> map = new HashMap<Integer, ArrayList<Pair>>();
        for(int i = 0; i < num.length-1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                Pair p = new Pair(i, j);
                if (map.containsKey(num[i] + num[j])) {
                    ArrayList<Pair> list = map.get(num[i] + num[j]);
                    list.add(p);
                } else {
                    ArrayList<Pair> list = new ArrayList<Pair>();
                    list.add(p);
                    map.put(num[i] + num[j], list);
                }
            }
        }

        for(Integer key : map.keySet()){
            ArrayList<Pair> listOne = map.get(key);
            ArrayList<Pair> listTwo = map.get(target - key);
            if(listTwo != null){
                for(Pair m : listOne){
                    for(Pair n : listTwo){
                        if(!m.isRepeat(n)){
                            ArrayList<Integer> sol = new ArrayList<Integer>();
                            sol.add(num[m.index1]);
                            sol.add(num[m.index2]);
                            sol.add(num[n.index1]);
                            sol.add(num[n.index2]);
                            Collections.sort(sol);
                            if(!result.contains(sol))
                                result.add(sol);
                        }
                    }
                }
            }
        }
        return result;
    }
}
