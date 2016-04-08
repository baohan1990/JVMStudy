package chapter02_;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hanBao on 2016/4/2.
 */
public class HeapOOM {

    /**
     * -Xms20m -Xmm20m -XX:+HeapDumpOnOutOfMemoryError
     */
    static class OOMObject{
    }

    public static void main(String[] args){
        try{
            List<OOMObject> oomObjectList = new LinkedList<>();
            while(true){
                oomObjectList.add(new OOMObject());
            }
        }catch (Exception e){
            System.err.print(e.getMessage());
        }
        System.out.print("堆内存不足时，java程序是否退出？");
    }

}
