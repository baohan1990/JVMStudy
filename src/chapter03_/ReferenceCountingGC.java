package chapter03_;

/**
 * Created by hanBao on 2016/4/2.
 *
 * -XX:+PrintGCDetails
 */
public class ReferenceCountingGC {

    private ReferenceCountingGC referenceCountingGC = null;

    private static final int _1MB = 1024*1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args){
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.referenceCountingGC = objB;
        objB.referenceCountingGC = objA;

        objA = null;
        objB = null;

        System.gc();
    }
}
