package lock;

import java.util.concurrent.locks.ReentrantLock;

public class Test {
    static L l1 = new L ();
    static ReentrantLock reentrantLock = new ReentrantLock();
    public static void main(String[] args) {
        lockTest();

        ClassLayout.
    }

    public static void lockTest(){
        /**
         * java 当中有哪些锁
         */

        reentrantLock.lock();
        System.out.println("Hello baby 111");
        reentrantLock.unlock();


        //锁对象
        synchronized (l1){
            System.out.println("Hello baby 222");
        }

//        synchronized (Test.class){
//            System.out.println("Hello baby");
//        }

    }
}
