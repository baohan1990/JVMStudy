package chapter04_;

/**
 * Created by hanBao on 2016/4/10.
 */
public class DeadThread {

    static class AddRunnable implements Runnable{

        private Integer a;

        private Integer b;

        public AddRunnable(Integer a, Integer b){
            this.a = a;
            this.b = b;
        }

        @Override
        public void run(){
            synchronized (a){
                synchronized (b){
                    System.out.println(a+b);
                    //while (true);
                }
            }
        }
    }

    /**
     * Integer.valueOf()基于减少对象创建次数和节省内存成本的考虑，默认[-128,127]之间的数会被缓存，
     * @param args
     */
    public static void main(String[] args){
        final Integer a = 1;
        final Integer b = 2;
        for (int i = 0; i< 100; i++){
            new Thread(new AddRunnable(a,b)).start();
            new Thread(new AddRunnable(b,a)).start();
        }
    }

}
