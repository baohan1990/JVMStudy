package chapter03_;

/**
 * Created by hanBao on 2016/4/3.
 */
public class MemoryAllocation {

    private static int _SIZE = 1024*1024;

    public static void main(String[] args){
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _SIZE];
        allocation2 = new byte[2 * _SIZE];
        allocation3 = new byte[2 * _SIZE];
        System.out.println("------------------------>优先在Eden上进行分配");
        allocation4 = new byte[4 * _SIZE];
        System.gc();
    }
}
