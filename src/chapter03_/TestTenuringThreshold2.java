package chapter03_;

/**
 * Created by hanBao on 2016/4/4.
 *
 * 当Survivor区中相同年龄对象大小大于该区域
 */
public class TestTenuringThreshold2 {

    public static int _SIZE = 1024 * 1024;

    public static void main(String[]args){
        byte[] allocation1 ,allocation2 ,allocation3 ,allocation4;
        allocation1 = new byte[_SIZE/4];
        //allocation2 = new byte[_SIZE/4];
        //必须将以上对象逼入Survivor区
        allocation3 = new byte[_SIZE * 4];
        allocation4 = new byte[_SIZE * 4];
        allocation4 = null;
        allocation4 = new byte[_SIZE * 4];


    }
}
