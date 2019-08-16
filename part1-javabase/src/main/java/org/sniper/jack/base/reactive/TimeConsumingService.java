package org.sniper.jack.base.reactive;

import java.util.concurrent.Callable;

public class TimeConsumingService implements Callable<String> {

    private String serviceName;

    private int waitMs;

    public TimeConsumingService(String name, Integer waiting, String[] depandencies) {
        this.serviceName = name;
        this.waitMs = waiting;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitMs);
        return String.format("service %s exec time is: %d ms", serviceName, waitMs);
    }
}
