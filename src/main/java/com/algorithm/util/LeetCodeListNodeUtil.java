package com.algorithm.util;

public class LeetCodeListNodeUtil {

    public static ListNode getListNode(int[] arr){
        ListNode listNode = new ListNode(arr[0]);
        ListNode firstListNode = listNode;
        for (int i = 1; i < arr.length; i++) {
            listNode.next = new ListNode(arr[i]);
            listNode = listNode.next;
        }
        return firstListNode;
    }

    public static void printList(ListNode listNode){
        StringBuilder sb = new StringBuilder("[");
        while (listNode != null){
            sb.append(listNode.val).append(", ");
            listNode = listNode.next;
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        System.out.println(sb);
    }
}
