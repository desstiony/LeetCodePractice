package com.leetcode;

public class Main {

    public static void main(String[] args) {
        // 1.two sum
        TwoSum_1 twoSum1 = new TwoSum_1();
        int[] a = {2, 7, 11, 2, 15};
        int[] ints1 = twoSum1.twoSum(a, 9);
        System.out.println("暴力法：" + "[" + ints1[0] + "," + ints1[1] + "]");
        int[] ints = twoSum1.twoSum_map(a, 9);
        System.out.println("hash：" + "[" + ints[0] + "," + ints[1] + "]");
        // 2.
    }

}
