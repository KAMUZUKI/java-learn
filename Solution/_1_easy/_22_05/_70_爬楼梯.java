package com.mu;

/*

假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

示例 1：
输入：n = 2
输出：2
解释：有两种方法可以爬到楼顶。
1. 1 阶 + 1 阶
2. 2 阶

 */
public class _70_爬楼梯 {
    public static void main(String[] args) {
        int ret = new Solution().climbStairs(5);
        System.out.println("result = " + ret);
    }

    static class Solution {
        public int climbStairs(int n) {
            if (n <= 2) return n;
            int[] f = new int[n + 1];
            f[1] = 1;
            f[2] = 2;
            for (int i = 3; i <= n; i++) {
                f[i] = f[i-1] + f[i - 2];
            }
            return f[n];
        }
    }
}
