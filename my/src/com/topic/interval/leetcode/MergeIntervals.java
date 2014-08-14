package com.topic.interval.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by danzhu on 7/18/14.
 *
 * Given a collection of intervals, merge all overlapping intervals.

 For example,
 Given [1,3],[2,6],[8,10],[15,18],
 return [1,6],[8,10],[15,18].
 *
 */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        Comparator<Interval> comp = new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start == o2.start)
                    return o1.end - o2.end;
                return o1.start - o2.start;
            }
        };
        if(intervals == null || intervals.size()==1)
            return intervals;

        Collections.sort(intervals, comp);
        int prev = 0;
        int curr = 1;
        while(curr < intervals.size()){
            if(intervals.get(prev).end >= intervals.get(curr).start){
                Interval merged = new Interval(intervals.get(prev).start,Math.max(intervals.get(prev).end, intervals.get(curr).end));
                intervals.remove(curr);
                intervals.remove(prev);
                intervals.add(prev, merged);
            } else {
                prev++;
                curr++;
            }
        }
        return intervals;

    }
}
