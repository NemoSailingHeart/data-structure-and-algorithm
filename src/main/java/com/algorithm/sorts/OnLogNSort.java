package com.algorithm.sorts;

import com.algorithm.util.ArrayUtils;
import java.util.Arrays;

/**
 * @author guanwanglei
 * @since 2019/1/30
 */
public class OnLogNSort {
	private static OnLogNSort onLogNSort = new OnLogNSort();
	public static void main(String[] args) {
		int[] arr = ArrayUtils.getRandomIntArray(10);
		System.out.println("原始数组展示：" + Arrays.toString(arr));
		System.out.println("归并排序结果：" + Arrays.toString(onLogNSort.mergeSort(arr)));
		System.out.println("快速排序结果：" + Arrays.toString(onLogNSort.quickSort(arr)));
		System.out.println("第K大的元素： " + "");
	}

	/**
	 * 快速排序
	 * @param arr 排序的数组
	 * @return 排序完成的数组
	 */
	public int[] quickSort(int[] arr) {
		//不改变原数组，先将原数组进行深复制
		int[] ints = new int[arr.length];
		System.arraycopy(arr, 0, ints, 0, arr.length);
		quickSortC(ints, 0, arr.length - 1 );
		return ints;
	}

	/**
	 * 快排的递归函数
	 * @param arr 要排序的数组
	 * @param start 数组起始下标
	 * @param end 数组终止下标
	 */
	private void quickSortC(int[] arr, int start, int end) {
		if (start >= end) return;

		int mid = partition(arr, start, end); //获取分区点
		quickSortC(arr, start, mid-1);
		quickSortC(arr, mid+1, end);
	}

	/**
	 * 快排的分区函数
	 * @param arr 要排序的数组
	 * @param start 开始的下标
	 * @param end 终止的下标
	 * @return 分区点的下标
	 */
	private int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int i = start;
		for(int j = start; j < end; ++j) {
			if (arr[j] < pivot) {
				swap(arr,j,i);
				i++;
			}
		}

		swap(arr, i,end);
		return i;
	}
	/**
	 * 交换数组内两个元素
	 * @param array 需要交换生数据的数组
	 * @param i 交换的下标1
	 * @param j 交换的下标2
	 */
	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	/**
	 * 归并排序
	 * @param arr 需要排序的数组
	 * @return 返回的数组值
	 */
	private int[] mergeSort(int[] arr) {
		//不改变原数组，先将原数组进行深复制
		int[] ints = new int[arr.length];
		System.arraycopy(arr, 0, ints, 0, ints.length);
		mergeSortC(ints, 0, ints.length - 1);
		return ints;
	}

	/**
	 * 归并排序的递归函数
	 * @param ints 要排序的数组
	 * @param start 开始下标
	 * @param end 结束下标
	 */
	private void mergeSortC(int[] ints, int start, int end) {

		if (start >= end)  return;

		 // 取 start 和end 之间的中间位置
		int mid = (start + end) / 2;
		 //
		mergeSortC(ints, start, mid);
		mergeSortC(ints, mid+1, end);

		merge(ints, start, mid, end);

	}

	/**
	 * 归并排序merge函数
	 * @param ints 要排序的数组
	 * @param start 数组的开始下标
	 * @param mid 数组的中间下标
	 * @param end 数组的结尾下标
	 */
	private void merge(int[] ints, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int i = start;// 左指针
		int j = mid + 1;// 右指针
		int k = 0;
		// 把较小的数先移到新数组中
		while (i <= mid && j <= end){
			if (ints[i] < ints[j]){
				temp[k++] = ints[i++];
			} else {
				temp[k++] = ints[j++];
			}
		}
		// 把左边剩余的数移入数组
		while (i <= mid) {
			temp[k++] = ints[i++];
		}
		// 把右边边剩余的数移入数组
		while (j <= end) {
			temp[k++] = ints[j++];
		}
		// 把新数组中的数覆盖nums数组
		System.arraycopy(temp, 0, ints, start, temp.length);
	}

}
