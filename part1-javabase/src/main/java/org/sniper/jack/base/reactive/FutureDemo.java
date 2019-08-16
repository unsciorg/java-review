package org.sniper.jack.base.reactive;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.*;

public class FutureDemo {

    static ExecutorService executorService = Executors.newCachedThreadPool();


    public void testTaskRunning(String name, Integer t) {
        System.out.println("prepare for execution :" + name);

        long startTime = System.currentTimeMillis();

        Future<String> fa = executorService.submit(
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {

                        try {
                            Thread.sleep(t);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return String.format("Service executor time: %d", t);
                    }
                }
        );
//
//
//        Future<String> fa = executorService.submit(
//                () ->{
//                    try {
//                        Thread.sleep(t);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    return String.format("Service executor time: %d", t);
//                }
//        );

        long endTime = System.currentTimeMillis();

        System.out.println("start execute " + (endTime - startTime) + "ms");

        try {
            String s = fa.get();
            System.out.println("the result of fa.get is :" + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        endTime = System.currentTimeMillis();

        System.out.println("end execute " + (endTime - startTime) + "ms");

    }


    public void testAsyncTaskRunning() {
        System.out.println("prepare for execution : compsite task");
        long startTime = System.currentTimeMillis();
        String s = new String(new byte[]{});
        Future<String> fa = executorService.submit(new TimeConsumingService("fa", 200, new String[]{}));
        Future<String> fb = executorService.submit(new TimeConsumingService("fb", 200, new String[]{}));

        System.out.println("Start execute： " + (System.currentTimeMillis() - startTime) + "ms");

        try {
            // What will happen when change line fc and fd ?
            Future<String> fc = executorService.submit(new TimeConsumingService("fc", 400, new String[]{fa.get()}));
            Future<String> fd = executorService.submit(new TimeConsumingService("fd", 200, new String[]{fb.get()}));
            Future<String> fe = executorService.submit(new TimeConsumingService("fe", 200, new String[]{fb.get()}));
            fc.get();
            fd.get();
            fe.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End execute： " + (System.currentTimeMillis() - startTime) + "ms");
    }


    public static void main(String[] args) {
        FutureDemo test = new FutureDemo();
        test.testTaskRunning("fa", 300);
        test.testAsyncTaskRunning();
        System.out.println("sssssssssssssssssss");
    }
}