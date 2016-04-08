package chapter02_;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by hanBao on 2016/4/2.
 *
 * 直接内存的大小由-XX:MaxDirectMemorySize指定，如果不指定，则默认与Java堆最大值（-Xmx指定）
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024*1024;

    public static void main(String[] args) throws  Exception{
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true){
            unsafe.allocateMemory(_1MB);
        }
    }
}
