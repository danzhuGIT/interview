package com.datastructure.array.haitao;

/**
 * Created by danzhu on 9/11/14.
 * 题目：数组中有一个数字出现的次数超过了数组长度的一半，找出这个数字。
 * 数组中有个数字出现的次数超过了数组长度的一半。也就是说，
 * 有个数字出现的次数比其他所有数字出现次数的和还要多。
 * 因此我们可以考虑在遍历数组的时候保存两个值：一个是数组中的一个数字，
 * 一个是次数。当我们遍历到下一个数字的时候，如果下一个数字和我们之前保存的数字相同，
 * 则次数加1。如果下一个数字和我们之前保存的数字不同，则次数减1。
 * 如果次数为零，我们需要保存下一个数字，并把次数设为1。
 * 由于我们要找的数字出现的次数比其他所有数字出现的次数之和还要多，
 * 那么要找的数字肯定是最后一次把次数设为1时对应的数字。
 */


public class MoreThanHalfNum {
    public static void main(String[] args){
        int[] nums = {1,4,2,5,4,4,4,6,4,8,4};
        System.out.print(moreThanHalfNum(nums));
    }
    public static int moreThanHalfNum(int[] nums){
        if(nums == null || nums.length < 1)
            return Integer.MIN_VALUE;

        int potential = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(count == 0){
                potential = nums[i];
                count++;
            } else {
                if (nums[i] == potential) {
                    count++;
                }else{
                    count--;
                }
            }
        }
        return potential;

    }
}
