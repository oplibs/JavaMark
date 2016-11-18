package cn.mzen.cocurrency.Ticket;

import java.util.Random;

/**
 * Created by itrek on 11/17/16.
 */
public class TicketThread extends Thread{
    private int threadid=0;
    private Random timegen=null;
    private int ticket = 5;

    public TicketThread(int ticketid){
        this.threadid=ticketid;
        this.timegen = new Random(ticketid);
    }
    public void run(){
        for (int i=0;i<10;i++)
        {
            if(ticket > 0){
                System.out.println("Thuread: "+threadid+" ticket = " + ticket--);
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
