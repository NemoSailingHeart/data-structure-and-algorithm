package com.algorithm.leetcode;

import com.algorithm.util.ArrayUtils;
import org.junit.Test;
import java.util.Arrays;

public class FindMidTwoNums {
    @Test
    public void findByDuiPeng(){
        int[] arr1 = ArrayUtils.getSortedRandomIntArray(5);
        int[] arr2 = ArrayUtils.getSortedRandomIntArray(5);
        System.out.println("arr1 => " + Arrays.toString(arr1));
        System.out.println("arr2 => " + Arrays.toString(arr2));

        int[] arrA = {1,3};
        int[] arrB = {2};
        System.out.println("mid : " + find(arrA, arrB));

    }

    private double find(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        int index1;
        int index2 = -1;
        int len = arr1.length + arr2.length;
        if ((len) % 2 == 0){
            index1 = len / 2 - 1;
            index2 = index1 + 1;
        }else{
            index1 = len/2;
        }
        int count = 0;
        int mid1 = 0;
        int mid2;
        while (i <= arr1.length){
            while (j < arr2.length && (arr1.length == i || arr1[i] > arr2[j])){
                if (count == index1){
                    mid1 = arr2[j];
                    if (index2 == -1){
                        return mid1;
                    }
                }
                if (count == index2){
                    mid2 = arr2[j];
                    return (mid1 + mid2) / 2.0;
                }
                count++;
                j++;
            }
            if (count == index1 && i < arr1.length){
                mid1 = arr1[i];
                if (index2 == -1){
                    return mid1;
                }
            }
            if (count == index2 && i < arr1.length){
                mid2 = arr1[i];
                return (mid1 + mid2) / 2.0;
            }
            count++;
            i++;
        }
        return 0;
    }
}