package com.algorithm.util;

public class LeetCodeListNodeUtil {

    /**
     * 根据数组生成链表
     * @param arr 输入的数组
     * @return 链表头
     */
    public static ListNode getListNode(int[] arr){
        ListNode listNode = new ListNode(arr[0]);
        ListNode firstListNode = listNode;
        for (int i = 1; i < arr.length; i++) {
            listNode.next = new ListNode(arr[i]);
            listNode = listNode.next;
        }
        return firstListNode;
    }

    /**
     * 将链表转换为String输出
     * @param listNode 链表头
     * @return 转换为String的链表
     */
    public static String listNodesToString(ListNode listNode){
        StringBuilder sb = new StringBuilder("[");
        while (listNode != null){
            sb.append(listNode.val).append(", ");
            listNode = listNode.next;
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    /**
     * 打印链表
     * @param listNode 链表头
     */
    public static void printList(ListNode listNode){
        System.out.println(listNodesToString(listNode));
    }

}
