package cn.mzen.cocurrency;

import cn.mzen.cocurrency.Nortify.MissedNortify;

/**
 * Created by itrek on 11/18/16.
 */
public class NortifyMain {
    public static void main(String[] args) {
        final MissedNortify mn = new MissedNortify();

        Runnable runA = new Runnable() {
            public void run() {
                try {
                    //休眠1000ms，大于runB中的500ms，
                    //是为了后调用waitToProceed，从而先notifyAll，后wait，
                    //从而造成通知的遗漏
                    Thread.sleep(1000);
                    mn.waitToProceed();
                } catch ( InterruptedException x ) {
                    x.printStackTrace();
                }
            }
        };

        Thread threadA = new Thread(runA, "threadA");
        threadA.start();

        Runnable runB = new Runnable() {
            public void run() {
                try {
                    //休眠500ms，小于runA中的1000ms，
                    //是为了先调用proceed，从而先notifyAll，后wait，
                    //从而造成通知的遗漏
                    Thread.sleep(500);
                    mn.proceed();
                } catch ( InterruptedException x ) {
                    x.printStackTrace();
                }
            }
        };

        Thread threadB = new Thread(runB, "threadB");
        threadB.start();

        try {
            Thread.sleep(10000);
        } catch ( InterruptedException x ) {}

        //试图打断wait阻塞
        print("about to invoke interrupt() on threadA");
        threadA.interrupt();
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
}
