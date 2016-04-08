package chapter02_;

/**
 * Created by hanBao on 2016/4/2.
 *
 * HotSpot虚拟机并不区分虚拟机栈和本地方法栈，
 *
 * Java虚拟机规范中关于该区域描述了两种异常：
 *  1.如果线程请求的栈深度大于虚拟机所允许的深度，则抛出StackOverflowError异常
 *  2.如果虚拟机在扩展栈时发现无法申请到足够的内存，则抛出OutOfMemoryError异常
 *
 *  -Xss108k
 */
public class JavaVMStackOF {

    public void stackLeak(){
        stackLeak();
    }

    public static  void main(String[] args){
        JavaVMStackOF javaVMStackOF = new JavaVMStackOF();
        try{
            javaVMStackOF.stackLeak();
        }catch (Exception e){
            System.err.print(e.getMessage());
        }
        System.out.println("栈溢出后程序是否退出？");
    }
}
