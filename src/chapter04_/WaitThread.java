package chapter04_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by hanBao on 2016/4/10.
 */
public class WaitThread {
    public static void createBusyThread(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true);
            }
        },"testBusyThread");
        thread.start();
    }

    public static void createLockThread(final Object lock){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"testLockThread");
        thread.start();
    }

    /**
     *  线程过长时间卡顿，
     *
     *  1.等待外部资源，数据库连接，网络资源，设备资源等，
     *  2.死循环，
     *  3.锁等待（活锁和死锁）。
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        WaitThread.createBusyThread();
        br.readLine();
        WaitThread.createLockThread(new Object());
    }

}
