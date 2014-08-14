package com.topic.sort.cracking;

/**
 * Created by danzhu on 7/30/14.
 */
public class HeightWeight implements Comparable {
    int height;
    int weight;

    public HeightWeight(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o ) {
        HeightWeight another = (HeightWeight) o;
        if(height < another.height){
            return -1;
        } else if(height == another.height){
            if(weight < another.weight)
                return -1;
            else if(weight > another.weight)
                return 1;
            else
                return 0;
        } else {
            return 1;
        }
    }

    public boolean isBelow(HeightWeight another){
        return height>=another.height && weight >= another.weight;
    }
}
