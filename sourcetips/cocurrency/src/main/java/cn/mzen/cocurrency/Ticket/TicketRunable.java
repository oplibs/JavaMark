package cn.mzen.cocurrency.Ticket;

import java.util.Random;

/**
 * Created by itrek on 11/17/16.
 */
public class TicketRunable implements Runnable{
    private int ticket = 5;
    private Random timegen = new Random(10);
    public synchronized void run(){
        for (int i=0;i<10;i++)
        {
            if(ticket > 0){
                System.out.println("ticket = " + ticket--);
            }
            try {
                int sleeptime = this.timegen.nextInt(100);
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
