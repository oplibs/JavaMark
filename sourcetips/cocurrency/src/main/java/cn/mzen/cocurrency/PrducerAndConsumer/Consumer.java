package cn.mzen.cocurrency.PrducerAndConsumer;

/**
 * Created by itrek on 11/18/16.
 */
public class Consumer implements Runnable{
    private Info info = null;

    public Consumer(Info info){
        this.info = info ;
    }

    public void run(){
        for(int i=0;i<10;i++){
            this.info.get() ;
        }
    }
}