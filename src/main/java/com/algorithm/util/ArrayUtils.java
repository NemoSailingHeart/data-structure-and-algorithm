package com.algorithm.util;

import com.algorithm.sorts.OnLogNSort;

import java.util.Random;

/**
 * @author guanwanglei
 * @since 2019/1/30
 */
public class ArrayUtils {
	private static Random random = new Random();
	/**
	 * 根据长度获取一个随机数组
	 * @param length 数组长度
	 * @return 随机数组
	 */
	public static int[] getRandomIntArray(int length){
		int [] ints = new int[length];


		for (int i = 0; i < length; i++) {
			ints[i] = random.nextInt(100);
		}
		return ints;
	}

	public static int[] getSortedRandomIntArray(int length){
		OnLogNSort onLogNSort = new OnLogNSort();
		return onLogNSort.quickSort(getRandomIntArray(length));
	}
}
