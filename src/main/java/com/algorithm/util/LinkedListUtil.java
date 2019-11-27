package com.algorithm.util;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListUtil {

    /**
     * 生成指定长度的LinkedList
     * @param i 长度
     * @return LinkedList<Integer>
     */
    public static LinkedList<Integer> getIntegerLinkedList(Integer i){
        Integer[] randomIntArray = ArrayUtils.getRandomIntArray(i);
        return new LinkedList<>(Arrays.asList(randomIntArray));
    }

    /**
     * 获取指定长度链表的链表头
     * @return 链表头
     */
    public static MyNode getMyLinkFirstNode(int len){
        int[] randomIntArray = ArrayUtils.getRandomIntArray(len);
        MyNode myNode = new MyNode(randomIntArray[0]);
        MyNode tmpNode = myNode;
        for (int i =1; i< randomIntArray.length; i++) {
            tmpNode.next = new MyNode(randomIntArray[i]);
            tmpNode = tmpNode.next;
        }
        return myNode;
    }

}
