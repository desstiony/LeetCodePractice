package com.leetcode;

/**
 * @author: gonghan
 * @description:
 * @date: 2020/4/5
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(val + "->" + (next == null ? "NULL" : next));
        return res.toString();
    }

}
