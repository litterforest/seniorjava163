package person.cobee.highperformanceprogramming.c1d3d5concurrutil.futuretask;

import java.util.concurrent.Callable;

/**
 * 线程可返回结果的方法
 *
 * @author cobee
 * @since 2019-12-02
 */
public class HelloWorld2Callable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(5000L);
        return "Hello world2";
    }
}
