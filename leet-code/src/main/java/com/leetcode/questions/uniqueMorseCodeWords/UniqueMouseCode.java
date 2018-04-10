package com.leetcode.questions.uniqueMorseCodeWords;

import org.junit.Test;

import java.util.*;

public class UniqueMouseCode {

    /**
     * 解题思路：
     * 一开始想到可以把morse电码的字典表扔到map里面用hash取
     * 然后懒得一个个put
     * 然后，发现可以直接进行一一对应
     * 然后就是利用双重循环直接取得字典数组中的元素
     * 用stringbuffer进行拼接
     * 然后，就是利用hashset的特性进行去重了
     *
     *
     */

    class Mysolution{
        public int uniqueMorseRepresentations(String[] words) {
            String[] morseDic = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                    "...-",".--","-..-","-.--","--.."};

            StringBuffer sb ;
            Set<String> tmp = new HashSet<>();
            for (int i = 0; i < words.length; i++) {
                sb = new StringBuffer();
                char[] chars = words[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    sb.append(morseDic[chars[j] - 'a']);
                }
                tmp.add(sb.toString());
            }
            return tmp.size();
        }


    }

    @Test
    public void testMySolution(){
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new Mysolution().uniqueMorseRepresentations(words));
    }

}
