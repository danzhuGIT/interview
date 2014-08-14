package com.datastructure.array.leetcode;

import java.util.HashMap;

/**
 * Created by danzhu on 6/30/14.
 */
public class MaxPointsOnALine {
    public static void main(String[] args){
        Point[] points = {new Point(84,250),new Point(0,0),new Point(1,0),new Point(0,-70),new Point(0,-70),new Point(1,-1),new Point(21,10),new Point(42,90),new Point(-42,-230)};
        System.out.print(maxPoints(points));
    }

    public static int maxPoints(Point[] points){
        if(points.length <= 2){
            return points.length;
        }

        int max = 0;
        for(int i = 0; i < points.length; i++){
            int dup = 1;
            HashMap<Double, Integer> map = new HashMap<Double, Integer>();
            for(int j = 0; j < points.length; j++){
                if(j != i){
                    if(points[j].y==points[i].y && points[j].x==points[i].x){
                        dup++;
                        continue;
                    }

                    double key = points[j].x == points[i].x ? Integer.MAX_VALUE : (double)(points[j].y - points[i].y)/(double)(points[j].x-points[i].x);


                    if(map.containsKey(key)){
                            map.put(key,map.get(key)+1);
                    } else {
                        map.put(key,1);
                    }
                }
            }
            max = dup > max ? dup:max;
            for(int k : map.values()){
                if(k+dup>max){
                    max = k+dup;
                }
            }
        }

        return max;
    }
}
