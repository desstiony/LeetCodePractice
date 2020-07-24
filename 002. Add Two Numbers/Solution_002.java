/**
 * @author: Mr. Gong
 * @date: 21:36
 * @description: 002. 两数相加
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_002 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }

        @Override
        public String toString() {
            return val + "->" + (next == null ? "NULL" : next);
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 定义头节点, 位数不足, 前边补0
        ListNode pre = new ListNode(0);
        // 当前引用指向头节点, pre 和 cur指向堆内存中同一块地址
        // 所以cur的内容修改后, pre内容也会跟着变,
        ListNode cur = pre;
        // 进位判断标示, 0 or 1
        int carry = 0;
        while (l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        // 如果进位值为1, 在前边补1
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        System.out.println("input: \n" + l1 + " + " + l2);
        Solution_002 solution = new Solution_002();

        ListNode out = solution.addTwoNumbers(l1, l2);
        System.out.println("out: \n" + out);
    }

}
