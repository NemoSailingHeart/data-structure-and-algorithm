package com.algorithm.common.algs;

import com.algorithm.util.ArrayUtils;
import com.algorithm.util.LeetCodeListNodeUtil;
import com.algorithm.util.ListNode;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

/**
 * 对碰算法，合并两个有序的数组或者或者两个有序的链表，或者两个有序的文件
 */
public class CollisionAlgorithm {
    @Test
    public void testAll(){
        CollisionAlgorithm collisionAlgorithm = new CollisionAlgorithm();
        collisionAlgorithm.testMergeArray();
    }

    @Test
    public void testMergeList(){
        ListNode listNode = LeetCodeListNodeUtil.getListNode(new int[]{2, 5, 6, 7, 8});
        LeetCodeListNodeUtil.printList(listNode);
    }


    @Test
    public void testMergeArray(){
        int[] arr1 = ArrayUtils.getSortedRandomIntArray(5);
        int[] arr2 = ArrayUtils.getSortedRandomIntArray(5);
        System.out.println("合并前数组1："+Arrays.toString(arr1));
        System.out.println("合并前数组2："+Arrays.toString(arr2));
        int[] ints = mergeArray(arr1, arr2);
        System.out.println("合并后数组："+Arrays.toString(ints));
        //暴力合并排序后的结果，跟对碰算法的对比
        int[] ints1 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,ints1,0,arr1.length);
        System.arraycopy(arr2,0,ints1,arr1.length,arr2.length);
        Arrays.sort(ints1);
        System.out.println("合并后数组："+Arrays.toString(ints1));
        // 测试结果
        Assert.assertArrayEquals(ints1,ints);
    }

    /**
     * 使用对碰算法合并两个有序的数组
     * @param arr1 有序的数组1
     * @param arr2 有序的数组2
     */
    private int[] mergeArray(int[] arr1, int[] arr2) {
        if (arr1.length == 0) return arr2;
        if (arr2.length == 0) return arr1;
        int[] ints = new int[arr1.length + arr2.length];
        int i = 0; int j = 0; int index = 0;
        while (i < arr1.length){
            while (j < arr2.length && arr1[i] > arr2[j]){
                ints[index++] = arr2[j++];
            }
            ints[index++] = arr1[i++];
        }
        // 有可能arr2中存在较大的数据，在arr2没有遍历完的时候，外循环就执行完了，所以需要将arr2的剩余数据写入
        while (j < arr2.length){
            ints[index++] = arr2[j++];
        }
        return ints;
    }
}
