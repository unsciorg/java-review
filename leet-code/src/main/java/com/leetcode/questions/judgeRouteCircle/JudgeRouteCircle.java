package com.leetcode.questions.judgeRouteCircle;

import org.junit.Test;

public class JudgeRouteCircle {


    /**
     * 解题思路：
     * 验证一下相反的操作数量是否相等
     */
    class Mysolution {

        public boolean judgeCircle(String moves) {

            int weight = 0, height = 0;
            char[] move = moves.toCharArray();
            for (int i = 0; i < move.length; i++) {
                switch (move[i]) {
                    case 'L':
                        weight ++;
                        break;
                    case 'R':
                        weight--;
                        break;
                    case 'U':
                        height++;
                        break;
                    case 'D':
                        height--;
                        break;
                    default:
                        break;
                }
            }

            if (weight !=0 || height !=0){
                return false;
            }
            return true;
        }
    }

    class Solution2 {
        public boolean judgeCircle(String moves) {
            byte[] bytes = new byte[128];
            for(char i : moves.toCharArray()){
                bytes[i]++;
            }
            return bytes['R'] == bytes['L'] && bytes['U'] == bytes['D'];
        }
    }


    /**
     * 解决方案2和解决方案3 的大体思路一致
     * 不判断类型，只是单纯的相加
     * 最后判定是否一致
     * 由于只判定一次，所以效率比较高
     *
     */
    class Solution3 {
        public boolean judgeCircle(String moves) {
            int[] move = new int[128];
            for(char i : moves.toCharArray()){
                move[i]++;
            }
            return move['R'] == move['L'] && move['U'] == move['D'];
        }
    }


    @Test
    public void testMySolution(){
        for (int i = 0; i < 1000; i++) {
            new Mysolution().judgeCircle("UD");
        }
    }

    @Test
    public void testSolution2(){
        for (int i = 0; i < 1000; i++) {
            new Solution2().judgeCircle("UD");
        }
    }

    @Test
    public void testSolution3(){
        for (int i = 0; i < 1000; i++) {
            new Solution3().judgeCircle("UD");
        }
    }
}
