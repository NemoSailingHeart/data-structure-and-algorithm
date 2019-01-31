package com.algorithm.sorts;

import com.algorithm.util.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author guanwanglei
 * @since 2019/1/30
 */
public class OnnSortTest {

	@Test
	public void testAll(){
		OnnSort onnSort = new OnnSort();
		int[] ints = ArrayUtils.getRandomIntArray(10);
		System.out.println("原始数组展示：" + Arrays.toString(ints));
		System.out.println("冒泡排序结果：" + Arrays.toString(onnSort.bubbleSort(ints)));
		System.out.println("选择排序结果：" + Arrays.toString(onnSort.selectSort(ints)));
		System.out.println("插入排序结果：" + Arrays.toString(onnSort.insertSort(ints)));
		Assert.assertEquals(Arrays.toString(onnSort.bubbleSort(ints)), Arrays.toString(onnSort.selectSort(ints)));
		Assert.assertEquals(Arrays.toString(onnSort.bubbleSort(ints)), Arrays.toString(onnSort.insertSort(ints)));
	}

}