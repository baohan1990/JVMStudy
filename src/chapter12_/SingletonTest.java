package chapter12_;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hanBao on 2016/4/7.
 */
public class SingletonTest {

    private class Singleton{

    }
    private static List<Singleton> list = new LinkedList<>();

    private void addSingleton(){
        synchronized (Singleton.class){

            if(list.size() == 0){
             //   synchronized (Singleton.class){
                    list.add(new Singleton());
                }
             //}
        }

    }

    private static final int THREAD_COUNT = 10;

    public static void main(String[] args){
        SingletonTest test = new SingletonTest();
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i<threads.length; i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    test.addSingleton();
                }
            });
        }
        for (int i = 0; i< threads.length; i++){
            threads[i].start();
        }
        while(Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(list.size());
    }
}
