package com.leetcode.questions.hammingDistance;

import org.junit.Test;

public class HamingDistance {

    /**
     * 两个数字做异或运算
     * 转二进制
     * 替换掉不为1的值
     * 统计长度
     * over
     */
    class MySolution {

        public int hammingDistance(int x, int y) {
            return Integer.toBinaryString(x ^ y).replaceAll("[^1]", "").length();
        }

    }


    /**
     * 效率较高的：
     */
    class Solution1 {
        public int hammingDistance(int x, int y) {
            int xor = x ^ y, count = 0;
            for (int i = 0; i < 32; i++) {
                count += (xor >> i) & 1;
            }
            return count;
        }
    }


    /**
     * 令人窒息的操作。。。
     * 让我们看看里面的操作。。。
     */
    class Solution2 {
        public int hammingDistance(int x, int y) {
            return Integer.bitCount(x ^ y);
        }
    }


    @Test
    public void testMySolution() {
        System.out.println(new MySolution().hammingDistance(1, 4));
    }

    @Test
    public void testSolution1() {
        System.out.println(new Solution1().hammingDistance(1, 4));
    }

    @Test
    public void testSolution2() {
        System.out.println(new Solution2().hammingDistance(1, 4));
    }
}
