package com.algorithm.leetcode.weeklycontest.the100to199th.the179th;

import org.junit.Test;

public class SolutionThe179Sub1 {
    @Test
    public void test1(){
        SolutionThe179Sub1 sl = new SolutionThe179Sub1();
        System.out.println(sl.generateTheString(2));
        System.out.println(sl.generateTheString(4));
        System.out.println(sl.generateTheString(7));
    }

    private String generateTheString(int n) {
        if (n == 1) return "a";
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 0){
            for (int i = 0; i < n; i++) {
                if (i % 2 == 1 && (n-i) % 2 == 1){
                    for (int j = 0; j < i; j++) {
                        stringBuilder.append("a");
                    }
                    for (int j = 0; j < n - 1; j++) {
                        stringBuilder.append("b");
                    }
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                stringBuilder.append("a");
            }
        }
        return stringBuilder.toString();
    }

}
