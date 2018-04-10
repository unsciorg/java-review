package com.leetcode.questions.reverseString;

import org.junit.Test;

public class ReverseString {


    /**
     * 想不出什么好办法
     * 不停的进行append效率不是很高
     */
    class Mysolution{
        public String reverseString(String s) {
            char[] chars = s.toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = chars.length - 1; i >= 0 ; i--) {
                stringBuffer.append(chars[i]);
            }
            return stringBuffer.toString();
        }
    }

    /**
     * 思路：
     * 从中间一分为二进行交换
     */
    class Solution1 {
        public String reverseString(String s) {
            char[] c = s.toCharArray();
            int l = c.length-1;
            int mid = (l+1)/2;
            char t;
            for(int i=0; i<mid; i++){
                t = c[i];
                c[i] = c[l-i];
                c[l-i] = t;
            }
            return String.valueOf(c);
        }
    }


    @Test
    public void testMySolution(){
        System.out.println(new Mysolution().reverseString("hello"));
    }
}
