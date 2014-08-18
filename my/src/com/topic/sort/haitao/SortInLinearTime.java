package com.topic.sort.haitao;

/**
 * Created by danzhu on 8/14/14.
 * 题目：某公司有几万名员工，请完成一个时间复杂度为O(n)的算法对该公司员工的年龄作排序，可使用O(1)的辅助空间。
 */
public class SortInLinearTime {
    public void SortAges(int[] ages){
        if(ages == null || ages.length <= 0)
            return;

        int oldestAge = 99;
        int[] timesOfAge = new int[oldestAge + 1];

        for(int i = 0; i <= oldestAge; ++ i)
            timesOfAge[i] = 0;

        for(int i = 0; i < ages.length; ++ i)
        {
            int age = ages[i];
            ++ timesOfAge[age];
        }

        int index = 0;
        for(int i = 0; i <= oldestAge; ++ i)
        {
            for(int j = 0; j < timesOfAge[i]; ++ j)
            {
                ages[index] = i;
                ++ index;
            }
        }
    }
}
