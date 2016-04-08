package chapter03_;

/**
 * Created by hanBao on 2016/4/3.
 */
public class FinalizeEscapeGS_Test {

    public static void main(String[] args) throws  Throwable{
        FinalizeEscapeGC obj = new FinalizeEscapeGC();
        obj.isAlive();
        obj = null;
        System.gc();
        Thread.sleep(500);
        obj.isAlive();
    }
}
