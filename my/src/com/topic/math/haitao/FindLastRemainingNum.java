package com.topic.math.haitao;

/**
 * Created by danzhu on 9/12/14.
 * 题目：n个数字（0,1,…,n-1）形成一个圆圈，从数字0开始，每次从这个圆圈中删除第m个数字（第一个为当前数字本身，
 * 第二个为当前数字的下一个数字）。当一个数字删除后，从被删除数字的下一个继续删除第m个数字。
 * 求出在这个圆圈中剩下的最后一个数字。
 *
 * http://zhedahht.blog.163.com/blog/static/2541117420072250322938/
 *
 */
public class FindLastRemainingNum {
    public static void main(String[] args){
        System.out.print(findLastRemainingNumII(4,3));
    }

    //iteration
    public static int findLastRemainingNum(int n, int m){
        if(n<=0 || m < 1)
            return -1;

        int lastNum = 0;
        for(int i = 2; i<=n; i++){
            lastNum = (lastNum+m)%i;
        }
        return lastNum;
    }

    //recursion
    public static int findLastRemainingNumII(int n, int m){
        if(n<=0 || m < 1)
            return -1;

        if(n==1)
            return 0;

        return (findLastRemainingNumII(n-1, m)+m)%n;
    }
}
