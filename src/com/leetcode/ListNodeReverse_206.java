package com.leetcode;

/**
 * @author: gonghan
 * @description:
 * @date: 2020/4/5
 */

/**
 * 206. 反转链表
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list·
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ListNodeReverse_206 {

    // 迭代
    public ListNode reverseListIterate(ListNode head) {
        ListNode prev = null, curr = head, nextNode;

        while (curr != null) {
            nextNode = curr.next;

            curr.next = prev;
            prev = curr;

            curr = nextNode;
        }
        return prev;
    }

    // 递归
    public ListNode reverseListNodeRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode curr = reverseListNodeRecursive(head.next);
        System.out.println("curr: \n    " + curr);
        System.out.println("head: \n    " + head);

        head.next.next = head;
        head.next = null;
        return curr;
    }


    public static void main(String[] args) {
        ListNodeReverse_206 lr = new ListNodeReverse_206();

        ListNode l1 = new ListNode(1);

        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        System.out.println("in: \n    " + l1);

        //ListNode outList = lr.reverseListIterate(l1);
        //System.out.println("out: \n    " + outList);

        // 递归
        ListNode outListRecursive = lr.reverseListNodeRecursive(l1);
        System.out.println("out: \n    " + outListRecursive);

    }
}
