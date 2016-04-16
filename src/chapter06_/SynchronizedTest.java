package chapter06_;

/**
 * Created by hanBao on 2016/4/16.
 */
public class SynchronizedTest {
    void onlyme(Integer f){
        synchronized (f){
            System.out.print("111");
        }
    }
}
