package cn.mzen.cocurrency;

import cn.mzen.cocurrency.Volatile.VolatileVariable;

/**
 * Created by itrek on 11/17/16.
 */
public class VolatileMain {
    public static void main(String[] args) {
        try {
            //通过该构造函数可以获取实时时钟的当前时间
            VolatileVariable vol = new VolatileVariable();

            //稍停100ms，以让实时时钟稍稍超前获取时间，使print（）中创建的消息打印的时间值大于0
            Thread.sleep(100);

            Thread t = new Thread(vol);
            t.start();

            //休眠100ms，让刚刚启动的线程有时间运行
            Thread.sleep(100);
            //workMethod方法在main线程中运行
            vol.workMethod();
        } catch ( InterruptedException x ) {
            System.err.println("one of the sleeps was interrupted");
        }
    }
}
