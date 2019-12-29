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
        ListNode head = getListNode();
        printListNodes(head);
        ListNode listNode = reverseList(head);
        printListNodes(listNode);
    }

    private ListNode getListNode() {
        ListNode head = new ListNode(1);
        ListNode tmp = new ListNode(2);
        head.next = tmp;
        for (int i = 3; i < 6; i++) {
            ListNode next = new ListNode(i);
            tmp.next = next;
            tmp = next;
        }
        return head;
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

    /**
     * 方法1：迭代方式
     * @param head 链表头
     * @return 反转后的链表头
     */
    private ListNode reverseList(ListNode head) {
        // 上一个节点
        ListNode pre = null;
        // 当前节点
        ListNode cur = head;

        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    @Test
    public void t206_2(){
        ListNode listNode = getListNode();
        printListNodes(listNode);
        printListNodes(reverseListR(listNode));
    }
    /**
     * 递归方式反转链表
     * @param head 链表头
     * @return 返回的链表头
     */
    private ListNode reverseListR(ListNode head) {
        //TODO 尚未完成
        if (head.next == null){
            return head;
        } else {
            head.next = head;
        }
        return reverseListR(head.next);
    }

    @Test
    public void t206Stack(){
        ListNode listNode = getListNode();
        printListNodes(listNode);
        printListNodes(reverseListR(listNode));
    }
}
