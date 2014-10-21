package com.datastructure.array.haitao;

/**
 * Created by danzhu on 9/15/14.
 * 题目：输入n个整数，输出其中最小的k个。

 例如输入1，2，3，4，5，6，7和8这8个数字，则最小的4个数字为1，2，3和4。
 */

//Thoughts
//max heap: K size max heap
//time: O（K+（n-K)*logK）=O（n*logK）
//space: O(K)
//min heap: n size min heap,
//time: build heap O(n), heapify: KlogN, total is N+KlogN
//space: O(N)

public class FindKLeastNums {
}
