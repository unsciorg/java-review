package com.leetcode.answer.jewelsandstones;

import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;

public class Solutions {

    class Solution1{
        /**
         * 解法1：利用正则表达式直接替换
         * PS:[^xyz] 指的是除了xyz的所有字符
         * 思路是把这些字符替换掉，然后统计长度
         */


        public int numJewelsInStones(String J, String S) {
            return S.replaceAll("[^" + J + "]", "").length();
        }

    }

    class Solution2{
        /**
         * 解法：利用java8的stream
         * 看起来不错。。不过耗时巨长
         * 用时100ms+
         */
        public int numJewelsInStones(String J, String S) {
            Set<Integer> jewels = J.chars().boxed().collect(Collectors.toSet());
            return (int) S.chars().filter(jewels::contains).count();
        }

    }

    @Test
    public void testSolution2(){
        System.out.println(
                new Solution2().numJewelsInStones("aA","aAAbbbb"));
    }

    @Test
    public void testSolution1(){
        System.out.println(
                new Solution1().numJewelsInStones("aA", "aAAbbbb")
        );
    }

    @Test
    public void testMySolution(){
        System.out.println(
                new MySolution().numJewelsInStones("aA", "aAAbbbb")
        );
    }

}
