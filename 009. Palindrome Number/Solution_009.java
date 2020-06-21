/**
 * @author: Mr. Gong
 * @date: 2020/6/21 09:31
 * @description: 009. 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_009 {
    public boolean isPalindrome(int val) {
        // 用于判断 10 的倍数
        if (val < 0 || val != 0 && val % 10 == 0)
            return false;
            // 反转一半数字
        int ans = 0;
        while (val > ans) {
            // 取最后一位
            ans = ans * 10 + val % 10;
            // 取剩余位，比如输入2221 输出222
            val /= 10;
        }
        return val == ans || val == (ans / 10);
    }

    public static void main(String[] args) {
        int a = 123321, b = 12211, c = 110;
        Solution_009 solution = new Solution_009();
        boolean bool = solution.isPalindrome(c);
        System.out.println("is palindrome : " + bool);
    }
}
