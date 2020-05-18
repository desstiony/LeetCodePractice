package com.leetcode;

/**
 * @author: gonghan
 * @description:
 * @date: 2020/4/4
 */
public class PalindromeLinkedList_234 {
    /**
     * 234. 回文链表
     * 请判断一个链表是否为回文链表。
     *
     * 示例 1:
     *
     * 输入: 1->2
     * 输出: false
     * 示例 2:
     *
     * 输入: 1->2->2->1
     * 输出: true
     * 进阶：
     * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;

        ListNode fast = head, slow = head,
                prev = null, curr;

        while(fast != null && fast.next != null){
            // 当前节点即为慢指针指向节点
            curr = slow;

            // 快指针后移两位， 判断何时跳出循环
            fast = fast.next.next;
            // 慢指针后移一位
            slow = slow.next;

            // 翻转
            // 当前节点下next 指向 上一个节点
            curr.next = prev;
            // 当前节点赋值给上一个节点， prev 前移
            prev = curr;

        }
        System.out.println("swap: \n    " + prev);
        // 奇数情况，跳过中位数
        if(fast != null){
            //  跳过
            slow = slow.next;
        }

        while(prev != null){
            if(prev.val != slow.val)
                return false;
            prev = prev.next;
            slow = slow.next;
        }

        return true;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);

        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(1);
        System.out.println("in: \n    " + l1);

        PalindromeLinkedList_234 pl = new PalindromeLinkedList_234();
        System.out.println("isPalindrome: \n    " + pl.isPalindrome(l1));
        System.out.println("in: \n    " + l1);
    }
}
