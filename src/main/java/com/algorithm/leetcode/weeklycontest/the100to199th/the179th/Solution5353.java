package com.algorithm.leetcode.weeklycontest.the100to199th.the179th;

import com.algorithm.util.ArrayUtils;
import org.junit.Test;

public class Solution5353 {

    @Test
    public void test1(){
        System.out.println(numTimesAllBlue(ArrayUtils.stringToIntArray("[2,1,3,5,4]")));
        System.out.println(numTimesAllBlue(ArrayUtils.stringToIntArray("[3,2,4,1,5]")));
        System.out.println(numTimesAllBlue(ArrayUtils.stringToIntArray("[4,1,2,3]")));
        System.out.println(numTimesAllBlue(ArrayUtils.stringToIntArray("[2,1,4,3,6,5]")));
        System.out.println(numTimesAllBlue(ArrayUtils.stringToIntArray("[1,2,3,4,5,6]")));
    }

    public int numTimesAllBlue(int[] light) {
        int nums = light.length;
        int[] bools = new int[light.length];
        int lastIndex=0;
        for (int value : light) {
            bools[value - 1] = 1;
            if (lastIndex < value - 1) lastIndex = value - 1;
            for (int j = lastIndex; j > -1; j--) {
                if (bools[j] == 0) {
                    nums--;
                    break;
                }
            }
        }
        return nums;
    }
}
