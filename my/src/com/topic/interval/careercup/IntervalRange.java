package com.topic.interval.careercup;

import com.topic.interval.Interval;
import com.topic.interval.leetcode.InsertInterval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by danzhu on 8/25/14.
 * Given a list of tuples representing intervals, return the range these intervals
 covered.
 e.g:
 [(1,3), (2,5),(8,9)] should return 5

 Think of it as intervals on the number line, and the problem is asking for the range that all these intervals cover.
 to give you an specific example:
 [(1,3)] will cover a range of 2
 [(1,3), (2, 5)] will cover 4
 [(1,3), (4, 5), (7,10)] will cover 6.
 */
public class IntervalRange {
    public static void main(String[] args){
        Interval[] intervals = {new Interval(2,5), new Interval(1,3), new Interval(8,9)};
        Interval[] intervals2 = {new Interval(4,5), new Interval(1,3), new Interval(7,10)};
        System.out.println(intervalRange(intervals));
        System.out.println(intervalRange(intervals2));
    }

    //trace the previous merged interval
    public static int intervalRange(Interval[] intervals){
        if(intervals == null || intervals.length == 0)
            return 0;

        Comparator<Interval> comp = new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2){
                if(i1.start == i2.start)
                    return i1.end - i2.end;
                else
                    return i1.start - i2.start;
            }

        };

        Arrays.sort(intervals, comp);
        int start = intervals[0].start;
        int end = intervals[0].end;
        int range = end - start;

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i].start <= end){
                range += intervals[i].end - end;
                end = intervals[i].end;
            }else{
                range += intervals[i].end - intervals[i].start;
                start = intervals[i].start;
                end = intervals[i].end;
            }
        }
        return range;
    }
}
