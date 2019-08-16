package org.sniper.jack.base.reactive;

public class LambdaDemo {

    public static void main(String[] args) {
        System.out.println("--------- runnable start...");


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("this is a runnable demo");
            }
        };


        Runnable runnable1 = () ->{
            System.out.println("this is a runnable2 demo");

        };

        runnable.run();
        runnable1.run();
    }


}
