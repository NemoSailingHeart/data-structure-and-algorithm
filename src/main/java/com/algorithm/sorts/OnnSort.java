package com.algorithm.sorts;

import com.algorithm.util.ArrayUtils;
import java.util.Arrays;

/**
 * 记录时间复杂度为O(n*n)的三种排序算法 :  冒泡排序 选择排序 插入排序
 * @author guanwanglei
 * @since 2019/1/30
 */
public class OnnSort {
	private static OnnSort onnSort = new OnnSort();
	public static void main(String[] args) {
		int[] ints = ArrayUtils.getRandomIntArray(10);
		System.out.println("原始数组展示：" + Arrays.toString(ints));
		System.out.println("冒泡排序结果：" + Arrays.toString(onnSort.bubbleSort(ints)));
		System.out.println("选择排序结果：" + Arrays.toString(onnSort.selectSort(ints)));
		System.out.println("插入排序结果：" + Arrays.toString(onnSort.insertSort(ints)));
	}
	/**
	 * 插入排序：区分已排序区间和未排序区间，每次选取一个未排序区间的值放入到已排序区间适当的位置
	 * @param ints 需要排序的数组
	 * @return 排序后的数组
	 */
	public int[] insertSort(final int[] ints) {

		int point = 0;   //用于标识已排序区间和未排序区间
		for (int i = 0; i < ints.length; i++) {
			for (int j = point; j < ints.length; j++) {
				if (ints[i] < ints[j]) {
					int m = ints[i];
					ints[i] = ints[j];
					ints[j] = m;
				}
			}
		}
		return ints;
	}
	/**
	 * 选择排序：分已排序区间和未排序区间，每次选取为排序区间的最小值放到已排序区间最后的位置
	 * @param ints 需要排序的数组
	 * @return 排序后的数组
	 */
	public int[] selectSort(int[] ints) {
		int pointer = 1; //用于标识已排序区间
		for (int i = 0; i < ints.length; i++) {
			int min = ints[i];
			int minIndex = i;
			for (int j = pointer ; j < ints.length; j++) {
				if (ints[j] < min ){
					min = ints[j];
					minIndex = j;
				}
			}
			int tmp = ints[i];
			ints[i] = min;
			ints[minIndex] = tmp;
			pointer++;
		}
		return ints;
	}

	/**
	 * 冒泡排序
	 * @param ints 需要排序的数组
	 * @return 排序后的数组
	 */
	public int[] bubbleSort (int[] ints){
		for (int i = 0; i < ints.length; i++) {
			for (int j = i + 1 ; j < ints.length; j++) {
				if (ints[i] > ints[j]){
					int m = ints[i];
					ints[i] = ints[j];
					ints[j] = m;
				}
			}
		}
		return ints;
	}

}
