package com.algorithm.leetcode.t200to300.t200to210;

import org.junit.Test;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class T206 {
    @Test
    public void t206(){
        ListNode head = new ListNode(1);
        ListNode tmp = new ListNode(2);
        head.next = tmp;
        for (int i = 3; i < 6; i++) {
            ListNode next = new ListNode(i);
            tmp.next = next;
            tmp = next;
        }
        printListNodes(head);
    }

    private void printListNodes(ListNode head) {
        ListNode tmp1 = head;
        String str = ",\t";
        System.out.println("------------- begin --------------");
        while (tmp1 != null){
            System.out.print(tmp1.val+str);
            tmp1 = tmp1.next;
        }
        System.out.println("\r\n------------- end --------------");
    }

    // TODO 有空了再写
    public ListNode reverseList(ListNode head) {
        return null;
    }
}
