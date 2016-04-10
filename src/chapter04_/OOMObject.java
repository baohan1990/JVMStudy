package chapter04_;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hanBao on 2016/4/10.
 */
public class OOMObject {

    public byte[] placeHolder = new byte[64 * 1024];

    public static List<OOMObject> list = new LinkedList<>();

    public static void fillHeap(int num)throws InterruptedException{
        for(int i = 0; i < num; i++){
            Thread.sleep(500);
            list.add(new OOMObject());
            System.out.println("111");
        }
    }

    public static void main(String[] args)throws InterruptedException{
        OOMObject.fillHeap(1000);
    }
}