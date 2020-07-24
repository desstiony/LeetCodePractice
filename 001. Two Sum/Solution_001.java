import java.util.HashMap;
import java.util.Map;

/**
 * @author: Mr. Gong
 * @date: 2020/1/2
 * @description: 001. 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_001 {
    /**
     * 暴力法，
     * 时间复杂度 O(n2)
     * 空间复杂度 O(1)
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No tow sum solution");
    }

    /**
     * hash
     */
    public int[] twoSum_map(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 判断complement是否存在于map中
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // 将数组value和index放入map的key和value
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No tow sum solution");
    }

    public static void main(String[] args) {
        // 1.two sum
        Solution_001 solution0011 = new Solution_001();
        int[] a = {2, 7, 11, 2, 15};
        int[] ints1 = solution0011.twoSum(a, 9);
        System.out.println("暴力法：" + "[" + ints1[0] + "," + ints1[1] + "]");
        int[] ints = solution0011.twoSum_map(a, 9);
        System.out.println("hash：" + "[" + ints[0] + "," + ints[1] + "]");
    }

}
