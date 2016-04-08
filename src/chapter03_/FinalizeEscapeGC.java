package chapter03_;

/**
 * Created by hanBao on 2016/4/3.
 *
 * 即使在可达性分析算法不可达的对象，也有一次逃脱垃圾回收的的机会，
 *
 * 在对象进行可达分析后发现并没有与GC ROOTS相链接时，仍然有一次逃脱GC的机会，
 */
public class FinalizeEscapeGC{

    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        if(this != null){
            System.out.println(" I am still alive!");
        }
    }

    @Override
    public void finalize() throws  Throwable{
        super.finalize();
        System.out.println("finalize() has bean executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

}
