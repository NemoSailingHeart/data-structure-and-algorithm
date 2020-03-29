package com.algorithm.leetcode.weeklycontest.the100to199th.the179th;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution5368 {
    @Test
    public void test1(){
        int[] ints1 = {2, 2, 3, 4};
        int[] ints2 = {1,2,2,3,3,3};
        int[] ints3 = {2,2,2,3,3};
        int[] ints4 = {5};
        int[] ints5 = {7,7,7,7,7,7,7};
        System.out.println(findLucky(ints1));
        System.out.println(findLucky(ints2));
        System.out.println(findLucky(ints3));
        System.out.println(findLucky(ints4));
        System.out.println(findLucky(ints5));
    }


    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            Integer orDefault = map.getOrDefault(i, 0);
            map.put(i, orDefault + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue()){
                max = entry.getKey();
            }
        }
        return  max == 0 ? -1 : max;
    }


    @Test
    public void test2(){
        int[] ints1 = {2,5,3,4,1};
        int[] ints2 = {2,1,3};
        int[] ints3 = {1,2,3,4};
        System.out.println(numTeams(ints1));
        System.out.println(numTeams(ints2));
        System.out.println(numTeams(ints3));
    }
    /**
     * 统计作战单位数
     * @param rating
     * @return
     */
    public int numTeams(int[] rating) {
        int counter = 0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i; j < rating.length; j++) {
                for (int k = j; k < rating.length; k++) {
                    if ((rating[i] < rating[j]) && (rating[j] < rating[k])
                            || (rating[i] > rating[j]) && (rating[j] > rating[k])){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    /**
     * 5370. 设计地铁系统 显示英文描述
     * 用户通过次数1086
     * 用户尝试次数1362
     * 通过次数1091
     * 提交次数2118
     * 题目难度Medium
     * 请你实现一个类 UndergroundSystem ，它支持以下 3 种方法：
     *
     * 1. checkIn(int id, string stationName, int t)
     *
     * 编号为 id 的乘客在 t 时刻进入地铁站 stationName 。
     * 一个乘客在同一时间只能在一个地铁站进入或者离开。
     * 2. checkOut(int id, string stationName, int t)
     *
     * 编号为 id 的乘客在 t 时刻离开地铁站 stationName 。
     * 3. getAverageTime(string startStation, string endStation)
     *
     * 返回从地铁站 startStation 到地铁站 endStation 的平均花费时间。
     * 平均时间计算的行程包括当前为止所有从 startStation 直接到达 endStation 的行程。
     * 调用 getAverageTime 时，询问的路线至少包含一趟行程。
     * 你可以假设所有对 checkIn 和 checkOut 的调用都是符合逻辑的。也就是说，如果一个顾客在 t1 时刻到达某个地铁站，
     *       那么他离开的时间 t2 一定满足 t2 > t1 。所有的事件都按时间顺序给出。
     *
     * Your UndergroundSystem object will be instantiated and called as such:
     * UndergroundSystem obj = new UndergroundSystem();
     * obj.checkIn(id,stationName,t);
     * obj.checkOut(id,stationName,t);
     * double param_3 = obj.getAverageTime(startStation,endStation);
     */

    /*public void test3(){
        UndergroundSystem obj = new UndergroundSystem();
        obj.checkIn(id,stationName,t);
        obj.checkOut(id,stationName,t);
        double param_3 = obj.getAverageTime(startStation,endStation);
    }*/
    class UndergroundSystem {

        public UndergroundSystem() {

        }

        public void checkIn(int id, String stationName, int t) {

        }

        public void checkOut(int id, String stationName, int t) {

        }

        public double getAverageTime(String startStation, String endStation) {
            return 0;
        }
    }


}
