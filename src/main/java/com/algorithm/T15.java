package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T15 {

    public static void main(String[] args) {

    }

    /**
     * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     *
     * 满足要求的三元组集合为：
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     */

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //首先将数组进行排序
        Arrays.sort(nums);
        //依次遍历nums[i]后面的数
        for (int i=0; i<nums.length-1;i++){
            if (nums[i] > 0) break;//如果当前的数大于零，则之后找不到三数之和等于0的情况了，直接跳出既可。
            if (nums[i] == nums[i+1]) continue;//如果当前的数和下一个数相同，则跳出循环。因为下一轮的第一个值也是
            int left = i+1;
            int right = nums.length;

            while (left<right){
                int sum = nums[left] + nums[right]+nums[i];
                if (sum == 0 ){res.add(Arrays.asList(nums[i], nums[left], nums[right]));}
                else if (sum <0){left++;}//说明当前三个数的和太小了，要让left右移变大
                else {right--;}
            }
        }


        return res;

    }
}
