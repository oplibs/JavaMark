package cn.mzen.cocurrency;

import cn.mzen.cocurrency.Ticket.TicketThread;

/**
 * Created by itrek on 11/17/16.
 */
public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("ThreadMain");
        new TicketThread(1).start();
        new TicketThread(2).start();
        new TicketThread(3).start();

        // Random time = new Random(100);
        // for (int nc=0;nc<10;nc++){
        //     System.out.println(time.nextInt(100));
        // }
    }
}
