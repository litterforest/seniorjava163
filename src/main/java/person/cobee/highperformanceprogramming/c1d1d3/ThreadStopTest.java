package person.cobee.highperformanceprogramming.c1d1d3;

/**
 * 功能描述
 *
 * @author cobee
 * @since 2019-11-04
 */
public class ThreadStopTest {

    public static void main(String[] args) throws InterruptedException {
        CalcRunnable calcRunnable = new CalcRunnable();
        Thread thread = new Thread(calcRunnable);
//        thread.interrupt(); // 中断不活动的线程没有任何效果
        thread.start();
        Thread.sleep(1000);
        // thread.stop(); 强制终止，线程直接销毁
        thread.interrupt();
//        while(thread.isAlive()){
//
//        }
        thread.join();
        calcRunnable.print();
    }

}
