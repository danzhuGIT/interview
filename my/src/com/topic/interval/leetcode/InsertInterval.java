package com.topic.interval.leetcode;

import com.topic.interval.Interval;

import java.util.List;

/**
 * Created by danzhu on 7/18/14.
 *
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

 You may assume that the intervals were initially sorted according to their start times.

 Example 1:
 Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

 Example 2:
 Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

 This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 *
 */
public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals.size() == 0){
            intervals.add(newInterval);
            return intervals;
        }

        int start = newInterval.start;
        int end = newInterval.end;
        int i = 0;

        while(i < intervals.size() && start > intervals.get(i).end){
            i++;
        }


        while(i < intervals.size() && start <= intervals.get(i).end && end >= intervals.get(i).start){
            start = Math.min(start, intervals.get(i).start);
            end = Math.max(end, intervals.get(i).end);
            intervals.remove(i);
        }
        intervals.add(i, new Interval(start, end));
        return intervals;
    }
}
