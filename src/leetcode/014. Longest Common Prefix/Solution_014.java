/**
 * @author: Mr. Gong
 * @date: 2019/8/9 16:03
 * @description: 014. 最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * */
public class Solution_014 {
    public String longestCommonPrefix(String[] strs) {
        // 数组为空返回 ""
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        // 遍历数组内的元素
        for (String str : strs) {
            // 判断是否数组内是否存在 prefix
            while (str.indexOf(prefix) != 0) {
                // if不存在 缩减子串长度 继续查找是否存在
                prefix = prefix.substring(0, prefix.length() - 1);
                // 如果不存在 返回 ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution_014 solution014 = new Solution_014();
        String[] in = new String[]{"flower","flow","flight"};
        String prefix = solution014.longestCommonPrefix(in);
        System.out.println(prefix);
    }
}
