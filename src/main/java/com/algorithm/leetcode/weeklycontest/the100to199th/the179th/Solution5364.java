package com.algorithm.leetcode.weeklycontest.the100to199th.the179th;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution5364 {

    @Test
    public void test1(){

        int[] targetArray = createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});
        System.out.println(Arrays.toString(targetArray));
        int[] targetArray1 = createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0});
        System.out.println(Arrays.toString(targetArray1));
        int[] targetArray2 = createTargetArray(new int[]{1}, new int[]{0});
        System.out.println(Arrays.toString(targetArray2));
    }


    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        int j =0;
        for (Integer integer : list) {
            target[j++] = integer;
        }
        return target;
    }
}
