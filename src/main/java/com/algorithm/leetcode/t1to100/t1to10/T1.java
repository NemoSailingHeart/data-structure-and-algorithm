package com.algorithm.leetcode.t1to100.t1to10;

import com.algorithm.util.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class T1 {
    @Test
    public void main1() {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i < nums.length ; i++ ){
            int j = target - nums[i];
            if (map.containsKey(j)){
                return new int[]{map.get(j),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
