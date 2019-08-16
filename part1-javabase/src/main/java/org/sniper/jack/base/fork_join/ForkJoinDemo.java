package org.sniper.jack.base.fork_join;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo extends RecursiveTask<Integer> {

    public static final int THRESHOLD = 2;

    private int start;

    private int end;

    public ForkJoinDemo(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        int sum = 0;

        boolean canCompute = (end - start ) < THRESHOLD;
        if (canCompute){
            for (int i = start; i < end; i++) {
                sum = sum + i;
            }
        } else{
            int middle = (start + end ) / 2;
            ForkJoinDemo leftTask = new ForkJoinDemo(start, middle);
            ForkJoinDemo rightTask = new ForkJoinDemo(middle + 1, end);

            leftTask.fork();
            rightTask.fork();

            int leftCount = leftTask.join();
            int rightCount = rightTask.join();

            sum  = leftCount + rightCount;

        }

        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinDemo forkJoinDemo = new ForkJoinDemo(1, 100);
        long startTime = System.currentTimeMillis();
        Future<Integer> result = forkJoinPool.submit(forkJoinDemo);
        System.out.println(result.get());
        long endTime = System.currentTimeMillis();
        System.out.println("pool runtime is " + (endTime - startTime));
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        long finishTime = System.currentTimeMillis();
        System.out.println("end runtime is " + (finishTime - endTime));


    }
}
