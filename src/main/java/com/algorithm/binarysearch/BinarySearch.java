package com.algorithm.binarysearch;

import com.algorithm.sorts.OnnSort;
import com.algorithm.util.ArrayUtils;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    private static BinarySearch bs = new BinarySearch();
    public static void main(String[] args) {
        Random random = new Random();
        int len = 10;
        int[] arr = ArrayUtils.getRandomIntArray(10);
        int index = random.nextInt(len - 1);
        OnnSort onnSort = new OnnSort();
        System.out.println("数组为 => " + Arrays.toString(onnSort.insertSort(arr)));
        System.out.println("查找数 => " + arr[index] );
        System.out.println("索引为 => " + bs.binarySearch(arr,arr[index]));
        System.out.println("查找数 => " + "-3");
        System.out.println("索引为 => " + bs.binarySearch(arr,-3));

        System.out.println("递归二分查找数 => " + arr[index] );
        System.out.println("递归二分索引为 => " + bs.binarySearchRecursion(arr, arr[index]));
        System.out.println("递归二分查找数 => " + "-3");
        System.out.println("递归二分索引为 => " + bs.binarySearchRecursion(arr, -3));

    }

    /**
     * 递归实现二分查找
     * @param arr 需要查找的数组
     * @param i 需要查找的元素
     * @return 返回 index
     */
    private int binarySearchRecursion(int[] arr, int i) {
        return recursion(arr, i, 0, arr.length-1);
    }

    /**
     * 递归函数
     * @param arr
     * @param i
     */
    private int recursion(int[] arr, int i, int start, int end) {
        int mid = (start + end) / 2;
        if (i == arr[mid]) return mid;
        if (start >= end) return -1;
        return (i < arr[mid]) ? recursion(arr,i,start, mid - 1 ) : recursion(arr,i,mid + 1,end);
    }

    /**
     * 二分查找
     * @param arr 数组
     * @param i   数组中的元素
     * @return 返回下标，找不到时返回 -1
     */
    private int binarySearch(int[] arr, int i) {
        int start = 0;
        int end = arr.length;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (i == arr[mid]){
                return mid;
            } else if (i < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
