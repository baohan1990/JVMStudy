package chapter02_;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hanBao on 2016/4/2.
 *
 * 限制永久代的内存大小
 *
 * -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class RuntimeConstantPoolOOM {
    public static void  main(String[] args){
        List<String> strs = new LinkedList<>();
        int i = 0;
        while (true){
            strs.add((String.valueOf(i++)+"快点出现常量池内存溢出吧"));
        }
    }
}
