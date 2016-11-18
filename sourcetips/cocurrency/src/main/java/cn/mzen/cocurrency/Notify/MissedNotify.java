package cn.mzen.cocurrency.Nortify;

/**
 * Created by itrek on 11/18/16.
 */
public class MissedNortify extends Object {
    private Object proceedLock;

    public MissedNortify() {
        MissedNortify.print("in MissedNotify()");
        proceedLock = new Object();
    }

    public void waitToProceed() throws InterruptedException {
        print("in waitToProceed() - entered");

        synchronized (proceedLock) {
            print("in waitToProceed() - about to wait()");
            proceedLock.wait();
            print("in waitToProceed() - back from wait()");
        }

        print("in waitToProceed() - leaving");
    }

    public void proceed() {
        print("in proceed() - entered");

        synchronized (proceedLock) {
            print("in proceed() - about to notifyAll()");
            proceedLock.notifyAll();
            print("in proceed() - back from notifyAll()");
        }

        print("in proceed() - leaving");
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
}
