package org.sniper.jack.base.autoboxing;

public class AutoBoxing {

    public static void main(String[] args) {

        /**
         * java Integer 自动装箱
         * 范围为 -128 ～127
         */

        Integer arg1 = 127;
        Integer arg2 = 127;

        System.out.println("Integer 127 " + (arg1 == arg2));

        Integer a = 128;
        Integer b = 128;

        System.out.println("Integer 128 " + (a == b));

        Double c = 10.1;
        Double d = 10.1;

        System.out.println(c == d);

    }
}
