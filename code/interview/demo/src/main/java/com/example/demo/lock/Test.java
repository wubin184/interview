package com.example.demo.lock;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.locks.ReentrantLock;

public class Test {
    static L l1 = new L ();
    static ReentrantLock reentrantLock = new ReentrantLock();


    public static void main(String[] args) {
//        lockTest();
        int[] arr = {1,2,3};
        String str2 = "Hello , I Love You";
        System.out.println(l1.hashCode());
        String str = ClassLayout.parseInstance(l1).toPrintable();
        System.out.println(str);
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
