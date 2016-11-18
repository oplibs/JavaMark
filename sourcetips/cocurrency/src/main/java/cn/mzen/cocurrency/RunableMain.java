package cn.mzen.cocurrency;

import cn.mzen.cocurrency.Ticket.TicketRunable;

/**
 * Created by itrek on 11/17/16.
 */
public class RunableMain {
    public static void main(String[] args) {
        System.out.println("RunableMain");
        TicketRunable my = new TicketRunable();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
