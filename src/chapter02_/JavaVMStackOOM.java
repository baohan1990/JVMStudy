package chapter02_;

/**
 * Created by hanBao on 2016/4/2.
 *
 * -Xss2M
 */
public class JavaVMStackOOM {

    private static void dontstop(){
        while(true){

        }
    }

    public static void main(String[] args){
        while(true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontstop();
                }
            });
            thread.start();
        }
    }
}
