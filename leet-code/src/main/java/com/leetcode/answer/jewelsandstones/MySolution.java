package com.leetcode.answer.jewelsandstones;

public class MySolution {

    public int numJewelsInStones(String J, String S) {
        char[] myStones = S.toCharArray();
        int count = 0;
        for (int i = 0; i < myStones.length; i++) {
            if (J.contains(Character.toString(myStones[i]))) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(new MySolution().numJewelsInStones("aA","aAAbbbb"));
    }


    public void testSolution(){
        System.out.println(new MySolution().numJewelsInStones("aA","aAAbbbb"));
    }

}
