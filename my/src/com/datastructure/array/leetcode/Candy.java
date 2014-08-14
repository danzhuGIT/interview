package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 6/30/14.
 */
public class Candy {
    public int candy(int[] ratings) {
        if(ratings == null || ratings.length == 0)
            return 0;

        int[] count = new int[ratings.length];
        count[0] = 1;
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                count[i] = count[i-1] + 1;
            } else {
                count[i] = 1;
            }
        }

        int result = count[ratings.length - 1];
        for(int i = ratings.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                if(count[i+1]+1 > count[i])
                    count[i] = count[i+1]+1;
            }
            result += count[i];
        }
        return result;
    }
}
