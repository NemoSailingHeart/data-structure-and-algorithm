package com.algorithm.sorts;

import org.junit.Test;
import java.util.Arrays;

public class MidTwoNums {

//    private int[] arr1 = ArrayUtils.getRandomIntArray(2);
//    private int[] arr2 = ArrayUtils.getRandomIntArray(1);
    private int[] arr1 = {1,3};
    private int[] arr2 = {2};

    @Test
    public void run1() {
        int[] ints = new OnnSort().selectSort(arr1);
        System.out.println(Arrays.toString(arr1));

        new OnnSort().selectSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int len = arr1.length + arr2.length;
        if (len % 2 == 0){
            int index1 = len/2;
            int index2 = index1 -1;
            System.out.println(findTheNum(index1,index2));
        }else{
            int index = len/2;
            System.out.println(findTheNum(index,-1));
        }
    }

    private int findTheNum(int index1, int index2) {
        int count = 0;
        int i = 0;
        int j = 0;
        int[] arrTmp = arr1;
        if (arr1.length>=arr2.length){
            arrTmp = arr1;
            arr1=arr2;
            arr2=arrTmp;
        }
        int tmpIndex = 0;
        int[] lastArr= {0,0};
        while (i < arr1.length || j < arr2.length){
            if (arr1[i] <= arr2[j]){
                arrTmp = arr1;
                tmpIndex = i;
                if (i < arr1.length - 1 ) i++;
            }else  {
                arrTmp = arr2;
                tmpIndex =j;
                if (j<arr2.length - 1) j++;
            }

            if(index1==count){
                if (index2==-1){
                    lastArr[0] = arrTmp[tmpIndex];
                    break;
                }
            }
            if (index2 == count){
                lastArr[1] = arrTmp[tmpIndex];
                break;
            }
            count = count++;
        }
        return index2 == -1? lastArr[0]:(lastArr[0]+lastArr[1]) /2;
    }

    private int findTheMid(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int lenAll = len1+len2;
        int count =0;//记录数到了第几个
        int resIndex = 0;//记录数到count时是哪个数组的哪一个
        int resFlag = 0; //记录最后一个是哪个数组，1代表arr1
        int i = 0;
        int j = 0;
        while (i< len1 && j < len2 && count <= lenAll/2){
            if (arr1[i]<=arr2[j]){
                resIndex = i;
                resFlag = 1;
                count = count+1;
                i =i+1;
            }
            else {
                resFlag = 2;
                resIndex = j;
                count =count +1;
                j =j+1;
            }
        }
        //
        if (count == lenAll/2){
            //是偶数
            if (lenAll %2 ==0){
                if (resFlag == 1){
                    return 0; //TODO
                }
            }
        }
        return 0;// TODO
    }
}
