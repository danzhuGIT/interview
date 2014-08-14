package com.topic.sort.cracking;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by danzhu on 7/30/14.
 * A circus is designing a tower routine consisting of people standing atop one another’s shoulders. For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower.
 EXAMPLE:
 Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
 Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
 */
public class CircusTower {

    public static void main(String[] args){
        ArrayList<HeightWeight> items = new ArrayList<HeightWeight>();
        items.add(new HeightWeight(60, 95));
        items.add(new HeightWeight(55, 120));
        items.add(new HeightWeight(60, 120));
        items.add(new HeightWeight(50, 90));
        items.add(new HeightWeight(70, 100));
        items.add(new HeightWeight(80, 110));

        int result = findMaxSeq(items);
        System.out.print(result);
    }

    public static int findMaxSeq(ArrayList<HeightWeight> items){
        Collections.sort(items);

        int n = items.size();
        int[] f = new int[n];
        f[0] = 1;

        for(int i = 1; i < items.size(); i++){
            f[i] = 1;
            for(int j = 0; j < i; j++){
                if(items.get(i).isBelow(items.get(j))) {
                    if(f[j]+1 > f[i]){
                        f[i] = f[j]+1;
                    }
                }
            }
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, f[i]);
        }

        return max;
    }

}
