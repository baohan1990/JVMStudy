package chapter03_;

/**
 * Created by hanBao on 2016/4/3.
 *
 * 长期存活的对象将进入老年代
 *
 * -Xms20M -Xmx20M -Xmn10M  -XX:PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1/-XX:MaxTenuringThreshold=15
 *
 *
 */
public class TestTenuringThreshold {

    public static final int _SIZE = 1024 * 1024;

    public static void main(String[] args){
        byte[] allocation1,allocation2,allocation3;
        //allocation1,
        allocation1 = new byte[_SIZE/4];
        allocation2 = new byte[4 * _SIZE];
        allocation3 = new byte[4 * _SIZE];
        allocation3 = null;
        allocation3 = new byte[4 * _SIZE];

    }
}
