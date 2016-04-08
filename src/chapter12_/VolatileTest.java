package chapter12_;

/**
 * Created by hanBao on 2016/4/5.
 *
 * 此示例演示volatile变量是非原子性的
 *
 */
public class VolatileTest {

    public static volatile int race = 0;

    public static void main(String[] args){
        Thread[] threads = new Thread[10];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0; j < 10000; j++)
                        race++;
                }
            });
            threads[i].start();
        }
        while(Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(race);
    }
}