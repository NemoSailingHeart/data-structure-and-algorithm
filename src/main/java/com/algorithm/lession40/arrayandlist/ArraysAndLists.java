package com.algorithm.lession40.arrayandlist;

import com.algorithm.util.LinkedListUtil;
import com.algorithm.util.MyNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class ArraysAndLists {
    /**
     * 翻转链表
     */
    @Test
    public void reverseLinkedList(){
        LinkedList<Integer> integerLinkedList = LinkedListUtil.getIntegerLinkedList(10);
        System.out.println("原链表为：");
        System.out.println(Arrays.toString(integerLinkedList.toArray()));

    }
    /**
     * 翻转链表
     */
    @Test
    public void reverseMyLinkList(){
        MyNode tmpNode = LinkedListUtil.getMyLinkFirstNode(10);
        System.out.println("原链表为：");
        while (tmpNode !=null){
            System.out.print(tmpNode.value + "\t");
            tmpNode = tmpNode.next;
        }
        System.out.println();
    }


}
